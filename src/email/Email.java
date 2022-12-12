package email;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String depart;
	private String email;
	private int mailBoxCapacity=500;
	private int defaultPasswordLength= 10;
	private String alternatemail;
	private String comapnySuffix="gippscompany.com";
	
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname=lastname;
		
		System.out.print("EMAIL CREATED: "+this.firstname+" "+this.lastname);
		
		this.depart= setDepart();
		System.out.print("Department: "+this.depart);
		
		
		
		this.password = randompassword(8);
		System.out.print("\nYour Password is: "+this.password);
		
		email = firstname.toLowerCase()+ "." + lastname.toLowerCase()+"@"+depart+"."+comapnySuffix;
		System.out.print("\nYour Email is: "+email);
	}
	private String setDepart() {
		System.out.print("\nDEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for return\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice==1) {
			return "sales";
		}
		else if(depChoice==2) {
			return "development";
		}
		else if(depChoice==3) {
			return "accounting";
		}
		else {
			return "";
		}
	}

	private String randompassword(int length) {
		String passwordset= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char [] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int)(Math.random()*passwordset.length());
			password[i] = passwordset.charAt(rand); 
		}
		return new String(password);
	}
	public void setMailbox(int capacity) {
		this.mailBoxCapacity=capacity;
	}
	public void setAlternateEmail(String altEmail) {
		this.alternatemail=altEmail;
	}
	public void changePassword(String password1) {
		this.password=password1;
		
	}
	public int getMailboxCapacity(){
		return mailBoxCapacity;
	}
	public String getAlternateEmail() {
		return alternatemail;
		
	}
	public String getStringPassword() {
		return password;
	}
	public String showInfo() {
		return "\n\n********************** Welcome ********************************"+"\n\nDISPLAY NAME: "+firstname+" "+lastname+
				"\nCOMPANY EMAIL: " + email+
				"\nMAILBOX CAPACITY: " + mailBoxCapacity+"mb"+"\n\n********************* Thank You ********************************";
		
	}

}
