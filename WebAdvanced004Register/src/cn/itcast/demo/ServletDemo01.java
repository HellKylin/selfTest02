package cn.itcast.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo01
 */
public class ServletDemo01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDemo01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getMethod();
		String contentType = request.getContentType();
		String contextPath = request.getContextPath();
		String remoteAddr = request.getRemoteAddr();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(method);
		out.println(contentType);
		out.println(remoteAddr);
		out.println(contextPath);
		
		String value = request.getHeader("user-agent");
		System.out.println(value);
		
		String word = request.getParameter("word");
		System.out.println("转换前:" + word);
		//1、西欧字符变字节(按照 ISO-88590-1)
		byte[] buffer = word.getBytes("ISO-8859-1");
		//2、按照UTF-8 将字节转换成字符
		word = new String(buffer,"UTF-8");
		
		System.out.println("转换后:" + word);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
