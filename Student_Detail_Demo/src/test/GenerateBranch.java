package test;

public class GenerateBranch {
	public String Generate(String brCode) {
		return switch(brCode) {
		case "10" : yield "MCA";
		case "20" : yield "BCA";
		case "30" : yield "BSC IT";
		case "40" : yield "B.TECH";
		default : yield null;
		};
	}

}
