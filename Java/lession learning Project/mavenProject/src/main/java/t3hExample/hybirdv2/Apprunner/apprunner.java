package t3hExample.hybirdv2.Apprunner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class apprunner {

    public static void main(String[] args) {
            ApplicationContext contextXml = new ClassPathXmlApplicationContext("applicationHybridV2.xml");

    }
}
