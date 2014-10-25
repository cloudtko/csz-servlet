<%@ page language="java" import="java.util.*" 
contentType="text/html;charset=utf-8"%>
<html>
  <head> 
  </head>  
  <body>
    <%
       String message=(String)session.getAttribute("message");
     %>
     <form  action="HandleGuessUrl" methods="post">
         <input type="text" name="guessnumber" size=8>
         <%=message %>
         <input type="submit" value="提交">
          </form>
          <form action="index.jsp" method="post">
             <input type="submit" value="重新得到新的随机数">
          </form>
  </body>
</html>