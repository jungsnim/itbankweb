package model;

public class MingDDo {

	Mem mm;
	Jumsu jum;
	Ban ban;
	
	public MingDDo() {
		// TODO Auto-generated constructor stub
	}
	public MingDDo(Mem mm, Jumsu jum, Ban ban) {
		super();
		this.mm = mm;
		this.jum = jum;
		this.ban = ban;
	}
	public Mem getMm() {
		return mm;
	}
	public void setMm(Mem mm) {
		this.mm = mm;
	}
	public Jumsu getJum() {
		return jum;
	}
	public void setJum(Jumsu jum) {
		this.jum = jum;
	}
	public Ban getBan() {
		return ban;
	}
	public void setBan(Ban ban) {
		this.ban = ban;
	}
	@Override
	public String toString() {
		return "MingDDo [mm=" + mm + "\n"+", jum=" + jum +"\n"+ ", ban=" + ban + "]";
	}
	
	
}
