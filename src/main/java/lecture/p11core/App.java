package lecture.p11core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
	String loc = "/lecture/p11core/context.xml";
	
	ApplicationContext context = new ClassPathXmlApplicationContext(loc);
	
	Servlet s = context.getBean(Servlet.class);
	Dao d = context.getBean(Dao.class);
	
	System.out.println(s);
	System.out.println(d);
	
	
	Controller c = context.getBean(Controller.class);
	Service ser = context.getBean(Service.class );
	
	System.out.println(c.getService());
	System.out.println("연습");
	
	Example1 e1 = context.getBean(Example1.class);
	Example2 e2 = context.getBean(Example2.class);

	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e1.getE2());
	
	
	
	}
}
