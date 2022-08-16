/**
 * 
 */
package vinum.poll;

/**
 * @author user
 *
 */
public class PollquestionVO {
	private long pollindex;
	private short questionindex;
	private String questioncontext;
	/**
	 * @return the pollindex
	 */
	public long getPollindex() {
		return pollindex;
	}
	/**
	 * @param pollindex the pollindex to set
	 */
	public void setPollindex(long pollindex) {
		this.pollindex = pollindex;
	}
	/**
	 * @return the questionindex
	 */
	public short getQuestionindex() {
		return questionindex;
	}
	/**
	 * @param questionindex the questionindex to set
	 */
	public void setQuestionindex(short questionindex) {
		this.questionindex = questionindex;
	}
	/**
	 * @return the questioncontext
	 */
	public String getQuestioncontext() {
		return questioncontext;
	}
	/**
	 * @param questioncontext the questioncontext to set
	 */
	public void setQuestioncontext(String questioncontext) {
		this.questioncontext = questioncontext;
	}
}
