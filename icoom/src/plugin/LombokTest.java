package plugin;

import com.icoom.Hero;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Builder
public class LombokTest {//对javaBean entity Bean 简写
	private int id;
	private String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//传统方式
		LombokTest h1 = new LombokTest();
        h1.setId(1);
        h1.setName("garren");
        System.out.println(h1);
        
		//builder 方式
        LombokTest h2 = LombokTest.builder().id(1).name("gareen").build();
        System.out.println(h2);
	}

}
