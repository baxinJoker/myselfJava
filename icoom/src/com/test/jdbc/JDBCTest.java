package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("数据库驱动加载成功 ！");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/nodedb?characterEncoding=UTF-8","root", "root");
			System.out.println("连接成功，获取连接对象： " + connection);
			//statement对象用于执行sql语句
			statement = connection.createStatement();
			String sql = "insert into goods(id,title) values(4,'王泽')";
			statement.execute(sql);
			System.out.println("数据插入成功");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(statement !=null) {
				try {
					statement.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(connection != null) {
				try {
					connection.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}

}
