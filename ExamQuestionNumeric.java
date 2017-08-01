import java.util.ArrayList;
import java.util.Collection;
/**
 * Write a subclass ExamQuestionNumeric of class ExamQuestion, in which the answer
 * is supposed to be a numerical answer of type int (again you have to 
 * represent the correct answer).
 * 
 * @author William Downs
 * @version 19/11/15
 */
public class ExamQuestionNumeric extends ExamQuestion {
	
	private int correctAnswer;

	public ExamQuestionNumeric(String question, int maximalMark, int correctAnswer) {
		super(question, maximalMark);
		this.correctAnswer = correctAnswer;
	}

	public int answer(int value) {// Method that returns full marks if the 
		                          // answer is correct and 0 otherwise.
		
		if (value == this.correctAnswer) {
			return getMaximalMark();
		} else

			return 0;
	}

	@Override
	public String toString() {
		return "Question (Maximal mark: 10)\n" + "2+3 = ?\n"
				+ "Correct answer is: 5\n";
	}
}