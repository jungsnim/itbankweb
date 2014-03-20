package model.tank;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Tank {
	@Resource(name="getBullet")
	ITankParts bullet;
	@Resource(name="getChain")
	ITankParts chain;
	@Resource(name="getBody")
	ITankParts body;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bullet.getName()+"\n"+chain.getName()+"\n"+body.getName();
		//return "탱크있다";
	}
}
