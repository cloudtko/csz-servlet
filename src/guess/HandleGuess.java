package guess;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HandleGuess extends HttpServlet {  
   public void doPost(HttpServletRequest request,HttpServletResponse response)
		   throws ServletException,IOException{
	   request.setCharacterEncoding("utf-8");
	   response.setContentType("text/html;charset=utf-8");
	   PrintWriter out=response.getWriter();	  
	 //获取客户猜测提交的数
	   int guessNumber=Integer.parseInt(request.getParameter("guessnumber"));
	   //获取客户的会话对象
	   HttpSession session=request.getSession();
	   Integer integer=(Integer)session.getAttribute("saveNumber");
	   int realNumber=integer.intValue();
	   System.out.println(realNumber);
	   System.out.println(guessNumber);
	   if(guessNumber>realNumber){
		   session.setAttribute("message", "您猜大了");
		   System.out.println("您猜大了---no");
		   response.sendRedirect("input.jsp");
	   }
	   else if(guessNumber<realNumber){
		   session.setAttribute("message", "您猜小了");
		   System.out.println("您猜小了---no");
		   response.sendRedirect("input.jsp");
	   }
	   else{
		   session.setAttribute("message", "您猜对了");
		   System.out.println("您猜对了");
		   response.sendRedirect("input.jsp");
	   }
   }
   public void doGet(HttpServletRequest request,HttpServletResponse response)
          throws ServletException,IOException{
	   doPost(request,response);
   }
   
}
