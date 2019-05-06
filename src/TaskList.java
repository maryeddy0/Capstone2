import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.swing.Action;
import javax.swing.text.DateFormatter;

public class TaskList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String displayMenu = "repeat";

		// --------------------------------------------------------
		LinkedList<Object> taskList = new LinkedList<>();
		// --------------------------------------------------------
		Task project = new Task(null, null, null, false);
		// --------------------------------------------------------

		do {

			// -----------------Dislay Menu----------------------------

			System.out.println("WELCOME TO TASK MANAGER \n");
			System.out.println("1. List Task");
			System.out.println("2. Add Task");
			System.out.println("3. Delete Task");
			System.out.println("4. Quit ");

			System.out.println("What would you like to do?");
			String menuChoice = scan.nextLine();

			// --------------------------------------------------------

			// -------------Find menu item-----------------------------
			if (menuChoice.equalsIgnoreCase("list task")) {
				// LinkedList<Integer> num = new LinkedList<>();
				System.out.println(project.nextTask);
			}

			else if (menuChoice.equalsIgnoreCase("add task")) {
				makeATask(scan, project, null);
				System.out.println("Task Entered!");
				scan.hasNext();
				TaskList.insert(project);
				System.out.println(project);

			}

			else if (menuChoice.equalsIgnoreCase("delete task")) {
			
			}

			else if (menuChoice.equalsIgnoreCase("quit")) {
				displayMenu.equalsIgnoreCase(menuChoice);// Exit whileloop
				System.out.println("Thank you for using Task Manager.");

				
				
				
				
			} else {
				System.out.println("I'm sorry, that is an invalid entry");
				displayMenu = scan.nextLine();
				
				
				
				
				
				
			}

		} while (displayMenu.equalsIgnoreCase("repeat"));

		System.out.println("goodbye");scan.hasNext();

		scan.close();
	}
	
	
	
	
	
	
	
	//--------------------------------------------------------------------------
	public static Task makeATask(Scanner scan, Task task, LocalDate dueDate) {
		System.out.println("Please enter your name");
		String userName = scan.nextLine();
		task.settmName(userName);
		scan.hasNext();
		
		System.out.println("Enter the Due Date. (yyyy-dd-mm)");
		LocalDate userDate = null; 
		
		try {
			userDate = LocalDate.parse(scan.nextLine());
			System.out.println();
			
		} catch (DateTimeParseException e) {
			System.out.println("Please enter a date using the correct format.");
			System.out.println();
			scan.hasNext();
		}
		
		task.setdAdded(userDate);
		scan.hasNext();
		scan.hasNext();
		
		System.out.println("Please enter a task description.");
		String userDescription = scan.nextLine();
		task.settskName(userDescription);
		scan.hasNext();

		System.out.println("Status: Incomplete");
		return task;
		
		
	}

	// Method to insert a new node
	public static Task insert(Task list) {
		// Create a new node with given data
		Task new_node = new Task(null, null, null, false);
		new_node.nextTask = null;

		// If the Linked List is empty,
		// then make the new node as head
		if (list.gettmName() == null) {
			list.gettskName();
			list.getdAdded();
			list.gettskStatus();
		}

		// Return the list by head
		return list;
	}

	public static String testComplete(String userComplete) {
		if (userComplete.equalsIgnoreCase("Complete")) {
			return "Task completed";
		}
		return "Task incomplete";
	}

//	public static LinkedList<Integer> displayNum(LinkedList<Integer> num) {
//		for (int i = 0; i < num.size(); i++) {
//			System.out.println(num.get(i));
//		}
//		return num;
//	}
//
//	public static LinkedList<String> displayList(LinkedList<String> list) {
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		return list;
//	}


}
