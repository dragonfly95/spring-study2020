import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] xmlList = new String[] {
				"bean.xml","DB.xml"
		};
		 ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlList);
		 
		 HelloVO vo = (HelloVO) ctx.getBean("hello");
		 System.out.println(vo);
		
		 HelloVO vo2 = (HelloVO) ctx.getBean("info");
		 System.out.println(vo2);

		 HelloVO vo3 = (HelloVO) ctx.getBean("info2");
		 System.out.println(vo3);

	}

}
