package model.computer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface DeskTop extends Computer{
	
	public String getName();
}

@Component
class Samsung implements DeskTop,NoteBook
{
	@Autowired
	MainBoard board;
	
	public String getName() {
		// TODO Auto-generated method stub
		return "삼성";
	}
	public MainBoard getBoard() {
		// TODO Auto-generated method stub
		return board;
	}
}
@Component
class Lg implements DeskTop
{
	public String getName() {
		// TODO Auto-generated method stub
		return "엘쥐";
	}
	public MainBoard getBoard() {
		// TODO Auto-generated method stub
		return new MainBoard("엘지메인보드");
	}
}