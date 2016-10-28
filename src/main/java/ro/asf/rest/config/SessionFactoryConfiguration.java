package ro.asf.rest.config;

import javax.sql.DataSource;

import org.skife.jdbi.v2.spring.DBIFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SessionFactoryConfiguration {

	@Autowired
	private DataSource dataSource;
	
	@Bean
	public DBIFactoryBean dbiFactory(){
		DBIFactoryBean factory = new DBIFactoryBean(dataSource);
		return factory;
	}
	
}
