import bean.*;
import lifecycle.Pepsi;
import lifecycle.Rolls;
import lifecycle.Samosa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        String Config_loc= "config.xml";
        AbstractApplicationContext context= new ClassPathXmlApplicationContext(Config_loc);

        //this for simple one
        Student stu = (Student) context.getBean("student1");
        stu.display();
        Student stu2 = (Student) context.getBean("student2");
        stu2.display();


        //this for collections
        Emp emp = (Emp) context.getBean("emp1");
        emp.display();
        System.out.println(emp.getPhones().getClass());


          //this is for reference injecting
        A temp = (A) context.getBean("aref");
        System.out.println(temp.getX());
        System.out.println(temp.getOb().getY());
        System.out.println(temp);


            //this is for constructor injection
        Person person= (Person) context.getBean("person");
        System.out.println(person);
//


        // this is for ambiguity
        Addition add = (Addition) context.getBean("add");
        add.doSum();


        //this is implementing lifecycle methods using xml
        Samosa samosa= (Samosa) context.getBean("samosa");
        System.out.println(samosa);
        context.registerShutdownHook();


        //this is implementing lifecycle methods using interface
        System.out.println("___________________________________________");
        Pepsi pepsi = (Pepsi) context.getBean("p1");
        System.out.println(pepsi);

        //this is implementing lifecycle methods using interface
        System.out.println("___________________________________________");
        Rolls rolls = (Rolls) context.getBean("r1");
        System.out.println(rolls);
    }
}
