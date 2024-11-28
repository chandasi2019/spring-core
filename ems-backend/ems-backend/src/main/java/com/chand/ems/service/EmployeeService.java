package com.chand.ems.service;

import com.chand.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);
    List<EmployeeDto> getEmployees();
    EmployeeDto updateEmployee(Long employeeId,EmployeeDto employeeDto);
    EmployeeDto deleteEmployee(Long employeeId);
}
