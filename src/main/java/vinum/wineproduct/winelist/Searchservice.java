/**
 * 
 */
package vinum.wineproduct.winelist;

import static vinum.JdbcUtil.*;
import java.sql.Connection;

/**
 * @author 539-17
 *
 */
public class Searchservice {
	public String search(String searchinput) {
		Connection conn = getConnection();
		return searchinput;
	}
}
