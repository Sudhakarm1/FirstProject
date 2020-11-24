//In an ArrayList of Heterogeneous Objects
package org.jsp.Project1;
//import java.rmi.server.ObjID;
import java.util.*;
//import sun.jvm.hotspot.oops.ObjArray;
public class Project_demo_1 
{
	public static void main(String[] args) 
	{
		List L=new ArrayList();
		L.add(123);
		L.add("sudhakar");
		L.add('s');
		L.add(324);
		L.add(452);
		L.add("Suvitha");
		System.out.println("Display Only Integer Objects : ");
		System.out.println("---------------------------------");
		for(int i=0;i<L.size();i++)
		{
		    if(L.get(i) instanceof Integer)//Chacking Data Type
		    {
               System.out.println(L.get(i)+" ");
		    }
		}
		System.out.println("Display Only String Objects : ");
		System.out.println("---------------------------------");
		for(int i=0;i<L.size();i++)
		{
			if(L.get(i) instanceof String)
		    {
				String Str=(String)L.get(i);
				if(Str.startsWith("S"))
				{
                  System.out.println(L.get(i));
		        }
		    }
		}
		System.out.println("Display Only Even Integer Objects : ");
		System.out.println("------------------------------------");
		for(int i=0;i<L.size();i++)
		{
			if(L.get(i) instanceof Integer)
		    {
				Integer A=(Integer) L.get(i);
				if(A%2 == 0)
               System.out.println(L.get(i));
		    }
		}
	}
}