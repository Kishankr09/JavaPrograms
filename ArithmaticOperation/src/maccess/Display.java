package maccess;

import test.*;

public class Display {
	public void dis(input inp) {
		
		switch(inp.ch) {
		case 1:
			Addition ad = new Addition();
			ad.add(inp);
			break;
		case 2:
			Substraction su = new Substraction();
			su.sub(inp);
			break;
		case 3:
			Multiplication m = new Multiplication();
			m.mul(inp);
			break;
		case 4:
			Division d = new Division();
			d.div(inp);
			break;
		case 5:
			ModDivision mo = new ModDivision();
			mo.mod(inp);
			break;
		default:
			System.out.println("Wrong Option");	
		}
	}
}
