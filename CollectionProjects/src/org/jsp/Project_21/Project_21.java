package org.jsp.Project_21;
public class Project_21 
{
	public static void main(String[] args) 
	{
		CitizienManagement CM=new CitizienManagement();
		CM.add();
		System.out.println("Voter Id"+"\t"+"Voter Age"+"\t"+"Voter Name");
		System.out.println("---------------------------------------------");
		CM.Display2();
		System.out.println("Voter Id"+"\t"+"Voter Age"+"\t"+"Voter Name");
		System.out.println("---------------------------------------------");
		CM.Display();
		System.out.println("Voter Id"+"\t"+"Voter Age"+"\t"+"Voter Name");
		System.out.println("---------------------------------------------");
		CM.Display1();
		
	}

}
