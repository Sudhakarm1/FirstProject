package orj.jsp.Project_12;
import java.util.*;
public class Project_12 
{
	public static void main(String[] args) 
	{
		List L=new ArrayList();
		L.add(new Movie("adsa",123.321));
		L.add(new Movie("dgdfg",534.43));
		L.add(new Movie("rwerg",1534.43));
		L.add(new Movie("sfdsfg",2534.43));
		L.add(new Movie("uyig",6544.43));
		L.add(new Movie("iuhjfg",7634.43));
		L.add(new Movie("nbvndfg",3534.43));
		Collections.sort(L,new Movie());
		for(int i=0;i<L.size();i++)
		{
			System.out.println(L.get(i));
		}
	}
}