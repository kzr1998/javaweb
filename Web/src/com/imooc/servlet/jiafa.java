package com.imooc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.io.PrintWriter;


public class jiafa extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1=req.getParameter("shu1");
        String num2=req.getParameter("shu2");
        int a=Integer.parseInt(num1);
        int b=Integer.parseInt(num2);
        int sum=a+b;
        String html="<h1 style='color:red'>"+sum+"</h1><hr/>";
        PrintWriter out=resp.getWriter();
        out.println(html);//讲html发送回浏览器
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
