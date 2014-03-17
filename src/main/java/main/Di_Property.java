package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import di.Dao;
import service.OracleDao;
import model.Bean;
import model.ExamResult;
import model.Mem;

public class Di_Property {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bean bb = new Bean();
		
		Resource resource = new ClassPathResource("xml/di_property.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		ExamResult exRes = (ExamResult)factory.getBean("examResult");
		exRes.print();
	}

}
