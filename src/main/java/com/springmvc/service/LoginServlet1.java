package com.springmvc.service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        System.out.println("账号为："+name);
        System.out.println("密码为："+password);

        response.setContentType("text/html; charset=UTF-8");//设置返回时候使用utf-8，支持中文
        String html = "<div style='color:green'>成功！</div>";
        PrintWriter pw = response.getWriter();
        pw.println(html);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
