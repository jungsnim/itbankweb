package model.car;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Car_Config {
	
	@Resource(name="tire")
	Tire tire;
	@Bean
	public Tire Nexen()
	{
		tire.name="nexen";
		return tire;//new Tire(10,"넥센타이어");
	}
	
	@Bean
	public Tire Hankook()
	{
		tire.name="한국타이어";
		return tire;//new Tire(10,"넥센타이어");
	}
	@Bean(autowire = Autowire.BY_NAME)
	public Sport scoope()
	{
		return new Sport();
	}
	
}
