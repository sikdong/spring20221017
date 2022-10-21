package org.zerock.controller.lecture.p06jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex25")
public class Controller25 {
	@Autowired
	private DataSource dataSource;
	
	@RequestMapping("sub01")
	public void method1() throws Exception {
		String sql = "INSERT INTO myTable07 (col1, col2, col3, col4, col5, col6) "
				+ "VALUES(?, ?, ?, ?, ?, ?)";
		
		
		try(Connection con= dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);	
				) {
			pstmt.setInt(1, 9999999);
			pstmt.setDouble(2, 112312.123);
			pstmt.setString(3, "hello");
			pstmt.setString(4, "day");
			pstmt.setDate(5, java.sql.Date.valueOf("2022-10-21"));
			pstmt.setTimestamp(6, Timestamp.valueOf("2022-10-21 11:14:00"));
			
			int cnt = pstmt.executeUpdate();
			
			System.out.println(cnt + "개 레코드 입력 성공");
		}
		
	}
	
	@RequestMapping("sub02")
	public void method2() throws Exception {
		String sql = "INSERT INTO myTable08(name, age, score, address, birthDate, inserted) "
				+ "VALUES(?, ?, ?, ?, ?, ?)";
		
		try(Connection con = dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, "Dongseok");
			pstmt.setInt(2, 29);
			pstmt.setDouble(3, 100.00);
			pstmt.setString(4, "Ansan");
			pstmt.setDate(5, Date.valueOf("1994-11-19"));
			pstmt.setTimestamp(6, Timestamp.valueOf("2022-10-21 11:28:00"));
			
			int cnt = pstmt.executeUpdate();
			
			System.out.println(cnt + "개 입력 성공");
		}
	}
	
	@RequestMapping("sub03")
	public void method3() {
		String sql = "SELECT col1, col2, col3, col4, col5, col6 FROM myTable07";
				
				try(Connection con = dataSource.getConnection();
					java.sql.Statement stmt = con.createStatement();
						ResultSet rs = stmt.executeQuery(sql);
						) {
					while(rs.next()) {
						int col1= rs.getInt("col1");
						double col2 = rs.getDouble("col2");
						String col3 = rs.getString("col3");
						String col4 = rs.getString("col4");
						Date col5 = rs.getDate("col5");
						Timestamp col6 = rs.getTimestamp("col6");
						
						System.out.println(col1);
						System.out.println(col2);
						System.out.println(col3);
						System.out.println(col4);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
	}
	
	@RequestMapping("sub04")
	public void method4(){
		
		String sql = "SELECT name, age, score, address, birthDate, inserted FROM myTable08";
		
		try(Connection con = dataSource.getConnection();
			Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				) {
			while(rs.next()) {
				String name = rs.getString(1);
				int age = rs.getInt(2);
				double score = rs.getDouble(3);
				String address = rs.getString(4);
				Date birthDate = rs.getDate(5);
				Timestamp inserted = rs.getTimestamp(6);
				
				System.out.println(name);
				System.out.println(age);
				System.out.println(score);
				System.out.println(address);
				System.out.println(birthDate);
				System.out.println(inserted);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
