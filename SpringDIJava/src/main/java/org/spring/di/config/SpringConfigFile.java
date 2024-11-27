package org.spring.di.config;

import org.spring.di.beans.Address;
import org.spring.di.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean
    public Address createAddress(){
        Address address = new Address();
        address.setCity("Jamui");
        address.setHouseno(100);
        address.setPincode(27519);
        return address;
    }
    @Bean
    public Student getStudent(){
        Student student = new Student();
        student.setName("Chadnan");
        student.setRollno(111);
        student.setAddress(createAddress());
        return student;
    }

}
