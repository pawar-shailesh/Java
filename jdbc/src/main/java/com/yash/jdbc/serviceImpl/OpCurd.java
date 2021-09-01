package com.yash.jdbc.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
import com.yash.jdbc.service.Operations;

public class OpCurd implements Operations
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shailesh","root","root");
	Statement st=(Statement) con.createStatement();

	@Override
	public void createTable() throws SQLException {
		String table1="create table demoTable"+"("+"RegNumber int(15),"+"OwnerName varchar(30),"+"Type varchar(30),"+"EngineNumber varchar(20)"+")";
		st.execute(table1);
	}

	@Override
	public void insertData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
