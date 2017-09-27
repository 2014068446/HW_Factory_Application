package com.controller;

import java.io.IOException;
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
	
		request.getRequestDispatcher("display.jsp").forward(request, response);
		System.out.print("gago");
	}

}
