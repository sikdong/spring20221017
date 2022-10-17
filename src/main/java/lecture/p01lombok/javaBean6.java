package lecture.p01lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // 모든 필드를 아규먼트로 받는 생성자 생성
@NoArgsConstructor
public class javaBean6 {
	private String name;
	private int age;
	
	
}
