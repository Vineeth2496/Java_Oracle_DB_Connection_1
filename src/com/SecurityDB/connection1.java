package com.SecurityDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.properties.jdbcCon;

public class connection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		// Step1 create object for oracle O_CLI
		oracle.jdbc.driver.OracleDriver o=new oracle.jdbc.driver.OracleDriver();
		
		// step2 Register with DriverManager
		// public static void registerDriver(Object);
		DriverManager.registerDriver(o);
		
		//	step3 Connection with Driver Manager
		
		Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "vine96");
		System.out.println(conn);
			
		Statement st=conn.createStatement();
		//	int i=st.executeUpdate("create table bikes(Srno int, BikeName varchar2(20), Engine_CC varchar2(15),Model varchar2(8),Selling_Price float )");
		int i=st.executeUpdate("insert into bikes values(01,'Royal Enfield','350','2012',200000)");
		System.out.println("Updated: "+i);

/*
 			jdbcCon c=new jdbcCon();
			Connection con=c.con();
			System.out.println(con);
			
			con.setAutoCommit(false);
			Statement st1=con.createStatement();
			
			String qr1="create table movie(cenima varchar2(15), hero varchar2(15), heroine varchar2(15), Director varchar2(15))";
			st1.addBatch(qr1);

			String qr2="insert into movie values('Major', 'Adivi sesh', 'Saiee', 'Venampalli')";
			st1.addBatch(qr2);

			String qr3="insert into movie values('Badri', 'Pawan kalyan', 'Renu, Ameesha', 'Puri Jagan')";
			st1.addBatch(qr3);

			String qr4="insert into movie values('Darling', 'Prabhas', 'Kajol', 'Karunakaran')";
			st1.addBatch(qr4);
			int i[]=st1.executeBatch();
			
			for(int x:i)
			{
				con.commit();
				System.out.println("Updated qurries: "+x);
			}
						
 */
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}

}
