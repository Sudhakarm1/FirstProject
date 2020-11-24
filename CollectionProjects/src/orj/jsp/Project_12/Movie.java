package orj.jsp.Project_12;
import java.util.*;
public class Movie implements Comparator<Movie>
{
	public String Mname;
	public double Mprice;
	public Movie(String Mname,double Mprice)
	{
		this.Mname=Mname;
		this.Mprice=Mprice;
	}
	public Movie()
	{
		
	}
	public String toString()
	{
		return Mname+"\t\t"+Mprice;
	}
	@Override
	public int compare(Movie o1, Movie o2) 
	{
		if(o1.Mprice>200 && o2.Mprice<=1000)
		{
			return ((Double)o1.Mprice).compareTo(o2.Mprice);
		}
		else
		{
		   return o1.Mname.compareTo(o2.Mname);
	    }
	}

}
