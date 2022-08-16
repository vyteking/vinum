/**
 * 
 */
package vinum.poll;

/**
 * @author user
 *
 */
public class PollquestionselectVO {
	private long pollindex;
	private short questionindex;
	private byte choiceindex;
	private String choicecontext;
	private String choiceimagelink;
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
	 * @return the choiceindex
	 */
	public byte getChoiceindex() {
		return choiceindex;
	}
	/**
	 * @param choiceindex the choiceindex to set
	 */
	public void setChoiceindex(byte choiceindex) {
		this.choiceindex = choiceindex;
	}
	/**
	 * @return the choicecontext
	 */
	public String getChoicecontext() {
		return choicecontext;
	}
	/**
	 * @param choicecontext the choicecontext to set
	 */
	public void setChoicecontext(String choicecontext) {
		this.choicecontext = choicecontext;
	}
	/**
	 * @return the choiceimagelink
	 */
	public String getChoiceimagelink() {
		return choiceimagelink;
	}
	/**
	 * @param choiceimagelink the choiceimagelink to set
	 */
	public void setChoiceimagelink(String choiceimagelink) {
		this.choiceimagelink = choiceimagelink;
	}
}
