package org.jsp.Project_18;
import java.util.*;
import java.util.Map.Entry;
public class EmployeeManagement 
{
	Map<Integer,String> M=new HashMap<Integer,String>();
	Scanner Sc=new Scanner(System.in);
	public void ReadData()
	{
		System.out.println("-------------------Read Operation Start----------------");
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Employee Name : ");
			String name=Sc.nextLine();
			System.out.println("Enter Employee Id : ");
			int Id=Sc.nextInt();
			Sc.nextLine();
			if(M.containsKey(Id))
			{
				M.put(Id, name);
			}
			else
			{
			M.put(Id, name);
			}
		}
			System.out.println(M);
			System.out.println("-------------------Read Operation End----------------");
    }
	Set<Entry<Integer,String>> S=M.entrySet();
	Iterator<Entry<Integer,String>> itr=S.iterator();
	public void Display()
	{
		System.out.println("-------------------Display Operation Start----------------");
		itr=S.iterator();
		while(itr.hasNext())
		{
			Entry<Integer,String> E=itr.next();
			System.out.println(E.getKey()+"\t\t"+E.getValue());
		}
		System.out.println("-------------------Display Operation end----------------");
	}
	public void Search()
	{
		System.out.println("-------------------Search Operation Start----------------");
		itr=S.iterator();
		System.out.println("Enter Employee Id : ");
		int Id=Sc.nextInt();
		while(itr.hasNext())
		{
			Entry<Integer,String> E=itr.next();
			if(E.getKey()==Id)
			{
				System.out.println(E);
				//Display();
			}
			else
			{
			//itr.next();
			}
		}
		System.out.println("-------------------Search Operation end----------------");
	}
	public void Remove()
	{
		System.out.println("-------------------Remove Operation Start----------------");
		itr=S.iterator();
		System.out.println("Enter Employee Remove Id : ");
		int Id1=Sc.nextInt();
		while(itr.hasNext())
		{
			Entry<Integer,String> E=itr.next();
			if(E.getKey()==Id1)
			{
				//M.remove(E.getKey());
				//System.out.println("------------");
				M.remove(E.getKey());
				M.remove(E.getValue());
				Display();
				break;
			}
			//Display();
			//System.out.println("------end------");
		}
		System.out.println("-------------------Remove Operation End----------------");
	}
	
	public void Name()
	{
		System.out.println("-------------------Name Operation Start----------------");
		itr=S.iterator();
		while(itr.hasNext())
		{
			Entry<Integer,String> E=itr.next();
			System.out.println(E.getValue());
		}
		System.out.println("-------------------Name Operation End----------------");
	}
	public void Id()
	{
		System.out.println("-------------------Id Operation Start----------------");
		itr=S.iterator();
		while(itr.hasNext())
		{
			Entry<Integer,String> E=itr.next();
			System.out.println(E.getKey());
		}
		System.out.println("-------------------Id Operation End----------------");
	}
 }