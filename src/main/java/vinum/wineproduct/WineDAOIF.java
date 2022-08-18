/**
 * 
 */
package vinum.wineproduct;

import java.sql.Connection;

/**
 * @author user
 *
 */
public interface WineDAOIF {
	public WineDAOIF getInstance();
	public void setConnection(Connection con);
	public String listWine();
	public String searchWine();
	public long selectWine(long productnumber);
	public int insertWine(WineVO wineVO);
	public int updateWine(WineVO wineVO);
	public int deleteWine(long productnumber);
	public void listWineimages();
	public int insertWineimage(WineimageslinkVO wineimageslinkVO);
	public int deleteWineimage(long productimageindex);
	public void listWinefoods();
	public int insertWinefood(WinefoodVO winefoodVO);
	public int deleteWinefood(long productnumber);
}
