import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScheduledTest {

    public static void main(String[] args) {

        String[] xmlList = new String[] {
                "quartz2.xml"
        };
        new ClassPathXmlApplicationContext(xmlList);

//        ScheduledTest
//        ScheduledTaskBean
        
    }
}
