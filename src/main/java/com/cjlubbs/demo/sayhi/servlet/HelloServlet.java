package com.cjlubbs.demo.sayhi.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuweikai
 * Date: 2018-04-30
 * Time: 下午9:48
 */
@WebServlet(name = "HelloServlet")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String param = request.getParameter("token");
        if (!"hi".equalsIgnoreCase(param)) {
            response.getOutputStream().println("Not right token,bye.");
        }
        System.out.println("Hello,welcome to my website.");
    }
}
