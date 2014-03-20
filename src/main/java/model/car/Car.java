package model.car;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

public interface Car {
	public void Data();
}
@Component
class F1 implements Car
{
	@Resource(name="tireC")
	Parts tire;
	public void Data() {
		// TODO Auto-generated method stub
		System.out.println(tire.getName());
	}
}
interface Parts
{
	public String getName();
}
@Component
class TireC implements Parts
{
	public String getName() {
		// TODO Auto-generated method stub
		return "타이어";
	}
}