package assignment1;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) 
	{
	/*	System.out.println("Please Enter your full name:");
		Scanner sc= new Scanner(System.in);
		String Full_Name = sc.next();
		String[]name = Full_Name.split(" ");
		if (name.length < 3)
		{
		
		String firstname = name[0];
		String middlename = name[1];
		String lastname = name[2];
		System.out.println(firstname.charAt(0) +"."+ middlename.charAt(0)+"."+lastname);
		}
		sc.close();*/
		
		System.out.println("Please Enter your full name:");
		Scanner sc= new Scanner(System.in);
		String Full_Name = sc.next();
	        String[] nameParts = Full_Name.trim().split("\\s+");
	        
	        if (nameParts.length >= 3) {
	            String firstName = nameParts[0];
	            String middleName = nameParts[1];
	            String lastName = nameParts[2];
	            
	            System.out.println( firstName.charAt(0)+"."+middleName.charAt(0)+"."+lastName);
	            System.out.println("Middle Name: " + middleName);
	            System.out.println("Last Name: " + lastName);
	        } else {
	            System.out.println("Invalid full name format. Please provide at least first, middle, and last names.");
	        }
	        sc.close();
	}

}
