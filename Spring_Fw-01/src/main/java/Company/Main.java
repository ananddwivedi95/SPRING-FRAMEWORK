package Company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Address ad= new Address("prayagraj","UP",1288); Employee emp= new
		 * Employee("anand","an98",ad); System.out.println(emp.toString());
		 */
		
		//using IOC container
		ApplicationContext context= new ClassPathXmlApplicationContext("Company/config.xml");
		Employee epp=context.getBean("emp",Employee.class);
		System.out.println(epp.toString());
		System.out.println(context.getBean("emp1",Employee.class));
		
		//checking its HashCode for verify to both object are different but referenced same Class(Address)
		System.out.println(epp.hashCode());
		System.out.println(context.getBean("emp1",Employee.class).hashCode());
	}

}
