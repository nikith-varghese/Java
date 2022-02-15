package Java;

import java.util.Scanner;

class Employeer{
	  String name, PhoneNumber, address;
	  int age, salary;
	  void GetDetails(){
	  Scanner  scan = new Scanner(System.in);
			System.out.println("\nEnter name: ");
			name = scan.next();
			System.out.println("\nEnter age: ");
			age = scan.nextInt();
			System.out.println("\nEnter phone number: ");
			PhoneNumber = scan.next();
			System.out.println("\nEnter address: ");
			address = scan.next();
			System.out.println("\nEnter salary: ");
			salary = scan.nextInt();
	        }
	  void PrintDetails(){
			System.out.print("\nName: "+ name);
			System.out.print("\nAge: "+age);
			System.out.print("\nPhone number: "+PhoneNumber);
			System.out.print("\nAddress: "+address);
			System.out.print("\nSalary: "+salary);
	        }
	}  
	//Class Officer.	
	class officer extends Employeer{
		String specialization;
		
	  void GetDetails() {
	      Scanner  scan = new Scanner(System.in);
	      System.out.print("\nEnter Specialization: ");
	      specialization = scan.nextLine();
	      super.GetDetails();
	}
	  void PrintDetails() {
	      super.PrintDetails();
	      System.out.print("\nSpecialization: " +specialization);
	}
	}
	//Class Manager.
	class manager extends Employeer{
		String department;
		
	  void GetDetails() {
	      Scanner  scan = new Scanner(System.in);
	      System.out.print("\nEnter Department: ");
	      department = scan.nextLine();
	      super.GetDetails();
	}
	  void PrintDetails() {
	      super.PrintDetails();
	      System.out.print("\nDepartment: " +department);
	}
	}
	//Main Class
	public class Employees{
	  public static void main(String[] args) {
	      officer officer1 = new officer();
	      manager manager1 = new manager();
	      
	      System.out.print("Enter Officer details\n");
	      officer1.GetDetails();
	      System.out.print("\nEnter Manager details\n");
	      manager1.GetDetails();
	      System.out.print("\nDetails of Officer");
	      officer1.PrintDetails();
	      System.out.print("\n\nDetails of Manager");
	      manager1.PrintDetails();
	  }
	}
		// TODO Auto-generated method stub

