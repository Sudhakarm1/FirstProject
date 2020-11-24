package org.jsp.ScoreBoard;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
public class CircketUpdate implements Comparator<CircketUpdate>
{
	Scanner Sc=new Scanner(System.in);
	Map<String,Cricket> M=new HashMap<String,Cricket>();
	Set<Entry<String,Cricket>> S=M.entrySet();
	Iterator<Entry<String,Cricket>> itr=S.iterator();
	public void AddTeam()
	{
	/*LinkedList<Cricket> L=new LinkedList<Cricket>();
	L.add(new Cricket(4,0,0,0,0));
	L.add(new Cricket(4,0,0,0,0));
	L.add(new Cricket(4,0,0,0,0));
	L.add(new Cricket(4,0,0,0,0));
	//for(int i=0;i<L.size();i++)
	//{
		//Object Obj=L.get(i);//Object Obj =L.get(1)(Object)//Upcasting
		//if(Obj instanceof Cricket)
		//{
			//Cricket A=(Cricket)Obj;//DownCasting
	*/
	        M.put("IND",new Cricket(2,0,0,0,0));
		    M.put("PAK",new Cricket(2,0,0,0,0));
		    M.put("AUS",new Cricket(2,0,0,0,0));
		    M.put("NYZ",new Cricket(2,0,0,0,0));
		    M.put("SA",new Cricket(2,0,0,0,0));
	   //}
    //}
	   System.out.println("\t"+"WCC21 TEAM-A POINTS TABLE");
	   System.out.println("\t"+"=========================");
	   System.out.println("Id"+"\t"+"Match"+"\t"+"Won"+"\t"+"Loss"+"\t"+"Draw"+"\t"+"Point");
	   System.out.println("----------------------------------------------");
		itr=S.iterator();
		while(itr.hasNext())
		{
			Entry<String,Cricket> E=itr.next();
			//if(E.getValue().sm==214)
			//{
			System.out.println(E.getKey()+"\t"+E.getValue());
			//}
		}
		System.out.println("----------------------------------------------");
	}
	//}
	public void StartMatch()
	{
		System.out.println("Enter First Team : ");
		String Team1=Sc.nextLine();
		System.out.println("Enter Second Team : ");
		String Team2=Sc.nextLine();
		System.out.println("Who Wins the Match");
		String Won=Sc.nextLine();
		System.out.println("\t"+"WCC21 TEAM-A POINTS TABLE");
		System.out.println("\t"+"=========================");
		System.out.println("Id"+"\t"+"Match"+"\t"+"Won"+"\t"+"Loss"+"\t"+"Draw"+"\t"+"Point");
		System.out.println("----------------------------------------------");
		itr=S.iterator();
		int i=0;
		while(itr.hasNext())
		{
			Entry<String,Cricket> E=itr.next();
			//Object Obj=M.get(i);
			if(E.getKey().equalsIgnoreCase(Team1) || E.getKey().equalsIgnoreCase(Team2))//ind
			{
				//M.put(E.getKey(), new Cricket(E.getValue().Match-(Integer)1,E.getValue().Won,E.getValue().Loss,E.getValue().Loss,E.getValue().Points));
				//M.put(E.getKey(), E.getValue());
				//AddTeam();
				Integer itr=E.getValue().Match-1;
				if(E.getValue().Match >0)
				{
				E.getValue().Match=itr;
				if(E.getKey().equalsIgnoreCase(Won))
				{
					Integer itr1=E.getValue().Won+1;
					E.getValue().Won=itr1;
					Integer itr2=E.getValue().Points+2;
					E.getValue().Points=itr2;
				    System.out.println(E.getKey()+"\t"+E.getValue());
				    i++;
				}
				else
				{
					Integer itr3=E.getValue().Loss+1;
					E.getValue().Loss=itr3;
					System.out.println(E.getKey()+"\t"+E.getValue());
					i++;
				}
				}
				else
				{
					System.out.println("Match Completed");
					break;
				}
			}
			else
			{
				System.out.println(E.getKey()+"\t"+E.getValue());
				i++;
			}
		}
	}
	public void Points()
	{
		System.out.println("Ranking Table");
		System.out.println("--------------");
		itr=S.iterator();
		while(itr.hasNext())
		{
			Entry<String,Cricket> E=itr.next();
			System.out.println(E.getKey()+"\t\t"+E.getValue());
		}
	}
	@Override
	public int compare(CircketUpdate o1, CircketUpdate o2) {
		// TODO Auto-generated method stub
		return o1.compare(o1, o2);
	}
}