package org.jsp.Project_10;

import java.util.*;

public class Student implements Comparator<Student>
{
	public String Sname;
	public int Sid;
	public double Smarks;
	public Student(String Sname,int Sid,double Smarks)
	{
		this.Sid=Sid;
		this.Smarks=Smarks;
		this.Sname=Sname;
	}
	public Student()
	{
		
	}
	public String toString()
	{
		return Sname+"\t\t"+Sid+"\t\t"+Smarks;
	}
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return ((String)o1.Sname).compareTo((String)o2.Sname);
	}
}
