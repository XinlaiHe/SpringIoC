package hsbc.aspect;

import hsbc.service.CustomService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CustomAspect {
	
	private static Logger log = LoggerFactory.getLogger(CustomService.class);
	
	@Before("execution(* hsbc.service.CustomService.*(..))")
    public void before(JoinPoint jp){
		log.info("Start " + jp.getSignature().getName() + "Method !");
    }
    
    @After("execution(* hsbc.service.CustomService.*(..))")
    public void after(JoinPoint jp){
    	log.info("Finish " + jp.getSignature().getName() + "Method !");
    }

}
