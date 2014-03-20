package model.computer;

import org.springframework.stereotype.Component;

@Component
public interface NoteBook extends Computer{
	public String getName();
}
