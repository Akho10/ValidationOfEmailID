package validation;
import java.util.*;
 
public class Main {

	public static void main(String[] args) {
		String[] employees = {"Akhona", "Juliet", "Maria", "Martha", "Job"};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter name to search: ");
		String searchName = scanner.nextLine();
		
		boolean isFound =false;
		
		for(int i=0; i< employees.length; i++) 
		{
			if(employees[i].equals(searchName)) {
				System.out.printf("Employee with name %s has been found", searchName);
			}else {
				System.out.println("Employee not found");
			}
			
			scanner.close();
		}
	}
	
	}

