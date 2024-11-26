import com.chand.spring.learn.beans.Employee;
import com.chand.spring.learn.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import resources.ComponentScanConfig;
import resources.SpringConfigFile;

public class SpringMainTest {
    public static void main(String[] args) {
        //1.Using XML configuration
        //String path="/resources/applicationContext.xml";
        //ApplicationContext context = new ClassPathXmlApplicationContext(path);

        //2. Using JAVA configuration
        //ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        //Student chandan=(Student) context.getBean("student1");

        //3. Annotations configuration using XML
        //String path="/resources/applicationContext.xml";
        //ApplicationContext context = new ClassPathXmlApplicationContext(path);
        //Employee empObj=(Employee) context.getBean("employee");
        //empObj.display();

        //4. Annotation configuration using JAVA
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        Employee empObj=(Employee) context.getBean("employee");
        empObj.display();
    }
}
