package model;

public class Exam {
	Mem mem;
	int jum;
	
	public Exam() {
		// TODO Auto-generated constructor stub
	}
	public Exam(Mem mem, int jum) {
		super();
		this.mem = mem;
		this.jum = jum;
	}
	public Mem getMem() {
		return mem;
	}
	public void setMem(Mem mem) {
		this.mem = mem;
	}
	public int getJum() {
		return jum;
	}
	public void setJum(int jum) {
		this.jum = jum;
	}
	@Override
	public String toString() {
		return "Exam [mem=" + mem + ", jum=" + jum + "]";
	}
	
	
}
