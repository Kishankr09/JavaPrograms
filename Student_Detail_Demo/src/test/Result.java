package test;

public class Result {
	public String calculate(float per, boolean p) {
		if(p) {
			return "Fail";
		}	
		else if(per >= 70 & per <= 100) {
			return "Distinction";
		}	
		else if(per >= 60 && per< 70) {
			return "First Class";
		}	
		else if(per >= 45 && per< 60) {
			return "Second Class";
		}	
		else if(per >= 35 && per < 45)
		{
			return "Third Class";
		}
		else 
		{
			return "Fail";
		}	
	}

}
