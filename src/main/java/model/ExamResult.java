package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class ExamCompare implements Comparator<Exam> {
	public int compare(Exam o1, Exam o2) {

		int a = o1.getJum();
		int b = o2.getJum();

		if(a > b) {
			return -1;
		}else if(a<b) {
			return 1;
		}else {
			return 0;
		}
	}
}


	
public class ExamResult {

	public ExamResult(Exam ex1,Exam ex2 ,Exam ex3,Exam ex4,Exam ex5 ) {
		
		examList.add(ex1);
		examList.add(ex2);
		examList.add(ex3);
		examList.add(ex4);
		examList.add(ex5);
		
		Collections.sort(examList,new ExamCompare());
	}
	
	ArrayList<Exam> examList = new ArrayList<Exam>();
	
	public void print()
	{
		Iterator<Exam> it = examList.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next().toString());
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
