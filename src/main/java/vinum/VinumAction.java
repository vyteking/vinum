package vinum;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface VinumAction {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)throws Exception;
	
}
