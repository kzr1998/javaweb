<%--
  Created by IntelliJ IDEA.
  User: 匡志儒
  Date: 2019/5/7
  Time: 1:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int x=-5;
    int y=0;
    if(x<0){
        y=-1;
    }else if(x==0){
        y=0;
    }else if(x>0){
    y=1;
    }
%>
<div style="margin: 0 0 0 50%">
 <%out.print("当x<0时，输出");%>
</div>

<div style="margin: 0 0 0 50%">
<%out.print("x"+"="+x);%>
</div>

<div style="margin: 0 0 0 50%">
<%out.println("y"+"="+y);%>
</div>
</body>
</html>
