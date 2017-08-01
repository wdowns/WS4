/**
 * Ex1(a) Write a class ExamQuestion with field variables private String
 * question and private int maximalMark. Write a suitable constructor,
 * getters/setters for the two field variables, and a public String toString()
 * method which generates a String of the form
 * "Question (Maximal mark: <maximalMark>\n" + "<question>\n", where
 * <maximalMark> has to be replaced by the maximal mark and "<question>" by the
 * question.
 * 
 * @author William Downs
 * @version 07/11/15
 */
public class ExamQuestion {

	private String question;
	private int maximalMark;

	public ExamQuestion(String question, int maximalMark) {
		this.question = question;
		this.maximalMark = maximalMark;

	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getMaximalMark() {
		return maximalMark;
	}

	public void setMaximalMark(int maximalMark) {
		this.maximalMark = maximalMark;
	}

	@Override
	public String toString() {
		return "Question (Maximal mark: " + maximalMark + ")" + "\n" + question
				+ "\n" + "";

	}

}
