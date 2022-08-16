/**
 * 
 */
package vinum.wineproduct;
import static vinum.JdbcUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author user
 *
 */
public class WineDAO implements WineDAOIF {
	private Connection con;
	private WineVO wine;
	private static String winetablename = "vinumwine";
	
	@Override
	public WineDAOIF getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setConnection(Connection con) {
		// TODO Auto-generated method stub
		this.con = con;
	}
	
	@Override
	public String listWine() {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String listSQL = "SELECT * FROM "+winetablename;
		try {
			pstmt = con.prepareStatement(listSQL);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				WineVO wineVO = new WineVO();
				wineVO.setProductnumber(rs.getLong(1));
				wineVO.setProducttitle(rs.getString(2));
				wineVO.setProductsubname(rs.getString(3));
				wineVO.setProductregion(rs.getString(4));
				wineVO.setProductprice(rs.getFloat(9));
				wineVO.setProductscore(rs.getFloat(10));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}
		return "list wine";
	}

	@Override
	public long selectWine(long productnumber) {
		// TODO Auto-generated method stub
		long wineNum = 0;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT wineId FROM "+winetablename+" WHERE wineId = ?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setLong(1, productnumber);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				wineNum = rs.getLong("wineId");
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			close(rs);
			close(pstmt);
			
		}
		return wineNum;
	}

	@Override
	public int insertWine(WineVO wineVO) {
		// TODO Auto-generated method stub
		int insertCount=0;		
		PreparedStatement pstmt = null;		
		String sql = "INSERT INTO "+winetablename+" VALUES (?,?,?,?,?,?,?,?,?,?)";
		//String sql = "SELECT * FROM member";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setLong(1, wineVO.getProductnumber());
			pstmt.setString(2, wineVO.getProducttitle());
			//pstmt.setNString(3, wineVO.getProductimagelink());
			pstmt.setString(3, wineVO.getProductregion());
			pstmt.setString(4, wineVO.getProductkind());
			pstmt.setFloat(5, wineVO.getProductsugarcontent());
			pstmt.setFloat(6, wineVO.getProductacidity());
			pstmt.setFloat(7, wineVO.getProductbody());
			pstmt.setFloat(8, wineVO.getProducttannin());
			pstmt.setFloat(9, wineVO.getProductprice());
			
			insertCount = pstmt.executeUpdate();
		}catch  (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);			
		}
		return insertCount;
	}

	@Override
	public int updateWine(WineVO wineVO) {
		// TODO Auto-generated method stub
		int insertCount=0;		
		PreparedStatement pstmt = null;		
		String sql = "INSERT INTO "+winetablename+" VALUES (?,?,?,?,?,?,?,?,?,?)";
		//String sql = "SELECT * FROM member";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setLong(1, wineVO.getProductnumber());
			pstmt.setString(2, wineVO.getProducttitle());
			//pstmt.setNString(3, wineVO.getProductimagelink());
			pstmt.setString(3, wineVO.getProductregion());
			pstmt.setString(4, wineVO.getProductkind());
			pstmt.setFloat(5, wineVO.getProductsugarcontent());
			pstmt.setFloat(6, wineVO.getProductacidity());
			pstmt.setFloat(7, wineVO.getProductbody());
			pstmt.setFloat(8, wineVO.getProducttannin());
			pstmt.setFloat(9, wineVO.getProductprice());
			
			insertCount = pstmt.executeUpdate();
		}catch  (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);			
		}
		return insertCount;
	}

	@Override
	public int deleteWine(long productnumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void listWineimages() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int insertWineimage(WineimageslinkVO wineimageslinkVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteWineimage(long productimageindex) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void listWinefoods() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int insertWinefood(WinefoodVO winefoodVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteWinefood(long productnumber) {
		// TODO Auto-generated method stub
		return 0;
	}

}
