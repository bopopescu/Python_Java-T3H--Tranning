package t3hExample.xmlConfig.Apprunner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

public class apprunner {

    public static void main(String[] args) {
        ApplicationContext contextXml = new ClassPathXmlApplicationContext("application.xml");


        


    }
}
