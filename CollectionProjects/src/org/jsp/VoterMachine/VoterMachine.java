package org.jsp.VoterMachine;

import java.util.Scanner;

public class VoterMachine {

	public static void main(String[] args) 
	{
		System.out.println("****** WELCOME TO ELECTION ******");
		System.out.println("-----------------------------------");
		Scanner Sc=new Scanner(System.in);
		Voting VM=new Voting();
		VM.add();
		while(true)
		{
		System.out.println("Please Enter Ur Choice");
		System.out.println("------------------------");
		System.out.println("1.Voting");
		System.out.println("2.exit");
		int Vot=Sc.nextInt();
		switch(Vot)
		{
		case 1:
			System.out.println("Case sencetive ADMK,DMK,PMK,TMDK,BJP,MNM");
			VM.vote();
			VM.print();
			break;
		case 2:System.exit(0);
		}
	}
	}

}
