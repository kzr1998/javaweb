package com.imooc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String computer=req.getParameter("computer");
        int i=Integer.parseInt(computer);
        int sum=0;
       for (int n=1;n<=i;n++ ){
           sum+=n;
       }
        String html="<h1 style='color:red'>"+sum+"</h1><hr/>";
        System.out.println("返回给浏览器的相应数据为："+html);
        PrintWriter out=resp.getWriter();
        out.println(html);//讲html发送回浏览器
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
