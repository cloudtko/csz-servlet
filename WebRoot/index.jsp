<%@ page language="java" import="java.util.*" pageEncoding="utf-8" 
contentType="text/html;Charset=utf-8"%>
<html>
  <head>
  </head>  
  <body>
    <% session.setAttribute("message", "请您猜数");
   // HttpSession session =request.getSession(true);
   int randomNumber=(int)(Math.random()*100)+1;//获取一个随机数
   session.setAttribute("saveNumber",new Integer(randomNumber));
     %>
     <p>访问或刷新该页面可以随机跌倒一个1，到100之间的数字
     <br>单击下面链接可以访问去猜数字
     <a href="input.jsp">去猜数字</a>
  </body>
</html>