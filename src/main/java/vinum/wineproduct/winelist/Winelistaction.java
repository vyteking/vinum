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
public class Winelistaction implements VinumAction {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String productname = request.getParameter("productname");
		String productsubname = request.getParameter("productsubname");
		String productcountryregion = request.getParameter("productcountryregion");
		String productprice = request.getParameter("productprice");
		String productscore = request.getParameter("productscore");
		
		return null;
	}

}
