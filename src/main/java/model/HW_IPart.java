package model;

import org.springframework.stereotype.Component;

public interface HW_IPart {

}
@Component("tire")
class PartTire implements HW_IPart{
	String name="타이어";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PartTire [name=" + name + "]";
	}
	
}
@Component("booster")
class PartBooster implements HW_IPart{
	String name="부스터";
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PartBooster [name=" + name + "]";
	}
	
}
@Component("trunk")
class PartTrunk implements HW_IPart{
	String name="트렁크";
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PartTrunk [name=" + name + "]";
	}
	
}
@Component("sproof")
class PartSoundProof implements HW_IPart{
	String name="방음벽";
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PartSoundProof [name=" + name + "]";
	}
	
}