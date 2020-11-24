package org.jsp.Project_11;
import java.util.*;
import org.jsp.Project_3.MObile;
public class Project_11 
{
	public static void main(String[] args) 
	{
		List L=new ArrayList();
		//String Mobile,int Mid,double Mprice
		L.add(new MObile("HTC",123,234123.21312));
		L.add(new MObile("REDME",323,39823.21312));
		L.add(new MObile("OPPO",223,3223.21312));
		L.add(new MObile("VIVO",333,89123.21312));
		L.add(new MObile("LENOVO",312,8723.21312));
		L.add(new MObile("SAMSUNG",1523,7623.21312));
		L.add(new MObile("APPLE",768,345423.21312));
        Collections.sort(L,new MObile());
        for(int i=0;i<L.size();i++)
        {
        	System.out.println(L.get(i));
        }
	}
}