/**
 * 
 */
package vinum.admin.poll.vo;

/**
 * @author user
 *
 */
public class PollVO {
	private long pollId;
	private String pollSubject;
	private String pollDesc;
	private String pollQuestion;
	private String pollAnswer;
	//private int pollquestionsnumber;
	public long getPollId() {
		return pollId;
	}
	public void setPollId(long pollId) {
		this.pollId = pollId;
	}
	public String getPollSubject() {
		return pollSubject;
	}
	public void setPollSubject(String pollSubject) {
		this.pollSubject = pollSubject;
	}
	public String getPollDesc() {
		return pollDesc;
	}
	public void setPollDesc(String pollDesc) {
		this.pollDesc = pollDesc;
	}
	public String getPollQuestion() {
		return pollQuestion;
	}
	public void setPollQuestion(String pollQuestion) {
		this.pollQuestion = pollQuestion;
	}
	public String getPollAnswer() {
		return pollAnswer;
	}
	public void setPollAnswer(String pollAnswer) {
		this.pollAnswer = pollAnswer;
	}
}