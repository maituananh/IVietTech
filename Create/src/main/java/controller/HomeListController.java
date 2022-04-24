package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Product;
import service.HomeService;

@WebServlet(urlPatterns = { "/", "/home" })
public class HomeListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HomeService homeService;

	@Override
	public void init() throws ServletException {
		this.homeService = new HomeService();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Home [Get]");
		List<Product> products = homeService.findAllProduct();

		req.setAttribute("products", products);
		RequestDispatcher dispatcher = req.getRequestDispatcher("Home.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("first_name"));
	}
}
