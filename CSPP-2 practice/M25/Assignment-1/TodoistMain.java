import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */
// class Todoist {
//     Task[] = tasks;
//     int size;

//     Todoist() {
//         tasks = new Task[100];
//         size = 0;
//     }

//     public void addTask(Task task){
//         tasks[size] = task;
//         size++;
//     }
// }

class Task {
    String title;
    String assignedTo;
    int timeToComplete;
    boolean important;
    boolean urgent;
    String status;

    Task() {

    }

    Task(String title, String name, int time, boolean imp, boolean urgent, String status) throws Exception{
        if (title.length() == 0) {
            throw new Exception("Title not provided");
        }
        if (time < 0) {
            throw new Exception("Invalid timeToComplete " + time);
        }
        if (status != "todo" || status != "done") {
            throw new Exception("Invalid status " + status);
        }
        //             else {
        //                 throw new Exception("Invalid status " + tokens[6]);
        //             }
        //         } else {
        //             throw new Exception("Invalid timeToComplete " + tokens[3]);
        //         }
        //     // } else {
        //     //     throw new Exception("Title not provided");
        //     // }
        // }
        
        this.title = title;
        this.assignedTo = name;
        this.timeToComplete = time;
        this.important = imp;
        this.urgent = urgent;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAssignedTo(){
        return assignedTo;
    }
    public void setAssignedTo(String name){
        this.assignedTo = name;
    }
    public int getTime(){
        return timeToComplete;
    }
    public void setTime(int time){
        this.timeToComplete = time;
    }
    public boolean getImportant() {
        return important;
    }
    public void setImportant(boolean imp) {
        this.important = imp;
    }
    public boolean getUrgent() {
        return urgent;
    }
    public void setUrgent(boolean urgent) {
        this.urgent = urgent; 
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status ;
    }
    public String toString() {
        String str = "";
        String imp;
       // String imp1 = "Not Important";
        String urg;
        //String urgent1 = "Not Urgent";
        if (important) {
            imp = "Important";
        } else {
            imp = "Not Important";
        }

        if (urgent) {
            urg = "Urgent";
        } else {
            urg = "Not Urgent";
        }


        return str += getTitle() + ", " + getAssignedTo() + ", " + getTime() + ", " + imp
                                 + ", " + urg + ", " + getStatus(); 
    }


}

/**
 * Class for todoist main.
 */
public class TodoistMain {

    /**
     * Starts a test.
     */
    public static void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
                case "task":
                    testTask(tokens);
                break;
                // case "add-task":
                //     testAddTask(todo, tokens);
                // break;
                // case "print-todoist":
                //     System.out.println(todo);
                // break;
                // case "get-next":
                //     System.out.println(todo.getNextTask(tokens[1]));
                // break;
                // case "get-next-n":
                //     int n = Integer.parseInt(tokens[2]);
                //     Task[] tasks = todo.getNextTask(tokens[1], n);
                //     System.out.println(Arrays.deepToString(tasks));
                // break;
                // case "total-time":
                //     System.out.println(todo.totalTime4Completion());
                // break;
                default:
                break;
            }
        }
    }

    /**

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        String title = tokens[1];
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[3]);
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
        return new Task(
            title, assignedTo, timeToComplete, important, urgent, status);
    }

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}
