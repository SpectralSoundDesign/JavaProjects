import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 12;
	private String companySuffix = "company.com";
	private int depChoice;
	
	Scanner scan = new Scanner(System.in);
	
	//constructor for first name and last name
	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
		//System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		this.password = randPass(defaultPasswordLength);
		System.out.println("Your Password is: " + this.password);
		
		if (depChoice > 0) {
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + email);
		}
		else {
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + companySuffix;
			System.out.println("Your email is: " + email);

		}
		
	}
	
	//ask for the department
	
	private String setDepartment() {
		System.out.print("Which department are you in?\n1 for sales\n2 for development\n3 for accounting\n0 for none\n Please enter a number: ");
		
		depChoice = scan.nextInt();
		if (depChoice == 1) {
			return "sales";
		}
		else if (depChoice == 2) {
			return "development";
		}
		else if (depChoice == 3) {
			return "accounting";
		}
		else {
			return "";
		}
		
		
	}
	
	//generate a random password
	private String randPass(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			
			
		}
		return new String(password);
		
	}
	//set the mailbox capacity
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + "\n" +
				"EMAIL: " + email + "\n" +
				"MAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
	
	
	
	//set the alternate email
	
	//change the password
}
