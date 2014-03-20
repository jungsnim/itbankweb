package model;

public class Jumsu {
	int kor,eng,mat;

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	@Override
	public String toString() {
		return "Jumsu [kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
	
	
}
