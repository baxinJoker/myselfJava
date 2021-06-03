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
public class LombokTest {//��javaBean entity Bean ��д
	private int id;
	private String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ͳ��ʽ
		LombokTest h1 = new LombokTest();
        h1.setId(1);
        h1.setName("garren");
        System.out.println(h1);
        
		//builder ��ʽ
        LombokTest h2 = LombokTest.builder().id(1).name("gareen").build();
        System.out.println(h2);
	}

}
