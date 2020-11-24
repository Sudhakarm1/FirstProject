package org.jsp.Project_17;
import java.util.*;
import org.jsp.Project_10.Student;
public class Project_17 
{
	public static void main(String[] args) 
	{
		List<Student> L=new ArrayList<Student>();
		L.add(new Student("sudhakar",12,43221.67312));
		L.add(new Student("kanish",112,321.982312));
		L.add(new Student("rani",321,7821.762312));
		L.add(new Student("suvitha",21,761.12312));
		L.add(new Student("murugan",43,231221.12312));
		L.add(new Student("asfa",76,2131.12312));
		Collections.sort(L,new Student());
		for(int i=0;i<L.size();i++)
		{
		System.out.println(L.get(i));
		}
	}
}