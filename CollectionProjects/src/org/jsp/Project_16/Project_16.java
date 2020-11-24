package org.jsp.Project_16; 
import java.util.*;
import org.jsp.Project_10.Student;
public class Project_16 
{
	public static void main(String[] args) 
	{
		//String Sname,int Sid,double Smarks
		ArrayList<Student> AL=new ArrayList<Student>();
		AL.add(new Student("sudhakar",12,43221.67312));
		AL.add(new Student("Kanish",112,321.982312));
		AL.add(new Student("rani",321,7821.762312));
		AL.add(new Student("suvitha",21,761.12312));
		AL.add(new Student("murugan",43,231221.12312));
		AL.add(new Student("asfa",76,2131.12312));
        Collections.sort(AL,new Student());
        for(int i=0;i<AL.size();i++)
        {
        	System.out.println(AL.get(i));
        }
	}
}