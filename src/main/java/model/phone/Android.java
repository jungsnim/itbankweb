package model.phone;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component("camera")
class Camera
{
	String com;
	int code;
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Camera [com=" + com + ", code=" + code + "]";
	}
	
	
}
@Component
class Camera2 extends Camera
{
	public Camera2() {
		code = 200;
	}
}
@Component("com3")
class Camera3 extends Camera
{
	public Camera3() {
		code = 500;
	}
}
@Component("dmb")
class DMB
{
	int channel = 7;
	String name ="디엠비";
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "DMB [channel=" + channel + ", name=" + name + "]";
	}
	
	
}
@Component("Android")
public class Android {

	@Autowired
	@Qualifier("camera2")
	Camera cam;
	
	@Resource(name="com3")
	Camera cam3;
	
	@Autowired(required=false)
	DMB dmb;
	String name ="갤럭시";
	
	
	@Override
	public String toString() {
		return "Android [cam=" + cam + ", cam3=" + cam3 + ", dmb=" + dmb
				+ ", name=" + name + "]";
	}
	
	
	
}
