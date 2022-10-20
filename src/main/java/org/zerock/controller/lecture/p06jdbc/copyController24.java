package org.zerock.controller.lecture.p06jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.controller.domain.lecture.Customer;

@Controller
@RequestMapping("copyex24")
public class copyController24 {

	@Autowired
	private DataSource ds;

	@GetMapping("sub01")
	public void AllCustomers(
			@ModelAttribute("CustomerList") ArrayList<Customer> list) {
		String sql = "SELECT CustomerID id, CustomerName, City, Address "
				+ "FROM Customers";
		// order by 버튼 만들어서 구현하기

		try (Connection con = ds.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			while (rs.next()) {
				Customer c = new Customer();
				c.setId(rs.getInt("id"));
				c.setName(rs.getString("CustomerName"));
				c.setCity(rs.getString("City"));
				c.setAddress(rs.getString("Address"));

				list.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 3명씩 30페이지

	@GetMapping("sub02")
	public String printCustomers(
			@RequestParam(name = "page", defaultValue = "1") int page,
			@ModelAttribute("CustomerList") ArrayList<Customer> list,
			@ModelAttribute("pageInfo") HashMap<String, Object> pageInfo ) {
		String sql = "SELECT CustomerID id, CustomerName, City, Address "
				+ "FROM Customers "
				+ "ORDER BY CustomerID "
				+ "LIMIT ?, ?";

		try (Connection con = ds.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);) {

			pstmt.setInt(1, (10 * (page - 1)));
			pstmt.setInt(2, 10);
			try (ResultSet rs = pstmt.executeQuery();) {
				while (rs.next()) {
					Customer c = new Customer();
					c.setId(rs.getInt("id"));
					c.setName(rs.getString("CustomerName"));
					c.setCity(rs.getString("City"));
					c.setAddress(rs.getString("Address"));

					list.add(c);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sql = "SELECT COUNT(*) FROM Customers";
		int cnt = 1;
		try (Connection con = ds.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);){
			
			if(rs.next()) {
				cnt = rs.getInt(1);
			}
			
			int lastPage = (cnt -1)/10 +1;
			int firstPage = lastPage - 9;
			int leftPage = 1;
			
			pageInfo.put("firstPage", firstPage);
			pageInfo.put("lastPage", lastPage);
			pageInfo.put("leftPage", leftPage);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return "copyex24/sub01";
	}
	
}
