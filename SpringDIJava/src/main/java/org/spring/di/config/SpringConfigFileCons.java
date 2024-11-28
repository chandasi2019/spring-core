package org.spring.di.config;

import org.spring.di.beans.AddressNew;
import org.spring.di.beans.StudentNew;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfigFileCons {
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public AddressNew createAddress(){
        return new AddressNew(200,"Delhi",27519);
    }
    @Bean
    public StudentNew getStudent(){
        return new StudentNew(222,"Burbage Cir",createAddress());
    }
}
