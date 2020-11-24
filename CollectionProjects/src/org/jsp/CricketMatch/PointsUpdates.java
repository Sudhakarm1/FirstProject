package org.jsp.CricketMatch;
import java.util.*;
import java.util.Map.Entry;
public class PointsUpdates //implements Comparator<PointsUpdates>
{
	Scanner Sc=new Scanner(System.in); 
	Map<String,CricketMatch> M=new TreeMap<String,CricketMatch>();
	public void AddTeam()
	{
	M.put("IND",new CricketMatch(4,0,0,0,0));
	M.put("ENG",new CricketMatch(4,0,0,0,0));
	M.put("PAK",new CricketMatch(4,0,0,0,0));
	M.put("AUS",new CricketMatch(4,0,0,0,0));
	}
	Set<Entry<String,CricketMatch>> S=M.entrySet();
	Iterator<Entry<String,CricketMatch>> itr=S.iterator();
	/*public void PrintTeam()
	{
		itr=S.iterator();
		while(itr.hasNext())
		{
			Entry<String,CricketMatch> E=itr.next();
		    //Collections.sort(M,new CricketMatch());
		    System.out.println(E.getKey()+"\t\t"+E.getValue());
		}
	}*/
	//List L=new ArrayList(S);
	public void UpdateMatch()
	{   
		itr=S.iterator();
		System.out.println("Ente Your Team 1");
		String Team1=Sc.nextLine();
		System.out.println("Ente Your Team 2");
		String Team2=Sc.nextLine();
		while(itr.hasNext())
		{
			     Entry<String,CricketMatch> E=itr.next();
				 if(E.getKey().equalsIgnoreCase(Team1)|| E.getKey().equalsIgnoreCase(Team2))
				 {
					 if(E.getValue().getTeamMatch() > 0)
					 {
					 Integer Match=E.getValue().getTeamMatch()-1;
					 E.getValue().setTeamMatch(Match); 
					 }
					 else
					 {
						 System.out.println("Sorry Ur Match Ended Go back and Chooce another team");
						 System.exit(0);
					 }
				 }
		}
	}
	public void Winner()
	{
			System.out.println("Enter Winner Team ");
			String Winnner=Sc.nextLine();
			System.out.println("Enter Looser Team ");
			String Losser=Sc.nextLine();
			itr=S.iterator();
			while(itr.hasNext())
			{
				Entry<String,CricketMatch> E=itr.next();
					if(E.getKey().equalsIgnoreCase(Winnner))
					{
						//E=itr.next();
						Integer Won=E.getValue().getTeamWon()+1;
						E.getValue().setTeamWon(Won);
						Integer Points=E.getValue().getTeamPoints()+2;
						E.getValue().setTeamPoints(Points);
					}
					else if (E.getKey().equalsIgnoreCase(Losser))
					{
						Integer Loss=E.getValue().getTeamLoss()+1;
						E.getValue().setTeamLoss(Loss);
					}
			}
			print();
	}
	/*public int compare(Map.Entry<String,CricketMatch> e1, Map.Entry<String,CricketMatch> e2) {
        if (e1.getValue().getTeamWon() != e2.getValue().getTeamWon())
        {
            return e1.getValue().getTeamWon()-e2.getValue().getTeamWon();
        }
        else if (e1.getValue().getTeamWon() == e2.getValue().getTeamWon()) 
        {
            return e1.getValue().getTeamMatch()-e2.getValue().getTeamMatch();
        }
        else
        {
        	return 0;
        }
    }*/
	public void print()
	{
		Map<String,CricketMatch> M1=sortByValue(M); 
		Set<Entry<String,CricketMatch>> S1=M1.entrySet();
		Iterator<Entry<String,CricketMatch>> itr=S1.iterator();
		//Collections.sort(M,new PointsUpdates());
		System.out.println("TEAM"+"\t\t"+"MATCH"+"\t\t"+"WON"+"\t\t"+"LOSS"+"\t\t"+"DRAW"+"\t\t"+"POINTS");
	    System.out.println("-----------------------------------------------------------------------------------");
	    itr=S1.iterator();
		while(itr.hasNext())
		{
			Entry<String,CricketMatch> E=itr.next();
			System.out.println(E.getKey()+"\t\t"+E.getValue());
		}
	}
	
	public HashMap<String, CricketMatch> sortByValue(Map<String, CricketMatch> m2) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<String, CricketMatch> > list = 
               new LinkedList<Map.Entry<String, CricketMatch> >(m2.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, CricketMatch> >() { 
            public int compare(Map.Entry<String, CricketMatch> o1,  
                               Map.Entry<String, CricketMatch> o2) 
            { 
            	if(o1.getValue().getTeamWon()==o2.getValue().getTeamWon())
            	{
            		return (o2.getKey()).compareTo(o1.getKey());
            	}
            	else
            	{
                return (o2.getValue().getTeamWon())-(o1.getValue().getTeamWon()); 
                }
            }
        }); 
          
       // put data from sorted list to hashmap  
        HashMap<String, CricketMatch> temp = new LinkedHashMap<String,CricketMatch>(); 
        for (Map.Entry<String, CricketMatch> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    }
}
