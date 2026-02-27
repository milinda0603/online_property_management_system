package com.property.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.property.model.insertpay;
import com.property.util.dbconnection;

public class PaymentController {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean insertdata (String  paymentoption,String NameofCard,String Amount,String CardNumber,String ExpMonth,String ExpYear,String cvv)
{
		

		boolean isSuccess = false;
		try {
			con = dbconnection.getConnection();
			stmt = con.createStatement(); 

			//stmt.getConnection().createStatement();
			
			String sql = "INSERT INTO pay VALUES(0, '"+paymentoption+"', '"+NameofCard+"', '"+Amount+"', '"+CardNumber+"', '"+ExpMonth+"', '"+ExpYear+"', '"+cvv+"')";

			int rs= stmt.executeUpdate(sql);
			if(rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
		}
	
	public static List<insertpay>getById(String Id){//mama wenas kara int ekata
		int convertedID = Integer.parseInt(Id);
		
		ArrayList <insertpay> pay = new ArrayList<>();
		
		try {
			//DBconnection
			con = dbconnection.getConnection();
			stmt = con.createStatement(); 
			
			//Query
			String sql = "select * from pay where id '"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String paymentoption = rs.getString(2);
				String NameofCard = rs.getString(3);
				String Amount = rs.getString(4);
				String CardNumber = rs.getString(5);
				String ExpMonth = rs.getString(6);
				String ExpYear = rs.getString(7);
				String cvv = rs.getString(8);
				
				insertpay pa = new insertpay(id,paymentoption,NameofCard,Amount,CardNumber,ExpMonth,ExpYear,cvv);
				pay.add(pa);
			}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return pay;
	}
	
	//GetAllData
	public static List<insertpay> getAllPay (){
		
		ArrayList <insertpay> pays = new ArrayList<>();
		
		try {
			//DBconnection
			con = dbconnection.getConnection();
			stmt = con.createStatement(); 
			
			//Query
			String sql = "select * from pay ";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String paymentoption = rs.getString(2);
				String NameofCard = rs.getString(3);
				String Amount = rs.getString(4);
				String CardNumber = rs.getString(5);
				String ExpMonth = rs.getString(6);
				String ExpYear = rs.getString(7);
				String cvv = rs.getString(8);
				
				insertpay pa = new insertpay(id,paymentoption,NameofCard,Amount,CardNumber,ExpMonth,ExpYear,cvv);
				pays.add(pa);
			}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return pays;
		
	}
	public static boolean updatedata(String id,String paymentoption,String NameofCard,String Amount,String CardNumber,String ExpMonth,String ExpYear,String cvv) {
		try {
			//DBconnection
			con = dbconnection.getConnection();
			stmt = con.createStatement(); 
			
			String sql= "update pay set paymentoption= '"+paymentoption+"',NameofCard= '"+NameofCard+"',Amount= '"+Amount+"',CardNumber= '"+CardNumber+"',ExpMonth= '"+ExpMonth+"',ExpYear= '"+ExpYear+"',ExpYear= '"+ExpYear+"'"
					+ "where id ='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return isSuccess;
	}
	//Delete data
	public static boolean deletedata(String id) {
		int convID = Integer.parseInt(id);
		try {
			//DBconnection
			con = dbconnection.getConnection();
			stmt = con.createStatement(); 
			String sql = "delete from pay where id = '"+convID+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	
}
