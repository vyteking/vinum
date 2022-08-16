/**
 * 
 */
package vinum.poll;

/**
 * @author user
 *
 */
public interface PollDAOIF {
	public void listPolls();
	public long selectPoll(long pollindex);
	public int insertPoll(PollVO pollVO);
	public int updatePoll(PollVO pollVO);
	public int deletePoll(long pollindex);
	public void listPollquestions(long pollindex);
	public int insertPollquestion(PollquestionVO questionVO);
	public int updatePollquestion(PollquestionVO questionVO);
	public int deletePollquestion(short questionindex);
	public void listPollquestionchoices(long pollindex, short questionindex);
	public int insertPollquestionchoice(PollquestionselectVO choiceVO);
	public int updatePollquestionchoice(PollquestionselectVO choiceVO);
	public int deletePollquestionchoice(byte choiceindex);
}
