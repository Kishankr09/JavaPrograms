package test;
import java.util.*;
public class ReadInput {
	public void read(Scanner s, Student st) {
		System.out.println("Enter The Roll No : ");
		st.rollNo= s.nextInt();
		if(String.valueOf(st.rollNo).length()==5) {
			System.out.println("Enter The Student Name : ");
			st.name= s.nextLine();
			System.out.println("Enter The Branch : ");
			st.branch = s.nextLine();
			BranchVerification bv = new BranchVerification();
			boolean verifyResult =  bv.verify(st.branch);
			if(verifyResult) {
				GenerateBranch gb = new GenerateBranch();
				String br = gb.Generate(Integer.toString(st.rollNo).substring(0,2));
				if(br == null) {
					System.out.println("InValid Branch Verification Code in Roll Number");
				}else {
					if(br.equals(st.branch)) {
						System.out.println("Enter The House No ");
						st.addr.houseNo = s.nextLine();
						System.out.println("Enter The Street Name : ");
						st.addr.streetName = s.nextLine();
						System.out.println("Enter The City : ");
						st.addr.city =s.nextLine();
						System.out.println("Enter The PinCode : ");
						st.addr.pinCode = Integer.parseInt(s.nextLine());
						System.out.println("Enter The mail ID : ");
						st.con.mailId = s.nextLine();
						System.out.println("Enter The Contact No : ");
						st.con.phNo = s.nextLong();
						boolean p = false;
						int totm=0;
						for(int i = 1; i<=5; i++) {
							System.out.println("Enter The " + i + " Subject Marks : ");
							int sub = s.nextInt();
							if(sub < 0 || sub > 100) {
								System.out.println("Invalid Subject Marks...");
								continue;
							}
							if(sub >=0 && sub <= 100) {
								p = true;
								totm += sub;
							}
						}
						st.totMarks = totm;
						st.per = st.totMarks / 5;
						st.res = st.re.calculate(totm, p);
						
					}else {
						System.out.println("Roll No Not matched with branch ");
					}
				}
				
				
			}else {
				System.out.println("Invalid Branch");
			}
			
		}else {
			System.out.println("Invalid Roll No");
		}		
	}
}
