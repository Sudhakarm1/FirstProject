package org.jsp.Project_9;
import java.util.*;
public class Project_9 implements Comparator<Double> 
{
	public static void main(String[] args) 
	{
		Set S=new TreeSet(new Project_9());
		S.add(123.12312);
		S.add(5345.534);
		S.add(765.4534);
		S.add(3452.5646);
		S.add(989.879);
		S.add(31212.45654);
		System.out.println(S);
	}
	@Override
	public int compare(Double o1, Double o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}

}
