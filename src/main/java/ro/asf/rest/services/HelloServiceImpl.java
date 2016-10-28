package ro.asf.rest.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ro.asf.rest.dao.HelloDAO;

@Service
@Transactional
public class HelloServiceImpl implements HelloService {

	@Autowired
	private HelloDAO helloDAO;

	@Override
	public Date getSysdate() throws Exception {
		return helloDAO.getSysdate();
	}

}
