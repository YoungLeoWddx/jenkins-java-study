package com.liuyang.jenkins.java.study;

public class Caculator {
	
	public int add(int a,int b){
		return a + b;
	
	
	public int min(int a,int b){
		if(a < b){
			return a;
		}
		
		return b;
	}
	
	public int max(int a, int b){
		if(a > b){
			return a;
		}
		return b;
	}
	
	public String toSeason(int month){
		String season = null;
		switch (month) {
		case 3:
		case 4:
		case 5:
			season = "spring";
			break;
		case 6:
		case 7:
		case 8:
			season = "summer";
			break;
		case 9:
		case 10:
		case 11:
			season = "autumn";
			break;
		case 12:
		case 1:
		case 2:
			season = "winter";
			break;
		default:
			season = "unknown";
		}
		return season;
	}
}
