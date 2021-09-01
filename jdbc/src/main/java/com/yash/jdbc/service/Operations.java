package com.yash.jdbc.service;

import java.sql.SQLException;

public interface Operations 
{
	public void createTable() throws SQLException;
	public void insertData();
	public void updateData();
	public void delete();

}
