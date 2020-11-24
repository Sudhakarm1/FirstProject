package org.jsp.project_8;

import java.util.Comparator;
import java.util.*;

public class Project_8 implements Comparator<String>
{

	public static void main(String[] args) 
	{
		Set S=new TreeSet(new Project_8());
		S.add("sudhakar");
		S.add("kabudasn");
		S.add("czcsd");
		S.add("qewqw");
		S.add("xcvx");
		S.add("tyuty");
		S.add("piup");
		System.out.println(S);
	}

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}

}
