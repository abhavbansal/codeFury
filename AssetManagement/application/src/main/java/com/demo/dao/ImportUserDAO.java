package com.demo.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hsbc.DBconnection.DBConnection;

public class ImportUserDAO {


	public static void main(String[] args) {

		Connection conn = DBConnection.getConnection();

		String query = "insert into Users(Username,Name,Phone_Number,Email,Last_Login_Time,Password,Role) values(?, ?, ?, ?, ?, ?, ? )";

		//Code block for importing users through json file
	}
}