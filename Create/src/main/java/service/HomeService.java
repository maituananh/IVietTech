package service;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import config.Connect;
import entity.Product;

public class HomeService {
	
	public HomeService() {}

	public List<Product> findAllProduct() {
		Connection conn = Connect.openConnect();
		List<Product> products = new ArrayList<Product>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from it_products");
			while (rs.next()) {
				Long id = rs.getLong("id");
				String name = rs.getString("name");
				BigDecimal price = rs.getBigDecimal("price");
				String description = rs.getString("description");

				Product product = new Product();
				product.setId(id);
				product.setName(name);
				product.setPrice(price);
				product.setDesctiption(description);

				products.add(product);
			}
			return products;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Connect.closeConnect();
		}
		return Collections.emptyList();
	}
}
