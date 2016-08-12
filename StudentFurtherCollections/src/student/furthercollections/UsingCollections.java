package student.furthercollections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class UsingCollections {

	public static void main(String[] args) {
		
		// Work with a list of Strings.
		//manageFootballTeams();
		
		// Work with a LinkedList of Doubles.
		// manageSalaries();
		
		// Work with a TreeMap of Employees.
		 manageEmployees();
	}

	
	// Work with a list of Strings.
	public static void manageFootballTeams() {

		// TODO: Declare a list to hold football teams (i.e. Strings).
		//       You can create either an ArrayList or a LinkedList.
		List<String> teams = new ArrayList<String>();
		
		
		// Miscellaneous helper variables.
		String team;
		int index;
		
		// Display menu options in a loop.
		int option = -1;
		do {
			
			try {
				System.out.println();
				System.out.println("---------------------------------------------------------");
				System.out.println("Options for managing a list of football teams (Strings)"  );
				System.out.println("---------------------------------------------------------");
				System.out.println("1. Append team");
				System.out.println("2. Add team at index");
				System.out.println("3. Set team at index");
				System.out.println("4. Remove team at index");
				System.out.println("5. Remove specified team");
				System.out.println("6. List all teams");
				System.out.println("7. Quit");
				
				option = Helper.getInt("\nEnter option => ");
				
				switch (option) {
				
					case 1:
						team = Helper.getString("Enter team: ");
						// TODO: Append team to list, and display success/failure message.
						//       Display a success/failure message.
						System.out.println((teams.add(team))?"Added Successfully at index":"Failure");
						break;
						
					case 2:
						team  = Helper.getString("Enter team: ");
						index = Helper.getInt("Enter index: ");
						// TODO: If index is within range, add team at specified index in list.
						//       Note, you ARE allowed to add an item at one-beyond-the-end of the list (similar effect to appending). 
						//       Display a success/failure message.
						teams.add(index,team);
						System.out.println("Added Successfully at index");
						break;
						
					case 3:
						team  = Helper.getString("Enter team: ");
						index = Helper.getInt("Enter index: ");
						// TODO: If index is within range, set team at specified index in list.
						//       Display a success/failure message.
						if(index < teams.size())
						{
							teams.set(index,team);
							System.out.println("Added Successfully at index");

						}
						break;
					
					case 4:
						index = Helper.getInt("Enter index: ");
						// TODO: If index is within range, remove team at specified index in list.
						//       Display a success/failure message.
						
						if(index < teams.size())
						{
							System.out.println("Removed Team "+teams.remove(index));
						}
						break;
						
					case 5:
						team = Helper.getString("Enter team: ");
						// TODO: Remove team from list.
						//       Display a success/failure message.
						if(teams.contains(team))
						{
							System.out.println(teams.remove(team)?"Removed Successfully":"Failure to remove");
							
						}
						break;
						
					case 6:
						// TODO: Display all items in list.
						
						for(String t:teams)
						{
							System.out.println(t);
						}
						break;

					case 7:
						// This is a valid option, but there's nothing to do here.
						break;
						
					default:
						System.out.println("Invalid option selected.");
				}

			} catch (Exception ex) {
				System.out.printf("Exception occurred: %s.\n", ex.getMessage());
			}
					
		} while (option != 7);
	}


	// Work with a LinkedList of Doubles.
	public static void manageSalaries() {

		// TODO: Declare a LinkedList to hold salaries (i.e. Doubles).

		List<Double> salaries = new LinkedList<Double>();
		// Miscellaneous helper variables.
		double salary;
		
		// Display menu options in a loop.
		int option = -1;
		do {
			
			try {
				System.out.println();
				System.out.println("---------------------------------------------------------");
				System.out.println("Options for managing a LinkedList of salaries (Doubles)  ");
				System.out.println("---------------------------------------------------------");
				System.out.println("1. Push salary");
				System.out.println("2. Pop salary");
				System.out.println("3. Add first ");
				System.out.println("4. Add last");
				System.out.println("5. Peek first and last");
				System.out.println("6. List all salaries");
				System.out.println("7. Quit");
				
				option = Helper.getInt("\nEnter option => ");
				
				switch (option) {
				
					case 1:
						salary = Helper.getDouble("Enter salary: ");
						// TODO: Push salary into linked list.
						//       Display a success/failure message.
						
						System.out.println(salaries.add(salary)?"Added salary successfully":"Failure ");

						break;
						
					case 2:
						// TODO: Pop salary off linked list.
						//       Display a success/failure message.
						
						System.out.println("Popped salary "+salaries.remove(salaries.size()-1)+"successfully");

						break;
						
					case 3:
						salary = Helper.getDouble("Enter salary: ");
						// TODO: Add salary at the start of the linked list.
						//       Display a success/failure message.
						
						salaries.add(0, salary);
						System.out.println("Added salary successfully");

						break;
					
					case 4:
						salary = Helper.getDouble("Enter salary: ");
						// TODO: Add salary at the end of the linked list.
						//       Display a success/failure message.
						salaries.add(salaries.size()-1, salary);
						System.out.println("Added salary successfully");
						break;
						
					case 5:
						// TODO: If linked list isn't empty, peek at the first and last entries.
						//       If linked list IS empty, display a suitable message.
						if(!salaries.isEmpty()){
							System.out.println("First: "+salaries.get(0)+" Last :"+salaries.get(salaries.size()-1));
						}
						break;
						
					case 6:
						// TODO: Display all items in linked list.
						
						for(double el:salaries)
						{
							System.out.println(el);
						}
						break;

					case 7:
						// This is a valid option, but there's nothing to do here.
						break;
						
					default:
						System.out.println("Invalid option selected.");
				}

			} catch (Exception ex) {
				System.out.printf("Exception occurred: %s.\n", ex.getMessage());
			}
					
		} while (option != 7);
	}


	// Work with a TreeMap of Employees.
	public static void manageEmployees() {

		// TODO: Declare a TreeMap to hold Employees (keyed by employee id).
		
		NavigableMap<String,Employee> Employees = new TreeMap<String,Employee>();
		
		// Miscellaneous helper variables.
		Employee emp;
		String id;
		
		// Display menu options in a loop.
		int option = -1;
		do {
			
			try {
				System.out.println();
				System.out.println("---------------------------------------------------------");
				System.out.println("Options for managing a TreeMap of Employees (keyed by ID)");
				System.out.println("---------------------------------------------------------");
				System.out.println("1. Put employee");
				System.out.println("2. Remove employee for id");
				System.out.println("3. Is id present?");
				System.out.println("4. Is employee present?");
				System.out.println("5. Display first and last entries");
				System.out.println("6. Display all employees");
				System.out.println("7. Quit");
				
				option = Helper.getInt("\nEnter option => ");
				
				switch (option) {
				
					case 1:
						emp = Employee.createEmployee();
						// TODO: Put employee into map.
						//       Display a success/failure message.
						 if(Employees.put(emp.getId(), emp) == null){
						 System.out.println("Successfully put");
						 }
						 else{
							 System.out.println("Failure");

						 }
						 
						break;
						
					case 2:
						id  = Helper.getString("Enter id: ");
						// TODO: Remove employee with specified id.
						//       Display a success/failure message.
						System.out.println("Successfully removed "+Employees.remove(id).toString());
						break;
						
					case 3:
						id = Helper.getString("Enter id: ");
						// TODO: Display message indicating whether the map contains the specified id.
						System.out.println(Employees.containsKey(id)?"id exists":"Couldn't find id");
						break;

					case 4:
						emp = Employee.createEmployee();
						
						// TODO: Display message indicating whether the map contains an employee with the specified values.
						System.out.println(Employees.containsValue(emp)?"Found Employee":"Couldn't find id");

						break;

					case 5:
						// TODO: If map isn't empty, display the key/value for the first entry and for the last entry.
						//       If map IS empty, display a suitable message.
						if(!Employees.isEmpty())
						{
							System.out.println("First:"+Employees.firstEntry().toString());
							System.out.println("Last:"+Employees.lastEntry().toString());

						}
						break;

					case 6:
						// TODO: Display all employee objects (i.e. values) in map.
						Set<Entry<String, Employee>> employeeSet = new LinkedHashSet<>();
						employeeSet = Employees.entrySet();
						for(Entry<String, Employee> e : employeeSet)
						{
							System.out.println(e.getValue().toString());
						}
						break;

					case 7:
						// This is a valid option, but there's nothing to do here.
						break;
						
					default:
						System.out.println("Invalid option selected.");
				}

			} catch (Exception ex) {
				System.out.printf("Exception occurred: %s.\n", ex.getMessage());
			}
					
		} while (option != 7);
	}
}
