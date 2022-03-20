package emailapp;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class Email {

	public Scanner sc = new Scanner(System.in);

	private String fname;
	private String lname;
	private String email;
	private String dept;
	private String password;
	private String alter_email;
	private int mailCapacity = 500;

	public Email(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
		System.out.println("New Employee:"+this.fname+" "+this.lname);

		this.dept = this.setDept();
		this.password = this.random_password(8);
		this.email = this.generate_Email();
	}


	private String generate_Email() {
		return this.fname.toLowerCase()+"."+this.lname.toLowerCase()+"@"+this.dept.toLowerCase()+".company.com";
	}

	private String setDept() {
		System.out.println("Department codes \n1 for Sales \n2 for Development \n3 for Accounting \n0 for None");
		boolean flag = false;

		do {
			System.out.println("Enter department code :");
			int choice = sc.nextInt();

			switch(choice){
			case 1:
				return "Sales";
			case 2:
				return "Development";
			case 3:
				return "Accounting";
			case 0:
				return "null";
			default:
				System.out.println("Invalid choice");;

			}
		}
		while(!flag);

		return null;
	}

	private String random_password(int length) {
		Random r = new Random();
		String capitalChars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallChars="abcdefghijklmnopqrstuvwxyz";
		String numbers="1234567890";
		String symbols="!@#$%&*";

		String values = capitalChars+smallChars+numbers+symbols;
		String password="";

		for(int i=0; i<length; i++) {
			password = password+values.charAt(r.nextInt(values.length()));
		}

		return password;

	}

	public void changePassowrd() {
		boolean flag = false;
		do {

			System.out.println("Do you want to change your password?(Y/N)");
			char choice = sc.next().charAt(0);

			if(choice=='Y' || choice=='y') {
				flag=true;
				System.out.println("Enter current password:");
				String temp1 = sc.next();

				if(temp1.equals(this.password)) {
					System.out.println("Enter new password:");
					this.password = sc.next();
					System.out.println("Password changed successfully");
				}
				else {
					System.out.println("Incorrect password");
				}
			}
			else if(choice=='N' || choice=='n'){
				flag=true;
				System.out.println("Change password option cancelled.");
			}
			else {
				System.out.println("Not a valid choice.");
			}
		}
		while(!flag);
	}

	public void setMailCap() {
		System.out.println("Current capacity is "+this.mailCapacity);
		System.out.println("Enter new mailbox capacity :");
		this.mailCapacity = sc.nextInt();
		System.out.println("Mailbox capacity updated.");
	}

	public void alternateEmail() {
		System.out.println("Enter alternate email :");
		this.alter_email = sc.next();
		System.out.println("Alternate email is set :");
	}

	public void getInfo() {
		System.out.println("NAME: " + this.fname + " " + this.lname);
		System.out.println("DEPARTMENT: " + this.dept);
		System.out.println("EMAIL: " + this.email);
		System.out.println("PASSWORD: " + this.password);
		System.out.println("MAILBOX CAPACITY: " + this.mailCapacity + "mb");
		System.out.println("ALTER EMAIL: " + this.alter_email);
	}

	public void storefile() {
		try {
			FileWriter in = new FileWriter("C:\\Users\\suraj\\Desktop\\Java Programs\\EmailInfo.txt");
			in.write("First Name: "+this.fname);
			in.append("\nLast Name: "+this.lname);
			in.append("\nEmail: "+this.email);
			in.append("\nPassword: "+this.password);
			in.append("\nCapacity: "+this.mailCapacity);
			in.append("\nAlternate mail: "+this.alter_email);
			in.close();
			System.out.println("Stored..");
		}catch (Exception e){System.out.println(e);}
	}

	public void read_file() {
		try {
			FileReader f1 = new
					FileReader("C:\\Users\\suraj\\Desktop\\Java Programs\\EmailInfo.txt");
			int i;
			while ((i = f1.read()) != -1) {
				System.out.print((char) i);
			}
			f1.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println();

	}
}