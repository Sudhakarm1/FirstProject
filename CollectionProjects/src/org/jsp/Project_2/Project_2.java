package org.jsp.Project_2;
import java.util.*;
public class Project_2 
{
	public static void main(String[] args) 
	{
		List L=new LinkedList();
		L.add(123);
		L.add("sidhakar");
		L.add('a');
		L.add(3232);
		L.add("Kanish");
		L.add(434);
		L.add("Tishika");
		System.out.println("Display Only Integer Objects : ");
		System.out.println("---------------------------------");
		for(int i=0;i<L.size();i++)
		{
			Object Obj=L.get(i);
			if(Obj instanceof Integer)
			{
				Integer In=(Integer)Obj;
				System.out.println(In);
			}
		}
		System.out.println("Display Only Even Integer Objects : ");
		System.out.println("---------------------------------");
		for(int i=0;i<L.size();i++)
		{
			Object Obj=L.get(i);
			if(Obj instanceof Integer)
			{
				Integer In=(Integer)Obj;
				if(In%2==0)
				{
				System.out.println(In);
				}
			}
		}
		System.out.println("Display Only String Objects : ");
		System.out.println("---------------------------------");
		for(int i=0;i<L.size();i++)
		{
			Object Obj=L.get(i);
			if(Obj instanceof String)
			{
				String In=(String)Obj;
				System.out.println(In);
			}
		}
		LinkedList L1=(LinkedList)L;
		L1.addFirst("Suvitha");
		L1.addLast(657);
		System.out.println(L1);
		L1.removeFirst();
		L1.removeLast();
		System.out.println(L1);
	

	}

}
