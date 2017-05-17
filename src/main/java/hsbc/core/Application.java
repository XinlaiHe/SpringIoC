package hsbc.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import hsbc.service.CustomService;

public class Application {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("main.xml");
		CustomService cs = context.getBean(CustomService.class);
		cs.doSomething();
	}

}
