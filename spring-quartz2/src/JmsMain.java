
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jms.SampleJmsMessageSender;

public class JmsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] xmlList = new String[] {
			"jms.xml"
		};
		ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlList);
		SampleJmsMessageSender sender = (SampleJmsMessageSender) ctx.getBean("SampleJmsMessageSender");
		sender.sendTextMessage("^---------------------^");

	}

}