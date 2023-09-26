package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {
	private Connection con;
	public List<BoardVO> getList() {
	List<BoardVO> list = new ArrayList<BoardVO>();
	try {
		connect();
		String query ="select * from BBoard";
		PreparedStatement stmt = con.prepareStatement(query);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			BoardVO temp = new BoardVO(
					rs.getString("title"),
					rs.getString("contents"),
					rs.getString("writer")
					);
			list.add(temp);
		}
		rs.close();
		stmt.close();
		con.close();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;
	}
	public BoardVO getcontents(String title) {
		BoardVO temp=null;
		try {
			connect();
			String query ="select * from BBoard where title=? and writer =?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, title);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				temp = new BoardVO(
						rs.getString("title"),
						rs.getString("contents"),
						rs.getString("writer")
						);
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
//	}
////	public BoardVO DBConnection() {
////		try {
////			Statement stmt = con.createStatement();
////			
////			
//		} catch (Exception e) {
//			e.printStackTrace();
//			// TODO: handle exception
//		} {
//			
//		}
//		
//	}

	

	private void connect() throws Exception {
		Context ctx = new InitialContext();// 초기화된 컨텍스트
//		initialize => 초기화 함수
		Context envContext=(Context) ctx.lookup("java:/comp/env");
		DataSource dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		con=dataFactory.getConnection();

}
}