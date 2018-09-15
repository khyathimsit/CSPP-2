/**.
 * Scanner class for taking the inputs from the user.
 */
import java.util.Scanner;
/**
 * Solution class for code-eval.
 */
public final class Solution {
     /**
     * Constructs the object.
     */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                q.loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                q.startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                q.displayScore(q);
                break;
                default:
                break;
            }
        }
    }
}
/**.
 * Class for quiz.
 */
class Quiz {
    /**.
     * questions of list type.
     */
    private static List<String> questions;
    /**.
     * answers of string type.
     */
    private static String[] answers;
    /**.
     * Constructs the object.
     */
    Quiz() {
        /**
         * { item_description }
         */
        questions = new List<String>();
        /**
         * { item_description }
         */
        answers = new String[100];
    }
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    public void loadQuestions(final Scanner s, final Quiz quiz, final int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        System.out.println(questionCount + " are added to the quiz");
        // int testCases = Integer.parseInt(s.nextLine());
        // String[] tokens;
        // for (int i = 0; i < testCases; i++) {
        //  tokens = s.nextLine();
        // }
        // for (int i = 0; i< tokens.size(); i++) {
        //  questions.add(tokens[i]);
        // }
        for (int i = 0; i <= questionCount; i++) {
            String tokens = s.nextLine();
            questions.add(tokens);
        }

        if (questionCount < 1) {
            System.out.println("Quiz does not have questions");
        }
        String[] words;
        //for (int i = 0; i < questionCount; i++) {
        words = s.nextLine().split(":");
        if (words.length != 5) {
            System.out.println("Error!Malformed question");
        }
        String[] words1 = words[1].split(",");
        if (words1.length < 2) {
            System.out.println(words[0] + "does not have enough answer choices");
        }
    }

    static String[] words;
    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s, final Quiz quiz, final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object
        for (int i = 0; i <= answerCount; i++) {
            String answer = s.nextLine();
            answers.add(answer);
        }
        for (int i = 1; i <= answerCount; i++) {
            words = s.nextLine().split(":");
            System.out.println("question text " + i + "(" + words[3] + ")");
            System.out.println(words[1].replace(",", "  "));
        }
    }

    /**
     * Displays the score report
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
        int total = 0;
        for (int i = 0; i < questions.size(); i++) {
            System.out.println("question text " + (i + 1));
            if (answers[i] == words[2]) {
                total = total + Integer.parseInt(words[3]); 
                System.out.println("Correct Answer! - Marks Awarded:" + Integer.parseInt(words[3]));
            } else {
                total = total + Integer.parseInt(words[4]);
                System.out.println("Wrong Answer! - Penalty:" + Integer.parseInt(words[4]));
            }
        }
        System.out.println("Total Score:" +total);
    }
}
