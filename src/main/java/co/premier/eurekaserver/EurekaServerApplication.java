package co.premier.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		System.setProperty ("eureka.Environment ", "Test de microservicios");
		System.setProperty ("eureka.DataCenter ", "Samtel");
		SpringApplication.run(EurekaServerApplication.class, args);
	}
	
}
