package org.jsp.CricketMatch;

import java.util.Scanner;

public class MainCricket
{
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		PointsUpdates PU=new PointsUpdates();
		PU.AddTeam();
		//PU.PrintTeam();
		//PU.print();
		while(true)
		{
		System.out.println("Enter you choice");
		System.out.println("1.Start the Match");
		System.out.println("2.exit Match");
		int Num=Sc.nextInt();
		switch(Num)
		{
		case 1:PU.UpdateMatch();
		       PU.Winner();
		       break;
		case 2:System.exit(0);
		       break;
			
		}
	    }
	}
}
