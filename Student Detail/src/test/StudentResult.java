package test;

public class StudentResult {
	public void stuRes(StudentInput si) {
		
		si.total = si.m1 + si.m2 + si.m3 + si.m4 +si.m5 ;
		si.per = (float) si.total / 5;
		if((si.m1 > 0 && si.m1 <= 100) && (si.m2 > 0 && si.m2 <= 100)  && (si.m3 > 0 && si.m3 <= 100) && (si.m4 > 0 && si.m4 <= 100) && (si.m5 > 0 && si.m5 <= 100) ) {
			
			if((si.m1 < 30 ) || (si.m2 < 30 )  || (si.m3 < 30 ) || (si.m4 < 30 ) || (si.m5 < 30 )) {
				si.div = "Fail";
			}
			else if(si.per < 30) {
				si.div = "Fail";
			}
			else if(si.per <= 45 ) {
				si.div = "Third Division";
			}
			else if(si.per <= 60 ) {
				si.div = "Secprnd Division";
			}
			else if(si.per <= 75 ) {
				si.div = "First Division";
			}
			else if(si.per <= 90 ) {
				si.div = "Distinction";
			}
			else if(si.per <= 100 ) {
				si.div = "Topper";
			}	
		}
	}

}
