package model;

public class Mem extends Person{
	String name,tel;
	int id;
	public Mem() {
		// TODO Auto-generated constructor stub
	}
	
	public Mem(String name, String tel, int id) {
		super();
		this.name = name;
		this.tel = tel;
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Mem [name=" + name + ", tel=" + tel + ", id=" + id + "]";
	}
	
	
}
