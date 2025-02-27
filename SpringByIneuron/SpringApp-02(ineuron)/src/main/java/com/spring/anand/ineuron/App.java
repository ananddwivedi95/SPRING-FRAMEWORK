package com.spring.anand.ineuron;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/anand/ineuron/config.xml");
        //JavaCources jc=context.getBean("javac",JavaCources.class);
        CourcesSelection select=context.getBean("cource",CourcesSelection.class);
        select.selectCource();
    }
}
