package org.jsp.ScoreBoard;
import java.util.Scanner;
public class Cricket_Main 
{
	public static void main(String[] args) 
	{
		
		Scanner Sc=new Scanner(System.in);
		CircketUpdate CU=new CircketUpdate();
		System.out.println("\t"+"WELCOME TO WCC21 POINTS TABLE ");
		System.out.println("\t"+"=============================");
		CU.AddTeam();
		while(true)
		{
		System.out.println("Please Enter Your Option");
		System.out.println("----------------------------");
		System.out.println("1.Updated Points table");
		System.out.println("2.Start to Play Match");
		System.out.println("3.Points");
		int Num=Sc.nextInt();
		switch(Num)
		{
		case 1:CU.AddTeam();
		       break;
		case 2:CU.StartMatch();
		       break;
		case 3:CU.Points();
			
		}
		}
	}
}