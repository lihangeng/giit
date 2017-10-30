package JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) {

		Connection con;
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/giit";
		String user = "root";
		String password = "root";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,password);
			if(!con.isClosed()) 
				System.out.println("succeeded connecting to the Database!");
			//创建statement，用来执行sql语句
			Statement statement = con.createStatement();
			String sql = "select * from book";
			ResultSet rs = statement.executeQuery(sql);
			System.out.println("------");
			String bookTitle;
			while(rs.next()) {
				bookTitle = rs.getString("book_title");
				System.out.println("boolTitle:"+bookTitle);
			}
			rs.close();
			con.close();
		
		}catch(ClassNotFoundException e) {
			System.out.println("数据库驱动类异常");
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("数据库数据成功获取！");
		}
	}

}
