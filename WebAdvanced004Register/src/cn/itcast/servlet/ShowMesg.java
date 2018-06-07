package cn.itcast.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowMesg
 */
public class ShowMesg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowMesg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=utf-8");
		 PrintWriter out = response.getWriter();
			//怎么实现解耦合?
			out.println("<html>");
			//head
			out.println("<head>");
			out.println("<title>");
			out.println("注册提示");
			out.println("</title>");
			out.println("</head>");
			//body
			out.println("<body>");
			out.println("<font color='red'>");
			//获取跳转时携带的数据
			String mesg = (String)request.getAttribute("mesg");
			out.println(mesg);
			out.println("</font>");
			out.println("</body>");
			
			out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
