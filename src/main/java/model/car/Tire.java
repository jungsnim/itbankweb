package model.car;

import org.springframework.stereotype.Component;

@Component
public class Tire {
	int size;
	String name;
	public Tire() {
		// TODO Auto-generated constructor stub
	}
	
	public Tire(int size, String name) {
		super();
		this.size = size;
		this.name = name;
	}

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Tire [size=" + size + ", name=" + name + "]";
	}
	
}
class Engine{
	
	public Engine() {
		// TODO Auto-generated constructor stub
	}
	
	public Engine(int hp, int torque, String name) {
		super();
		this.hp = hp;
		this.torque = torque;
		this.name = name;
	}

	int hp,torque;
	String name;
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getTorque() {
		return torque;
	}
	public void setTorque(int torque) {
		this.torque = torque;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Engine [hp=" + hp + ", torque=" + torque + ", name=" + name
				+ "]";
	}
	
}

class SunRoof{
	int size;
	String color;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "SunRoof [size=" + size + ", color=" + color + "]";
	}
	
}
class SmartKey{
	int channel;

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public String toString() {
		return "SmartKey [channel=" + channel + "]";
	}
	
}