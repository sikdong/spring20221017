package lecture.p09core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Servlet {
	
	private Dao dao;
	
	//주입가능한 빈이 있다면 이 메소드를 이용해 주입해라
	@Autowired
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	public Dao getDao() {
		return dao;
	}
}
