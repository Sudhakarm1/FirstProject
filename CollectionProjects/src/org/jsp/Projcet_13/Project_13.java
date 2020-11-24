package org.jsp.Projcet_13;
import java.util.*;
public class Project_13 implements Comparator<Integer>
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> AL=new ArrayList<Integer>();
		AL.add(123);
		AL.add(433);
		AL.add(1323);
		AL.add(653);
		AL.add(763);
		AL.add(1233);
		AL.add(3);
		AL.add(23);
		AL.add(13);
		Collections.sort(AL,new Project_13());
		for(int i=0;i<AL.size();i++)
		{
		System.out.println(AL.get(i));
		}
	}
	@Override
	public int compare(Integer o1, Integer o2) 
	{
		return o1-o2;
	}
}
