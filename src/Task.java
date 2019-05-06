import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Task { //class
		   
	// instance variables
	private String teamName;
	private LocalDate dateAdded;
	private String taskName; 
	private boolean taskStatus;
	
	Task nextTask = null; //A Task contains another Task. This is called a self referencing data structure
	
	//Constructor tells computer where to put data when you create the task from within you main... 
	//renaming to shorter to help differentiate scope of data being passed in
    Task(String tskName, String tmName, LocalDate dAdded, boolean tskStatus){
          taskName = tskName;
          teamName = tmName;
          dateAdded = dAdded;
          taskStatus = tskStatus;
	}
		
	public String gettmName() {
		return gettmName();
	}

	public void settmName(String tmName) {
		teamName = tmName;
	}

	public LocalDate getdAdded() {
		return getdAdded();
	}

	public void setdAdded(LocalDate dAdded) {
		dateAdded = dAdded;
	}

	public String gettskName() {
		return taskName;
	}

	public void settskStatus(String tskName) {
		taskName = tskName;
	}

	public boolean gettskStatus() {
		return taskStatus;
	}

	public void setComplete(boolean userComplete) {
		taskStatus = userComplete;
	}

	public void settskName(String userDescription) {
		// TODO Auto-generated method stub
		
	}

	public Object gettmName1() {
		// TODO Auto-generated method stub
		return null;
	}

}




//public class TaskList {
//	
//    Task headTask; // head of list 
//    
//  //-.-.-.-.-.-.-.-.-.-.-.-.TASK LIST METHODS-.-.-.-.-.-.-.-.-.-.-.-.:
//    // ......  create_addNewTask METHOD  ......
//        public static TaskList create_addNewTask(Task newTask)
//        {
//                //First:  Create a new Task with given data
//                newTask.nextTask= null;
//
//                //Check if TaskList is empty --- if empty, make set headTask of list equal to the newly created Task
//                if (this.headTask == null) {
//                    this.headTask = newTask;
//                }
//                else {
//                    // Else traverse till the last task....
//                    // Initialize lastTask to front of list --- starting place
//                    Task lastTask = this.headTask;                     //lastTask could be called tailTask, endTask, endofList, mostRecentTask
//                    // Next we "feel in the dark" for a null nextTask... if nextTask is null, it implies you've found the end of the list
//                    while (lastTask.nextTask != null) {
//                        lastTask = lastTask.nextTask;
//                    }
//
//                    // Insert the newTask at end of list
//                    lastTask.nextTask = newTask;
//                }
//
//                //Finally:  Return the list by head
//                return allTasks;
//
//        }
//    // ..........  END OF create_addNewTask METHOD  ............
//
//
//
//
//
//    // ............  deleteByTaskName METHOD  ............
//    public static void deleteByTaskName(String taskToDelete)
//    {
//            // Store headTask, create previousTask as temporary placeholder
//            Task currentTask = this.headTask;
//            Task previousTask = null;
//
//
//            // CASE 1:
//            // If headTask itself holds the taskName to be deleted
//            if (currentTask != null && currentTask.taskName == taskToDelete) {
//
//                this.head = currentTask.nextTask; // Changed head
//                System.out.println(taskToDelete + " found and deleted");   // Display the message
//            }
//            // end CASE 1
//
//
//            // CASE 2: The key is somewhere other than at head
//            // Search for the taskToDelete by name, keep track of the previousTasknode --- it is needed to change currentTask.next
//            while (currentTask != null && currentTask.taskName != taskToDelete) {
//                // If currentTask does not match taskToDelete --- continue to next Task in allTasks
//                previousTask = currentTask;
//                currentTask = currentTask.nextTask;
//            }
//
//            // If the taskToDelete was present, it should be at currentTask --- therefore the currentTask shall not be null
//            if (currentTask != null) {
//                // Since the taskName is at currentTask --- Unlink currentTask from allTasks
//                previousTask.nextTask= currentTask.nextTask;
//                System.out.println(tasktoDelete + " found and deleted");    // Display the message
//            }
//            //end CASE 2
//
//
//            // CASE 3: The taskName is not present
//            //              If taskName was not present in allTasks --- currentTask should be null
//            if (currentTask == null) {
//                System.out.println(taskToDelete + " not found");
//            }
//            // end Case 3
//    }
//    // .........END OF deleteByTaskName METHOD...............
//
//
//    // ............  printTasks METHOD  ............
//    // Method to print the LinkedList.
//        public static void printTasks()
//        {
//                Task currentTask = this.headTask;
//                System.out.print("Task List: ");
//
//                // Traverse through the LinkedList... print each one by one until reaching tail of List (when nextTask = null)
//                while (currentTask != null) {
//                    System.out.print(currentTask.data + " ");        // Print the data at current node
//                    currentTask = currentTask.nextTask;        // Go to next node
//                }
//        }
//    // ..........  END OF printTasks METHOD  ............
////-.-.-.-.-.-.-.-.-.-.-.-.END OF TASKLIST METHODS-.-.-.-.-.-.-.-.-.-.-.-.
//}
//

