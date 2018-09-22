import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */
// class Todoist {
//     Task[] tasks;
//     int size;
// 
//     Todoist() {
//         tasks = new Task[100];
//         size = 0;
//     }

//     public void addTask(Task task){
//         try {
//             tasks[size++] = task;
//         } catch(Exception e) {
//             resize();
//             addTask(task);
//         }
//     }

//     public void resize() {
//         tasks = Arrays.copyOf(tasks, size * 2);
//     }
    // public Task[] getNextTask(String name, int n) {
    //     Task[] gettask = new Task[n];
    //     for (int i = 0; i < size; i++) {
    //         if(tasks[i].getAssignedTo.equals(name) && tasks[i].status.equals("todo")) {
    //             if (tasks[i].important && tasks[i].urgent) {
    //                 return tasks[i];
    //             }
    //         }
    //     }
    //     return null;
    // }
//}

class Task {
    String title;
    String assignedTo;
    int timeToComplete;
    boolean important;
    boolean urgent;
    String status;

    Task() {
        /**
         * { item_description }
         */
    }
    /**
     * Constructs the object.
     *
     * @param      title   The title
     * @param      name    The name
     * @param      time    The time
     * @param      imp     The imp
     * @param      urgent  The urgent
     * @param      status  The status
     */
    Task(String title, String name, int time, boolean imp, boolean urgent, String status) throws Exception{
         if (title.equals("") || title == null)throw new Exception("Title not provided");
        // if (timeToComplete < 0) throw new Exception("Invalid timeToComplete " + time);
        // if (status != "todo" || status != "done")throw new Exception("Invalid status " + status);

        this.title = title;
        this.assignedTo = name;
        this.timeToComplete = time;
        this.important = imp;
        this.urgent = urgent;
        this.status = status;
    }
    /**
     * Gets the title.
     *
     * @return     The title.
     */
    public String getTitle() {
        return title;
    }
    /**
     * Sets the title.
     *
     * @param      title  The title
     */
    public void setTitle(final String title) {
        this.title = title;
    }
    /**
     * Gets the assigned to.
     *
     * @return     The assigned to.
     */
    public String getAssignedTo(){
        return assignedTo;
    }
    /**
     * Sets the assigned to.
     *
     * @param      name  The name
     */
    public void setAssignedTo(final String name){
        this.assignedTo = name;
    }
    /**
     * Gets the time.
     *
     * @return     The time.
     */
    public int getTime(){
        return timeToComplete;
    }
    /**
     * Sets the time.
     *
     * @param      time  The time
     */
    public void setTime(final int time){
        this.timeToComplete = time;
    }
    /**
     * Gets the important.
     *
     * @return     The important.
     */
    public boolean getImportant() {
        return important;
    }
    /**
     * Sets the important.
     *
     * @param      imp   The imp
     */
    public void setImportant(final boolean imp) {
        this.important = imp;
    }
    /**
     * Gets the urgent.
     *
     * @return     The urgent.
     */
    public boolean getUrgent() {
        return urgent;
    }
    /**
     * Sets the urgent.
     *
     * @param      urgent  The urgent
     */
    public void setUrgent(final boolean urgent) {
        this.urgent = urgent; 
    }
    /**
     * Gets the status.
     *
     * @return     The status.
     */
    public String getStatus(){
        return status;
    }
    /**
     * Sets the status.
     *
     * @param      status  The status
     */
    public void setStatus(final String status){
        this.status = status ;
    }
    public String toString() {
        String str = "";
        String imp;
        String urg;
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
                //     todo.addTask(todo, tokens);
                // break;
                // case "print-todoist":
                //     System.out.println(todo);
                // break;
                // case "get-next":
                //     System.out.println(todo.getNextTask(tokens[1]));
                //break;
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
