package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import board.Writer;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class WriterDAO {
	private Connection con;
	public Writer insert(String title,String contents,String writer) throws SQLException {
		String query = "insert into BBoard (title,contents,writer) values (?,?,?)";
		PreparedStatement pstmt = null;
		Writer temp=null;
		ResultSet rs = pstmt.executeQuery();
		try {
			if(title!=null&&contents!=null&&writer!=null) {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, title);
			pstmt.setString(2, contents);
			pstmt.setString(3, writer);
			}
			temp=new Writer(title,contents,writer);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return temp;
	}
	
	private void connect() throws Exception {
		Context ctx = new InitialContext();// 초기화된 컨텍스트
//		initialize => 초기화 함수
		Context envContext=(Context) ctx.lookup("java:/comp/env");
		DataSource dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		con=dataFactory.getConnection();

	}
}
