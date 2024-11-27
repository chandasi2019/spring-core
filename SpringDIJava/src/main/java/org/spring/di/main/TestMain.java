package org.spring.di.main;
import org.spring.di.beans.Student;
import org.spring.di.beans.StudentNew;
import org.spring.di.config.SpringConfigFile;
import org.spring.di.config.SpringConfigFileCons;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student std = (Student) context.getBean(Student.class);
        std.display();
        ApplicationContext consContest = new AnnotationConfigApplicationContext(SpringConfigFileCons.class);
        StudentNew studentNew = (StudentNew) consContest.getBean(StudentNew.class);
        studentNew.display();
    }
}