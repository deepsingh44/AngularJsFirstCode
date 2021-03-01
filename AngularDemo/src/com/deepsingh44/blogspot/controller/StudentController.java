package com.deepsingh44.blogspot.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deepsingh44.blogspot.model.Student;
import com.google.gson.Gson;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private List<Student> students = new ArrayList<>();

	public StudentController() {
		students.add(new Student("A", 1, "Gzb"));
		students.add(new Student("B", 2, "Delhi"));
		students.add(new Student("C", 3, "Lucknow"));
		students.add(new Student("D", 4, "Allahabad"));
		students.add(new Student("E", 5, "Banaras"));
		students.add(new Student("F", 6, "Bihar"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json");
		resp.getWriter().print(new Gson().toJson(students));
	}

}
