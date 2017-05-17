package hsbc.config;

import hsbc.model.Animal;
import hsbc.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
public class MainConfiguration {  
	
	@Value("${application.name}")
	private String appName;
	
	@Value("${application.age}")
	private int age;
	
	@Bean
	public Employee setEmployee() {
		
		return new Employee(appName + " " + animal.getName(), age);
	}
	
	@Autowired
	public Animal animal;

}
