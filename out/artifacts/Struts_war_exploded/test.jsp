<%--
  Created by IntelliJ IDEA.
  User: 匡志儒
  Date: 2019/5/7
  Time: 0:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>列出1-1000的质数</title>
</head>
<body>
  <%
    for(int i=2;i<=1000;i++){
        boolean flag=true;
        for(int j=2;j<i;j++){
            if(i%j==0){
                flag=false;
                break;
            }
        }
        if(flag==true){
            out.println("<h1>"+i+"</h1>");
        }
    }
  %>
</body>
</html>
