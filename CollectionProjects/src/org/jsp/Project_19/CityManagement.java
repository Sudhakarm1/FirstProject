package org.jsp.Project_19;
import java.util.*;
import java.util.Map.Entry;;
public class CityManagement 
{
	Scanner Sc=new Scanner(System.in);
	Map<String,Integer> M=new HashMap<String,Integer>();
	Set<Entry<String,Integer>> S=M.entrySet();
	Iterator<Entry<String,Integer>> itr=S.iterator();
	public void Add()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter City Name");
			String Str=Sc.nextLine();
			System.out.println("Enter City Weather");
			int Id=Sc.nextInt();
			Sc.nextLine();
			M.put(Str,Id);
		}
	}
	public void Display()
	{
		System.out.println("CityName"+"\t"+"City Id");
		System.out.println("-----------------------------");
		itr=S.iterator();
		while(itr.hasNext())
		{
			Entry<String,Integer> E=itr.next();
		   System.out.println(E.getKey()+"\t\t"+E.getValue());
	     }
	}
	public void Search()
	{
		System.out.println("Enter City Name");
		String Str=Sc.nextLine();
		System.out.println("CityName"+"\t"+"City Id");
		System.out.println("-----------------------------");
		itr=S.iterator();
		while(itr.hasNext())
		{
			Entry<String,Integer> E=itr.next();
		   if(E.getKey().equalsIgnoreCase(Str))
		   {
		   System.out.println(E.getKey()+"\t\t"+E.getValue());
	       }
	    }
	}
		public void Remove()
		{
			System.out.println("Enter City Name");
			String Str=Sc.nextLine();
			//System.out.println("CityName"+"\t"+"City Id");
			//System.out.println("---------------------------- -");
			itr=S.iterator();
			while(itr.hasNext())
			{
			   Entry<String,Integer> E=itr.next();
			   if(E.getKey().equalsIgnoreCase(Str))
			   {
			      M.remove(E.getKey());
			      M.remove(E.getValue());
			      Display();    
			      break;
		       }
			   else
			   {
				  //E = itr.next();
			   }
			}
		}
		public void CityName()
		{
			System.out.println("CityName"+"\t"+"City Id");
			System.out.println("-----------------------------");
			itr=S.iterator();
			while(itr.hasNext())
			{
				Entry<String,Integer> E=itr.next();
			   System.out.println(E.getKey());
		     }
		}
		public void CityId()
		{
			System.out.println("CityName"+"\t"+"City Id");
			System.out.println("-----------------------------");
			itr=S.iterator();
			while(itr.hasNext())
			{
				Entry<String,Integer> E=itr.next();
			   System.out.println(E.getValue());
		     }
		}
 }
