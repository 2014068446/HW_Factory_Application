package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utility.*;
import com.utility.PhoneFactory;
import com.model.phone.*;
import com.model.specs.*;


@WebServlet("/ProcessThang")
public class ProcessThang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phone = request.getParameter("phone");
		PrintWriter out = response.getWriter();
		out.println(phone);
		Phone yPhone = new PhoneFactory().getPhone(phone);
		Specs ySpecs = new SpecFactory().getSpecs(phone);
		
		yPhone.setSpecs(ySpecs);
		
		request.setAttribute("phoneData", yPhone);
		request.getRequestDispatcher("display.jsp").forward(request, response);
	}

}
