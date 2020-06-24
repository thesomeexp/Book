package com.lnsf.book.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

public class DButil {
	private static String driver = null;
	private static String url = null;
	private static String user = null;
	private static String password = null;
	private static String xmlPath = "database.conf.xml";
	private static String xsdPath = "database.conf.xsd";
	
	public static Connection getConnection()
	{
		Connection conn = null;
		if(XMLValidator.validate(xmlPath, xsdPath))
		{
			HashMap<String,String> hm = XmlParser.parser(xmlPath);
			driver = hm.get("driver");
			url = hm.get("url");
			user = hm.get("user");
			password = hm.get("password");
		}
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
		} 
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("���ݿ������쳣������jar���Ƿ����룡");
			e.printStackTrace();
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("���ݿ������쳣���������Ӳ����Ƿ���ȷ");
			e.printStackTrace();
		}
		return conn;
	}
}
