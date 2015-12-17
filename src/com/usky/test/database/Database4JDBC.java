/**
 * 
 */
package com.usky.test.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Administrator
 */
public class Database4JDBC
{
	private Connection conn;

	private Statement  stmt;

	private ResultSet  rs;

	public Connection getConn()
	{
		return conn;
	}

	public Statement getStmt()
	{
		return stmt;
	}

	public ResultSet getRs()
	{
		return rs;
	}

	public void init()
	{
		try
		{
			// ע�����ݿ���������Ϊoracle����
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch (ClassNotFoundException e)
		{
			// ����д��Ϊ�˷�����Գ��򣬳����ӡmydb()��֪����ʲô�ط�������
			System.err.println("mydb(): " + e.getMessage());
		}
		try
		{
			conn = DriverManager
			        .getConnection("jdbc:oracle:thin:@192.168.30.37:1521:ora9",
			                "jedi", "jedi");
		}
		catch (SQLException ex)
		{
			System.err.println("conn:" + ex.getMessage());
		}
		if (conn != null)
			System.out.println("connection successful");
		else
			System.out.println("connection failure");
	}

}
