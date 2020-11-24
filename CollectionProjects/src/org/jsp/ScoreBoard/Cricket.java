package org.jsp.ScoreBoard;

import java.util.Comparator;

public class Cricket implements Comparator<Cricket>
{
	public int Match;
	public int Won;
	public int Loss;
	public int Draw;
	public int Points;
	public Cricket(int Match,int Won,int Draw,int Points,int Loss) 
	{
		super();
		this.Match = Match;
		this.Won = Won;
		this.Draw=Draw;
		this.Points=Points;
		this.Loss=Loss;
	}
	public Cricket()
	{
		
	}
	public String toString()
	{
		return Match+"\t"+Won+"\t"+Loss+"\t"+Draw+"\t"+Points;
	}
	@Override
	public int compare(Cricket o1, Cricket o2) {
		// TODO Auto-generated method stub
		return o1.Won-o2.Won;
	}

}