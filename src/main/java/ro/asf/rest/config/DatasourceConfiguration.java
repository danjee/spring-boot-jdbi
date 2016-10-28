package ro.asf.rest.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DatasourceConfiguration {

	@Value(value = "${jdbc.driver}")
	private String jdbcDriver;

	@Value(value = "${jdbc.url}")
	private String jdbcUrl;

	@Value(value = "${jdbc.username}")
	private String jdbcUsername;

	@Value(value = "${jdbc.password}")
	private String jdbcPassword;

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean(destroyMethod = "close")
	public DataSource datasource() {
		final HikariDataSource dataSource = new HikariDataSource();
		dataSource.setDriverClassName(jdbcDriver);
		dataSource.setJdbcUrl(jdbcUrl);
		dataSource.setUsername(jdbcUsername);
		dataSource.setPassword(jdbcPassword);
		dataSource.setIdleTimeout(600000);
		dataSource.setMinimumIdle(0);
		dataSource.setMaximumPoolSize(5);
		dataSource.setConnectionTimeout(180000);
		return dataSource;
	}
}
