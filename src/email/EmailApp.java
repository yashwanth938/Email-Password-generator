package email;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		System.out.print("Enter your First name to Create email: ");
		String firstName=sc.nextLine();
		System.out.print("Enter your Last name to Create email: ");
		String lastName=sc.nextLine();
		Email em1 = new Email(firstName,lastName);
		
		
		System.out.println(em1.showInfo());

	}

}
