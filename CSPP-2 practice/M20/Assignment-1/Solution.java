import java.util.Scanner;
/**
 * Class for question.
 */
class Question {
    /**
     * { var_description }.
     */
    public String questiontext;
    /**
     * { var_description }.
     */
    public String[] choices;
    /**
     * { var_description }.
     */
    private String correctAnswer;
    /**
     * { var_description }.
     */
    private int maxMarks;
    /**
     * { var_description }.
     */
    private int penalty;
    /**
     * { var_description }.
     */
    private String response;
    /**
     * Constructs the object.
     */
    Question() {
    	choices = new String[100];
    }
    /**
     * Constructs the object.
     *
     * @param      question1       The question 1
     * @param      choices1        The choices 1
     * @param      correctAnswer1  The correct answer 1
     * @param      maxMarks1       The maximum marks 1
     * @param      penalty1        The penalty 1
     */
    Question(final String question1, final String[] choices1,
        final String correctAnswer1, final int maxMarks1, final int penalty1) {
    	this.questiontext = question1;
    	this.choices = choices1;
    	this.correctAnswer = correctAnswer1;
    	this.maxMarks = maxMarks1;
    	this.penalty = penalty1;
    }
    /**
     * { function_description }.
     *
     * @param      choice  The choice
     *
     * @return     { description_of_the_return_value }
     */
    public boolean evaluateResponse(final String choice) {
    	String[] tokens1 = choice.split(" ");
    	if (this.correctAnswer.equals(tokens1[1])) {
    		return true;
    	} else {
    		return false;
    	}
    }
    /**
     * Gets the correct answer.
     *
     * @return     The correct answer.
     */
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    /**
     * Gets the question text.
     *
     * @return     The question text.
     */
    public String getQuestionText() {
        return questiontext;
    }
    /**
     * Gets the choice.
     *
     * @return     The choice.
     */
    public String[] getChoice() {
        return choices;
    }
    /**
     * Gets the maximum marks.
     *
     * @return     The maximum marks.
     */
    public int getMaxMarks() {
        return maxMarks;
    }
    /**
     * Gets the penalty.
     *
     * @return     The penalty.
     */
    public int getPenalty() {
        return penalty;
    }
    /**
     * Sets the response.
     *
     * @param      answer  The answer
     */
    public void setResponse(final String answer) {
    	this.response = answer;
    }
    /**
     * Gets the response.
     *
     * @return     The response.
     */
    public String getResponse() {
        return response;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String s = "";
        return s;
    }
}
/**
 * Class for quiz.
 */
class Quiz {
    /**
     * { var_description }.
     */
    private final int onehundred = 100;
    /**
     * { var_description }.
     */
    //private Question[] questions;
    /**
     * { var_description }.
     */
    private List<Question>questions;
    private int size;
    /**
     * Constructs the object.
     */
    Quiz() {
    	questions = new List<Question>();
    	size = 0;
    }
    /**
     * Adds a question.
     *
     * @param      q     The question
     */
    public void addQuestion(final Question q) {
    	questions.add(q);
    	size++;
    }
    /**
     * Gets the question.
     *
     * @param      index  The index
     *
     * @return     The question.
     */
    // public Question getQuestion(final int index) {
    //     return questions[index];
    // }
    // public int getsize() {
    // 	return size;
    // }
    /**
     * Shows the report.
     *
     * @return     { description_of_the_return_value }
     */
    public String showReport() {
        String s = "";
        return s;
    }

    /**
     * Loads questions.
     *
     * @param      scan       The scan
     * @param      quiz       The quiz
     * @param      q          The question count
     *
     */
    public void loadQuestions(final Scanner scan,
        final Quiz quiz, int q) throws Exception {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        int qc = q;
        if (q == 0) {
        	throw new Exception("Quiz does not have questions");
        }
        while(q > 0) {
            String line = scan.nextLine();
        	String[] tokens = line.split(":");
        	if (tokens.length == 5 && (tokens[0]).length() != 0 && (tokens[1]).length() != 0
        		&& (tokens[2]).length() != 0 && (tokens[3]).length() != 0 && (tokens[4]).length() != 0) {
				String[] keys = tokens[1].split(",");
			    if (keys.length >= 2) {
			    	if (Integer.parseInt(tokens[2]) >= 1 && Integer.parseInt(tokens[2]) <= keys.length) {
			    		if (Integer.parseInt(tokens[3]) > 0) {
			    			if (Integer.parseInt(tokens[4]) <= 0) {
			    				quiz.addQuestion(new Question(tokens[0], keys, tokens[2],
				                Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4])));
			    			} else {
			    				throw new Exception("Invalid penalty for " +tokens[0]);	
			    			}
			    		} else {
			    			throw new Exception("Invalid max marks for " +tokens[0]);
			    		}
			    	} else {
			    		throw new Exception("Error! Correct answer choice number is out of range for " + tokens[0]);
			    	}
			    } else {
			    	throw new Exception(tokens[0] + "does not have enough answer choices");
			    }
			} else {
				throw new Exception("Error! Malformed question");
			}
			q--;
		}
		System.out.println(qc + " are added to the quiz");
    }

    /**
     * Starts a quiz.
     *
     * @param      scan  The scan
     * @param      quiz  The quiz
     * @param      q     The answer count
     */
    public void startQuiz(final Scanner scan,
        final Quiz quiz, final int q) {
        // write your code here to display the quiz questions on the console.
        // read the user responses from the console using scanner object.
        // store the user respone in the question object
        for (int i = 0; i < questions.size(); i++) {
        	System.out.println(questions.get(i).getQuestionText() + "(" + questions.get(i).getMaxMarks() + ")");
        	int j = 0;
        	for (j = 0 ; j < questions.get(i).choices.length - 1; j++) {
        		System.out.print(questions.get(i).choices[j] +"\t");
        	}
        	System.out.println(questions.get(i).choices[j]);
        	System.out.println();
        	String line1 = scan.nextLine();
        	questions.get(i).setResponse(line1);
        }
    }
    /**
     * Displays the score report.
     *
     * @param      quiz     The quiz object
     */
    public void displayScore(final Quiz quiz) {
        // write your code here to display the score report using quiz object.
        int total = 0;
        if (questions.size() > 0) {
        	for (int i = 0; i < questions.size(); i++) {
            	System.out.println(questions.get(i).getQuestionText());
            	if (questions.get(i).evaluateResponse(questions.get(i).getResponse())) {
            		System.out.println(" Correct Answer! - Marks Awarded: " + questions.get(i).getMaxMarks());
					total += questions.get(i).getMaxMarks();
				} else {
                	System.out.println(" Wrong Answer! - Penalty:" + questions.get(i).getPenalty());
                	total += questions.get(i).getPenalty();
                }
            }
        }
        System.out.println("Total Score:" +total);
    }
}
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
                try {
                	System.out.println("|----------------|");
                    System.out.println("| Load Questions |");
                	System.out.println("|----------------|");
                	q.loadQuestions(s, q, Integer.parseInt(tokens[1]));
                } catch (Exception e) {
                	System.out.println(e.getMessage());
                }
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
