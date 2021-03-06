package ro.asf.rest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:app.properties")
@EnableTransactionManagement
@ComponentScan(basePackages = "ro.asf.rest")
public class AppConfig {
	
}