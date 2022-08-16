/**
 * 
 */
package vinum.poll;

/**
 * @author user
 *
 */
public class PollVO {
	private long pollindex;
	private String polltitle;
	private String pollauthor;
	//private int pollquestionsnumber;
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
	 * @return the polltitle
	 */
	public String getPolltitle() {
		return polltitle;
	}
	/**
	 * @param polltitle the polltitle to set
	 */
	public void setPolltitle(String polltitle) {
		this.polltitle = polltitle;
	}
	/**
	 * @return the pollauthor
	 */
	public String getPollauthor() {
		return pollauthor;
	}
	/**
	 * @param pollauthor the pollauthor to set
	 */
	public void setPollauthor(String pollauthor) {
		this.pollauthor = pollauthor;
	}
}
