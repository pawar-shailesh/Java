package com.yash.jdbc;
/**
 * Creating car , dealer and engine table and performing CURD operations on the tables.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.Statement;

public class CarAndDealerCURD 
{
	static Logger logger=Logger.getAnonymousLogger();
	//static String table1="create table car"+"("+"RegNumber int(15),"+"OwnerName varchar(30),"+"Type varchar(30),"+"EngineNumber varchar(20)"+")";
	//static String table1="create table dealer"+"("+"DealerRegNumber int(15),"+"ShopName varchar(30),"+"OwnerName varchar(30),"+"Product varchar(20)"+")";
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shailesh","root","root");
		logger.info("Database Connected");
		Statement st=(Statement) con.createStatement();
		//st.execute(table1);
		
		//String insert1="insert into car values (6534,'Shailesh Pawar','Hyundai','1003')";
		//st.executeUpdate(insert1);
		//logger.info("Record Inserted");
		
		ResultSet rs=st.executeQuery("select A.RegNumber,A.OwnerName,A.Type,B.ModelYear,B.MnfDetail,A.EngineNumber FROM car A INNER JOIN ENGINE B ON A.EngineNumber = B.EngineNumber");
	   
		
		// st.execute("CREATE TABLE Car RegNumber int(15),OwnerName varchar(30),type varchar(20),Engine varchar(20)");
		//logger.info("New Table Created..");
		
		while (rs.next()) 
		{
			logger.info("Employee Data "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
		}
	
		con.close();
		st.close();
		rs.close();

	}
		

	}

