package lecture.p01lombok;

public class App {
	public static void main(String[] args) {
		System.out.println("메인 메소드 1");
		
		JavaBean1 j1 = new JavaBean1();
		
		j1.setName("jisung");
		j1.setAddress("seoul");
		j1.setAge(30);
		
		JavaBean2 j2 = new JavaBean2();
		String company2 = j2.getCompany();
		int score2 = j2.getScore();
		String location2 = j2.getLocation();
		
		JavaBean4 j4 = new JavaBean4();
		j4.setAddress("korea");
		j4.setScore(4);
		
	}
}
