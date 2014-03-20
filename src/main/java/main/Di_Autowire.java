package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import di.Dao;
import service.OracleDao;
import model.Bean;
import model.MingDDo;

public class Di_Autowire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bean bb = new Bean();
		
		Resource resource = new ClassPathResource("xml/di_Autowire.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		MingDDo mm = factory.getBean("mingDDo",MingDDo.class);
		
		System.out.println(mm);
		
		MingDDo mm2 = factory.getBean("mingDDo2",MingDDo.class);
		System.out.println(mm2);
		
		MingDDo mm3 = factory.getBean("mingDDo3",MingDDo.class);
		System.out.println(mm3);
	}

}
