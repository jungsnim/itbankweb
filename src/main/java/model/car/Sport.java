package model.car;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

class Suv
{
	Tire tt;
	Engine ee;
	SunRoof sr;
	String name="SUV카";
	public Tire getTt() {
		return tt;
	}
	public void setTt(Tire tt) {
		this.tt = tt;
	}
	public Engine getEe() {
		return ee;
	}
	public void setEe(Engine ee) {
		this.ee = ee;
	}
	public SunRoof getSr() {
		return sr;
	}
	public void setSr(SunRoof sr) {
		this.sr = sr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Suv [tt=" + tt + ", ee=" + ee + ", sr=" + sr + ", name=" + name
				+ "]";
	}
	
	
}
public class Sport {
	
	@Resource(name="tire")
	Tire tt;
	Engine ee;
	SmartKey sk;
	String name="스포츠카";
	public Tire getTt() {
		return tt;
	}
	public void setTt(Tire tt) {
		this.tt = tt;
	}
	public Engine getEe() {
		return ee;
	}
	public void setEe(Engine ee) {
		this.ee = ee;
	}
	public SmartKey getSk() {
		return sk;
	}
	public void setSk(SmartKey sk) {
		this.sk = sk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Sport [tt=" + tt + ", ee=" + ee + ", sk=" + sk + ", name="
				+ name + "]";
	}
	
	
}
