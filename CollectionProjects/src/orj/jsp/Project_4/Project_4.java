package orj.jsp.Project_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.jsp.Project_3.MObile;
import org.jsp.Project_3.Student;

public class Project_4 
{
	public static void main(String[] args)
	{
		List L=new LinkedList();
        L.add(new MObile("OPPO",12,20000.00));
        L.add(new Student("Sudhakar",31,200.00));
        L.add(new MObile("VIVO",21,30000.00));
        L.add(new Student("SuVITHA",41,500.00));
        L.add(new MObile("LENOVO",22,80000.00));
        L.add(new Student("RANI",51,700.00));
        L.add(new MObile("HTC",32,90000.00));
        L.add(new Student("TISHIKA",43,400.00));
        L.add(new MObile("ONEPLUS",12,430000.00));
        System.out.println("Student Object");
        System.out.println("------------------------------------");
        for(int i=0;i<L.size();i++)
        {
        	Object Obj=L.get(i);
        	if(Obj instanceof Student)
        	{
        		Student S=(Student)Obj;
        		System.out.println(S);
        	}
        }
        System.out.println("Student and Mobile Object");
        System.out.println("------------------------------------");
        for(int i=0;i<L.size();i++)
        {
        	Object Obj=L.get(i);
        	if(Obj instanceof Student)
        	{
        		Student S=(Student)Obj;
        		System.out.println(S);
        	}
        	else if(Obj instanceof MObile)
        	{
        		MObile M1=(MObile)Obj;
        		System.out.println(M1);
        	}
        }
        System.out.println("Student Mark is Greater then 60 : ");
        System.out.println("------------------------------------");
        for(int i=0;i<L.size();i++)
        {
        	Object Obj=L.get(i);
        	if(Obj instanceof Student)
        	{
        		Student S=(Student)Obj;
        		if(S.Smark>60)
        		{
        		System.out.println(S);
        		}
        	}
        }
        System.out.println("Student Mark is Greater then 65 and Name Start with 'S' : ");
        System.out.println("----------------------------------------------------------------");
        for(int i=0;i<L.size();i++)
        {
        	Object Obj=L.get(i);
        	if(Obj instanceof Student)
        	{
        		Student S=(Student)Obj;
        		if(S.Smark>60 && S.Student.startsWith("S"))
        		{
        		System.out.println(S);
        		}
        	}
        }
        
	}
}