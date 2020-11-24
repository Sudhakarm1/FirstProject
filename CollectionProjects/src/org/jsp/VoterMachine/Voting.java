package org.jsp.VoterMachine;
import java.util.*;
import java.util.Map.Entry;;
public class Voting //implements Comparator<Voting>
{
	Scanner Sc=new Scanner(System.in);
	Map<String,Integer> M=new HashMap<String,Integer>();
	public void add()
	{
		M.put("ADMK", 0);
		M.put("DMK", 0);
		M.put("PMK", 0);
		M.put("BJP", 0);
		M.put("TMDK", 0);
		M.put("MNM", 0);
	}
	Set<Entry<String,Integer>> S=M.entrySet();
	Iterator<Entry<String,Integer>> itr=S.iterator();
	public void vote()
	{
		System.out.println("Please Enter Your Favourite Candidate : ");
		String Voter=Sc.nextLine();
		int count = M.containsKey(Voter) ? M.get(Voter) : 0;
		M.put(Voter, count + 1);
		//print();
	}
	public void print()
	{
		
		Map<String,Integer> M1=sortByValue(M); 
		Set<Entry<String,Integer>> S1=M1.entrySet();
		Iterator<Entry<String,Integer>> itr=S1.iterator();
		System.out.println("Candidate"+"\t"+"Vote");
		itr=S1.iterator();
		while(itr.hasNext())
		{
			Entry<String,Integer> E=itr.next();
			System.out.println(E.getKey()+"\t\t"+E.getValue());
		}
	}
	public HashMap<String, Integer> sortByValue(Map<String, Integer> m2) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(m2.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
            	if(o2.getValue().equals(o1.getValue()))
            	{
                 return (o1.getKey()).compareTo(o2.getKey());
            	}
            	else
            	{
                return (o2.getValue()).compareTo(o1.getValue()); 
            } 
            }
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
}