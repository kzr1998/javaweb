<%--
  Created by IntelliJ IDEA.
  User: 匡志儒
  Date: 2019/5/7
  Time: 0:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <%
      int sum=0;
   for(int i=1;i<=100;i++){
       sum+=i;
   }
  %>
    <%out.println("sum"+"="+sum);%>
</body>
</html>
