package com.yash.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;

public class DatabaseConnection {
	static Logger logger=Logger.getAnonymousLogger();

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shailesh","root","root");
		logger.info("Database Connected");
		Statement st=(Statement) con.createStatement();
		ResultSet rs=st.executeQuery("select * from employees");
		while (rs.next()) {
			//System.out.println("Employee Data "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			logger.info("Employee Data "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		//ResultSetMetaData rsmt=(ResultSetMetaData);
		//java.sql.ResultSetMetaData rsmt=
		con.close();
		st.close();
		rs.close();

	}

}
