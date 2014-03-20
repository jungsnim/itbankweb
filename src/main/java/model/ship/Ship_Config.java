package model.ship;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/xml/anno_car.xml")
public class Ship_Config {
	
	@Bean
	public BattleCruiser clock_1()
	{
		return new BattleCruiser(10,"뭘바래");
	}

}

