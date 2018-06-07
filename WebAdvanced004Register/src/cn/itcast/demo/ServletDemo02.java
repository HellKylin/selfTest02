package cn.itcast.demo;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;


/**
 * Servlet implementation class ServletDemo02
 */
public class ServletDemo02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletDemo02() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//将提交的参数封装进一个Map集合
		Map<String, String[]> map = request.getParameterMap();
		//获取所有的键
		response.setContentType("text/html;charset=utf-8");
		
		Set<String> set = map.keySet();
		for (String key : set) {
			byte[] buffer = key.getBytes("ISO-8859-1");//字符变字节:编码，乱码是HTML中input标签的name属性的值
		    String string = new String(buffer,"UTF-8");//字节变字符:解码
			System.out.println(string +"  = " +Arrays.toString(map.get(key)));
		}
		System.out.println("====================");
		Person person = new Person();
		try {
			BeanUtils.populate(person, map);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(person);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
