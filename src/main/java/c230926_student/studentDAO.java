package c230926_student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class studentDAO {
	private Connection con;
	public List<studentVO> getList() {
		List<studentVO> list = new ArrayList<studentVO>();
		try {
			connect();
			String query ="select * from student";
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				studentVO temp = new studentVO(
						rs.getInt("idnumber"),
						rs.getString("name"),
						rs.getString("nickname"),
						rs.getString("password"),
						rs.getInt("age"),
						rs.getString("gitaddress")
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
	public studentVO getStudentID(String nickname) {
		studentVO temp=null;
		try {
			connect();
			String query ="select * from student where nickname=? and password=?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, nickname);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				temp = new studentVO(
						rs.getInt("idnumber"),
						rs.getString("name"),
						rs.getString("nickname"),
						rs.getString("password"),
						rs.getInt("age"),
						rs.getString("gitaddress")
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
	public studentVO getStudentId(int id) {
		studentVO temp=null;
		try {
			connect();
			String query ="select * from student where id=?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				temp = new studentVO(
						rs.getInt("idnumber"),
						rs.getString("name"),
						rs.getString("nickname"),
						rs.getString("password"),
						rs.getInt("age"),
						rs.getString("gitaddress")
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
	public studentVO getStudentname(String name) {
		studentVO temp=null;
		try {
			connect();
			String query ="select * from student where password=?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, name);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				temp = new studentVO(
						rs.getInt("idnumber"),
						rs.getString("name"),
						rs.getString("nickname"),
						rs.getString("password"),
						rs.getInt("age"),
						rs.getString("gitaddress")
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
	private void connect() throws Exception {
		Context ctx = new InitialContext();// 초기화된 컨텍스트
//		initialize => 초기화 함수
		Context envContext=(Context) ctx.lookup("java:/comp/env");
		DataSource dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		con=dataFactory.getConnection();
		
//		Class.forName("oracle.jdbc.OracleDriver");
//		
//		con = DriverManager.getConnection(
//				"jdbc:oracle:thin:@localhost:1521/xe",
//				"java",
//				"qwer"
//				);
	}

}
