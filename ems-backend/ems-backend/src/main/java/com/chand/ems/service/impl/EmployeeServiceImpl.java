package com.chand.ems.service.impl;

import com.chand.ems.dto.EmployeeDto;
import com.chand.ems.exception.ResourceNotFoundException;
import com.chand.ems.mapper.EmployeeMapper;
import com.chand.ems.repository.EmployeeRepository;
import com.chand.ems.service.EmployeeService;
import com.chand.ems.entity.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee=employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee emp=employeeRepository.findById(employeeId).orElseThrow(()->new ResourceNotFoundException("Employee doest not exist with given id: "+employeeId));
        return EmployeeMapper.mapToEmployeeDto(emp);
    }

    @Override
    public List<EmployeeDto> getEmployees() {
        List<Employee> allEmp=employeeRepository.findAll();
        return allEmp.stream().map((employee)->EmployeeMapper.mapToEmployeeDto(employee)).collect(Collectors.toList());
    }

    @Override
    public EmployeeDto updateEmployee(Long employeeId, EmployeeDto employeeDto) {
        Employee emp=employeeRepository.findById(employeeId).orElseThrow(()->new ResourceNotFoundException("Employee doest not exist with given id: "+employeeId));
        emp.setFirstName(employeeDto.getFirstName());
        emp.setLastName(employeeDto.getLastName());
        emp.setEmail(employeeDto.getEmail());
        Employee updatedEmp=employeeRepository.save(emp);
        return EmployeeMapper.mapToEmployeeDto(updatedEmp);
    }

    @Override
    public EmployeeDto deleteEmployee(Long employeeId) {
        Employee emp=employeeRepository.findById(employeeId).orElseThrow(()->new ResourceNotFoundException("Employee doest not exist with given id: "+employeeId));
        employeeRepository.delete(emp);
        return EmployeeMapper.mapToEmployeeDto(emp);
    }
}
