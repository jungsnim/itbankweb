package model;

public class Ban {
	String school,ban;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	@Override
	public String toString() {
		return "Ban [school=" + school + ", ban=" + ban + "]";
	}
	
	
}
