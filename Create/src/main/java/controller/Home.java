package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import config.Connect;
import entity.Student;

@WebServlet(urlPatterns = "/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Student> students = new ArrayList<Student>();
		Connection conn = Connect.getConn();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			while (rs.next()) {
				Long id = rs.getLong("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String address = rs.getString("address");

				Student student = new Student();
				student.setId(id);
				student.setName(name);
				student.setAge(age);
				student.setAddress(address);

				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		req.setAttribute("students", students);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/BookList.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("first_name"));
	}

}
