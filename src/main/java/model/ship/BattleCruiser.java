package model.ship;

public class BattleCruiser
{
	int air;
	String name;
	public BattleCruiser(int air, String name) {
		super();
		this.air = air;
		this.name = name;
	}
	@Override
	public String toString() {
		return "BattleCruiser [air=" + air + ", name=" + name + "]";
	}
	
}