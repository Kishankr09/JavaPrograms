package test;

public class BranchVerification {
	public boolean verify(String br) {
		return switch(br) {
		case "MCA"  : yield true;		
		case "BCA"  : yield true;	
		case "BSC IT"  : yield true;	
		case "B.TECH"  : yield true;	
		default : yield false;
		};
	}
}
