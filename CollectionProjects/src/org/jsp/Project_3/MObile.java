package org.jsp.Project_3;
import java.util.*;
public class MObile implements Comparator<MObile>
{
	public String Mobile;
	public int Mid;
	public double Mprice;
	public MObile(String Mobile,int Mid,double Mprice)
	{
		this.Mid=Mid;
		this.Mobile=Mobile;
		this.Mprice=Mprice;
	}
	public MObile()
	{
		
	}
	public String toString()
	{
		return Mid+"\t\t"+Mobile+"\t\t"+Mprice;
	}
	@Override
	public int compare(MObile o1,MObile o2) 
	{
		return ((Double)o1.Mprice).compareTo((Double)o2.Mprice);
	}
}