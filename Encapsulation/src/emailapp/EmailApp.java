package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String fname = sc.next();
		System.out.println("Enter last name");
		String lname = sc.next();

		Email em1 = new Email(fname, lname);
		int choice = -1;

		do {
			System.out.println("\n**********\nENTER YOUR CHOICE\n1.Show Info\n2.Change Password"
					+ "\n3.Change Mailbox Capacity\n4.Set Alternate Email\n5.Store data in file\n6.Show file\n7.Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				em1.getInfo();
				break;
			case 2:
				em1.changePassowrd();
				break;
			case 3:
				em1.setMailCap();
				break;
			case 4:
				em1.alternateEmail();
				break;
			case 5:
				em1.storefile();
				break;
			case 6:
				em1.read_file();
				break;
			case 7:
				System.out.println("\nTHANKS!!!");
				break;
			default:
				System.out.println("INVALID CHOICE! ENTER AGAIN!");
			}

		}while(choice!=7);
	}

}
