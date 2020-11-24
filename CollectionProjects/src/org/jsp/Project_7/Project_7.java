package org.jsp.Project_7;

import java.util.*;

public class Project_7 implements Comparator<Integer>
{
	public static void main(String[] args) 
	{
		Set S=new TreeSet(new Project_7());
		S.add(123);
		S.add(12);
		S.add(53);
		S.add(76);
		S.add(134);
		S.add(765);
		//S.add("ads");
		//Collections.sort(S);
		System.out.println(S);
	}
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}
}
