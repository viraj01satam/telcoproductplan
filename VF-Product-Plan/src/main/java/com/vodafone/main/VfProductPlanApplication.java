package com.vodafone.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//Test
@SpringBootApplication(scanBasePackages= {"planDetail.com.vodafone"})
public class VfProductPlanApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(VfProductPlanApplication.class, args);
	}

}
