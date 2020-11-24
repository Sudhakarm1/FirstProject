package org.jsp.Project_21;
public class Citiziens 
{
	public String Cname;
	public int Cage;
	public Citiziens()
	{
		
	}
	public Citiziens(String Cname,int Cage)
	{
		this.Cage=Cage;
		this.Cname=Cname;
	}
	public String toString()
	{
		return Cname+"\t"+Cage;
	}

}
