package org.jsp.Project_21;
import java.util.*;
import java.util.Map.Entry;
public class CitizienManagement 
{
	Scanner Sc=new Scanner(System.in);
	Map<Integer,ArrayList<Citiziens>> M=new HashMap<Integer,ArrayList<Citiziens>>();
	List<Citiziens> values = new ArrayList<Citiziens>();
	public void add()
	{
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter voter Id");
			int Id=Sc.nextInt();
			System.out.println("Enter voter name");
			String Name=Sc.nextLine();
			Sc.nextLine();
			System.out.println("Enter voter Age");
			int Age=Sc.nextInt();
			Sc.nextLine();
			values.add(new Citiziens(Name,Age));
			M.put(Id,(ArrayList<Citiziens>) values);
		}
		System.out.println(M);
	}
	Set<Entry<Integer,ArrayList<Citiziens>>> S=M.entrySet();
	Iterator<Entry<Integer,ArrayList<Citiziens>>> itr=S.iterator();
	public void Display2()
	{
		itr=S.iterator();
		int i=0;
		while(itr.hasNext())
		{
		Object Obj=values.get(i);
		Entry<Integer, ArrayList<Citiziens>> E=itr.next();
		if(Obj instanceof Citiziens)
		{
		Citiziens C=(Citiziens)Obj;
		System.out.println(E.getKey()+"\t"+C);
		i++;
	    }
		}
	}
	public void Display()
	{
		itr=S.iterator();
		int i=0;
		while(itr.hasNext())
		{
		Object Obj=values.get(i);
		Entry<Integer, ArrayList<Citiziens>> E=itr.next();
		if(values.get(i).Cage>=25 && values.get(i).Cage<=25)
		{
		  Citiziens C=(Citiziens)Obj;
		  values.set(i,new Citiziens("ad",12));
		  System.out.println(E.getKey()+"\t"+values);
		  i++;
		}
		else
		{
			i++;
		}
		}
	}
	public void Display1()
	{   
		itr=S.iterator();
		int i=0;
		while(itr.hasNext())
		{
		Entry<Integer, ArrayList<Citiziens>> E=itr.next();
		if(values.get(i).Cname.startsWith("A"))
		{
		    System.out.println(E.getKey()+"\t\t"+values.get(i));
		   i++;
		}
		else
		{
			i++;
		}
	}
	}
}