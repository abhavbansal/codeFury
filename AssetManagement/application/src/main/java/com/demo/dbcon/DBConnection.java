package com.demo.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static void main(String[] args) throws SQLException {
			//step 1---register driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//			Class.forName("org.apache.derby.jdbc.ClientDriver()");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/easset_management", "root","ketaki20");
			
			if(conn!=null) {
				System.out.println("Established connection successfully!");
			}
			else {
				System.out.println("not done");
			}
	

}
}