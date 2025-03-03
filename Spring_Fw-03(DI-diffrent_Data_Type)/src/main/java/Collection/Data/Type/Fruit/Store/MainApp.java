package Collection.Data.Type.Fruit.Store;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  ApplicationContext context=new ClassPathXmlApplicationContext("Collection/Data/Type/Fruit/Store/config.xml");
	   FruitPrice fruit=context.getBean("price",FruitPrice.class);
	   System.out.print(fruit);

	}

}
