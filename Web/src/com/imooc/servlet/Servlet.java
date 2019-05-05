package com.imooc.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收请求发来的参数
        String name=req.getParameter("name");
        String html="<h1 style='color:red'>hi,"+name+"!</h1><hr/>";
        System.out.println("返回给浏览器的相应数据为："+html);
        PrintWriter out=resp.getWriter();
        out.println(html);//把html发送回浏览器
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
