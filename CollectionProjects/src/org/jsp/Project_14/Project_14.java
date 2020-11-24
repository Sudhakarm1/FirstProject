package org.jsp.Project_14;
import java.util.*;
public class Project_14 implements Comparator<Double>
{
	public static void main(String[] args) 
	{
		ArrayList<Double> AL=new ArrayList<Double>();
		AL.add(123.4324);
		AL.add(433.4234);
		AL.add(1323.2342);
		AL.add(653.4324);
		AL.add(763.645);
		AL.add(1233.7567);
		AL.add(3.97897);
		AL.add(23.34);
		AL.add(13.765);
		Collections.sort(AL,new Project_14());
		for(int i=0;i<AL.size();i++)
		{
		System.out.println(AL.get(i));
		}
	}
	@Override
	public int compare(Double o1, Double o2) 
	{
		return o1.compareTo(o2);
	}
}