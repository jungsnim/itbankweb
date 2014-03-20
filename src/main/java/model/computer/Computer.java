package model.computer;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

public interface Computer {
	public String getName();
	
	
	public MainBoard getBoard();
}
@Component
class MainBoard
{
	String name="그냥메인보드";

	public MainBoard() {
		// TODO Auto-generated constructor stub
	}
	public MainBoard(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MainBoard [name=" + name + "]";
	}
	
}