/**
 * 
 */
package vinum.wineproduct.winelist;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vinum.ActionForward;
import vinum.VinumAction;

/**
 * @author 539-17
 *
 */
public class SearchAction implements VinumAction {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String searchbartextinput = request.getParameter("searchbartextinput");
		
		Searchservice searchservice = new Searchservice();
		return null;
	}

}
