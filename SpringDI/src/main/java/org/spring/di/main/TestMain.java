package org.spring.di.main;
import org.spring.di.beans.Student;
import org.spring.di.beans.StudentNew;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student std = (Student) context.getBean("stdId");
        std.display();

        StudentNew studentNew = (StudentNew) context.getBean("stdNewId");
        studentNew.display();
    }
}