package org.jsp.CricketMatch;

import java.util.Comparator;

public class CricketMatch //implements Comparator<CricketMatch> 
{
	private int TeamMatch;
	private int TeamWon;
	private int TeamLoss;
	private int TeamDraw;
	private int TeamPoints;
	public CricketMatch()
	{
		
	}
	public CricketMatch(int TeamMatch,int TeamWon,int TeamLoss,int TeamDraw,int TeamPoints)
	{
		this.setTeamMatch(TeamMatch);
		this.setTeamWon(TeamWon);
		this.setTeamLoss(TeamLoss);
		this.setTeamDraw(TeamDraw);
		this.setTeamPoints(TeamPoints);
	}
	public int getTeamMatch() {
		return TeamMatch;
	}
	public void setTeamMatch(int teamMatch) {
		TeamMatch = teamMatch;
	}
	public int getTeamWon() {
		return TeamWon;
	}
	public void setTeamWon(int teamWon) {
		TeamWon = teamWon;
	}
	public int getTeamLoss() {
		return TeamLoss;
	}
	public void setTeamLoss(int teamLoss) {
		TeamLoss = teamLoss;
	}
	public int getTeamDraw() {
		return TeamDraw;
	}
	public void setTeamDraw(int teamDraw) {
		TeamDraw = teamDraw;
	}
	public int getTeamPoints() {
		return TeamPoints;
	}
	public void setTeamPoints(int teamPoints) {
		TeamPoints = teamPoints;
	}
	public String toString()
	{
		return TeamMatch+"\t\t"+TeamWon+"\t\t"+TeamLoss+"\t\t"+TeamDraw+"\t\t"+TeamPoints;
		
	}
}
