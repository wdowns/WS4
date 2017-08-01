import java.util.ArrayList;
/**
 *(b) Write a subclass ExamQuestionSimpleChoice of class ExamQuestion, in which the
 * possibleAnswers are an ArrayList<String>, that is, the answer is supposed to be
 * a choice from the list and the correctAnswer is of type int, representing the position
 * of the correct answer (start counting from 1, since that is what humans normally do).
 * Write a method public int answer(int value) in the subclass that returns full
 * marks if the answer is correct and 0 otherwise. Furthermore, write a suitable public
 * String toString() method, making use of inheritance as far as possible.
 * 
 * @author William Downs
 * @version 07/11/15 
 */

public class ExamQuestionSimpleChoice extends ExamQuestion {
	
    private ArrayList<String> possibleAnswers = new ArrayList<>();
	private int correctAnswer;
	private String question;
	private ExamQuestionSimpleChoice ExamQuestionSimpleChoice;

	public ExamQuestionSimpleChoice(String question, int maximalMark,
			ArrayList<String> possibleAnswers, int correctAnswer) { 
		super(question, maximalMark);
		this.setPossibleAnswers(new ArrayList<String>(possibleAnswers));
		this.correctAnswer = correctAnswer;
	}

	public int answer(int value) {// Method that returns full marks if the answer is correct.
	    
		if (value == this.correctAnswer) {
			return getMaximalMark();
		} else

			return 0;
	}

	public ArrayList<String> getPossibleAnswers() {
		return possibleAnswers;
	}

	public void setPossibleAnswers(ArrayList<String> possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}

	@Override
	public String toString() {
		return super.toString()
				+ ("Possible answers are: 4\n" + "" + "5\n" + "10\n" + "20\n"
						+ "" + "Correct answer position is: 2\n");

	}
}