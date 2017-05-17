package hsbc.service;

import hsbc.model.Employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CustomService {
	private static Logger log = LoggerFactory.getLogger(CustomService.class);
	
	@Autowired
	private Employee employee;
	
	public void doSomething() {
		log.info("Hello" + " " + employee.getName() + " " + employee.getAge());
	}
}
