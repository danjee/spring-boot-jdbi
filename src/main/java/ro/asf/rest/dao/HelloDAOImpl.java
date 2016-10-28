package ro.asf.rest.dao;

import java.util.Date;
import java.util.Map;

import org.skife.jdbi.v2.Handle;
import org.skife.jdbi.v2.Query;
import org.skife.jdbi.v2.spring.DBIFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HelloDAOImpl implements HelloDAO {

	@Autowired
	private DBIFactoryBean dbi;
	
	@Override
	public Date getSysdate() throws Exception {
		Handle h = dbi.getObject().open();
		Query<Map<String, Object>> query = h.createQuery("select sysdate from dual");
		return (Date) query.first().values().iterator().next();
	}

}
