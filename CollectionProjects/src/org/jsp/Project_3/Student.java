package org.jsp.Project_3;

public class Student 
{
	public String Student;
	public int Sid;
	public double Smark;
	public Student(String Student,int Sid,double Smark)
	{
		this.Student=Student;
		this.Sid=Sid;
		this.Smark=Smark;
	}
	public String toString()
	{
		return Student+"\t\t"+Sid+"\t\t"+Smark;
	}

}
