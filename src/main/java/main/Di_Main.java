package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import di.Dao;
import service.OracleDao;
import model.Bean;

public class Di_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bean bb = new Bean();
		
		Resource resource = new ClassPathResource("xml/di_main.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Dao dao = (Dao)factory.getBean("oracleDao");
		
		dao.insert(bb);
	}

}
