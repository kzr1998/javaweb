<%--
  Created by IntelliJ IDEA.
  User: 匡志儒
  Date: 2019/5/7
  Time: 1:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <%@ page import="java.util.List,java.util.ArrayList"
  %>
  <%@ page import="java.util.Iterator" %>
  <%
    List list=new ArrayList();
    list.add("jsp基础入门");
    list.add("servlet基础入门");
    list.add("El基础入门");
    list.add("jstl基础入门");
          Iterator it=list.iterator();
          while (it.hasNext()){
              for(int i=1;i<=list.size();i++){
              String str=(String) it.next();
              out.println("第"+i+"条："+"      "+str+"<br>");
          }
      }
%>
</body>
</html>
