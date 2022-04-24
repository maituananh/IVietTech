package controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import config.Connect;
import entity.Product;
import enums.Action;

/* /detail?id=1
 * /detail?action=DELETE&id=1
 */

@WebServlet(urlPatterns = "/detail")
public class HomeCrudController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String action = req.getParameter("action");
		Product product = new Product();

		try {
			Connection conn = Connect.openConnect();
			ResultSet rs = null;
			
			if (Objects.nonNull(action) && Objects.equals(action, Action.DELETE.name())) {
				// DELETE
				PreparedStatement pst = conn
						.prepareStatement("DELETE FROM it_products WHERE id = " + Long.parseLong(id));
				pst.executeUpdate();
				resp.sendRedirect(req.getContextPath() + "/");
			} else {
				// Detail
				Statement stmt = conn.createStatement();
				rs = stmt.executeQuery("SELECT * FROM it_products WHERE id = " + Long.parseLong(id));
				if (rs.next()) {
					String name = rs.getString("name");
					BigDecimal price = rs.getBigDecimal("price");
					String description = rs.getString("description");

					product.setId(Long.parseLong(id));
					product.setName(name);
					product.setPrice(price);
					product.setDesctiption(description);
					req.setAttribute("product", product);
					RequestDispatcher dispatcher = req.getRequestDispatcher("/Detail.jsp");
					dispatcher.forward(req, resp);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Connect.closeConnect();
		}
	}
}
