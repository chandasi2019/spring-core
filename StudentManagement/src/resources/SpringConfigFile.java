package resources;

import com.chand.spring.learn.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean
    public Student student1(){
//        Student stuObj=new Student();
//        stuObj.setName("Ram");
//        stuObj.setAge(22);
//        return stuObj;
        return new Student();
    }
}
