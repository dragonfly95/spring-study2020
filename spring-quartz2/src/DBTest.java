import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] xmlList = new String[] {
				"bean.xml","DB.xml"
		};
		 ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlList);
		 
//			@Autowired(required = false)
//			protected SqlSessionTemplate sqlSession;
		 SqlSessionTemplate sqlSession = (SqlSessionTemplate) ctx.getBean("sqlSession");
		 
		// 마스터 테이블 불러오기 (configure.xml에 마스터,디테일 속성 추가)
		List<Table1> pollDataList = sqlSession.selectList("DB_INTERFACE_001.SelectTable1");

		int index = 0;
		for (Table1 table1 : pollDataList) {
			if(index == 1) {
				System.out.println(table1.getAge());
			}
			index++;
		}
		
		System.out.println(pollDataList);
	}
}
