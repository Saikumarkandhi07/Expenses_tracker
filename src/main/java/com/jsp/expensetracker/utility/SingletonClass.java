package com.jsp.expensetracker.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonClass {
	//the class for which programmer can create inly one object
		//to establish connection
		
		
		
		private static SingletonClass sc;
		private Connection connect;
		
		private SingletonClass()
		{
			
		}
		
		public static SingletonClass getSingletonClassObject()
		{
			if(sc==null)
			{
				sc=new SingletonClass();
				return sc;
			}
			return sc;
		}
		
		
		
		public  Connection getConnect()
		{
			String url="jdbc:mysql://localhost:3306/expencetracker51?user=root&password=12345";
			try {
				
					Class.forName("com.mysql.jdbc.Driver");
				
				connect=DriverManager.getConnection(url);
				return connect;

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	}