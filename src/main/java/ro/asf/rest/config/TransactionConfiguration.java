package ro.asf.rest.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
public class TransactionConfiguration {

	@Autowired
	private DataSource dataSource;

	@Bean
	public DataSourceTransactionManager transactionManager() {
		DataSourceTransactionManager dstm = new DataSourceTransactionManager(dataSource);
		return dstm;
	}
}
