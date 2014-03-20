package model.tank;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("xml/anno_tank.xml")
public class Tank_Config {

	@Bean
	public ITankParts getBullet()
	{
		return new TBullet();
	}
	@Bean
	public ITankParts getBody()
	{
		return new TBody();
	}
	@Bean
	public ITankParts getChain()
	{
		return new TChain();
	}
}
