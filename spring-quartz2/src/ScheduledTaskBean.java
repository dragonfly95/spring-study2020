import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ScheduledTaskBean extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        String today = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        System.out.println("스케쥴러 작동 시간 : " + today);
    }
}
