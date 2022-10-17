package lecture.p03core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		String configLocation = "/lecture/p03core/context.xml";
		
		ApplicationContext context; 
		context = new ClassPathXmlApplicationContext(configLocation); // spring으로 생각해도 무방
		
		Servlet s = context.getBean(Servlet.class);
		Dao d = context.getBean(Dao.class);
		System.out.println(s); // null이 아니라면 객체가 있다
		System.out.println(d); 
		// 스프링이 객체를 만들고 있다는 것을 확인
		
		System.out.println("프로그램 계속 실행");
	}
}
