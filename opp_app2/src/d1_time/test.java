package d1_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class test {
    public static void main(String[] args) throws ParseException {
        String start = "2023年11月11日 0:0:0";
        String end  = "2023年11月11日 0:10:0";
        String xj  = "2023年11月11日 0:01:18";
        String xp  = "2023年11月11日 0:10:20";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(start);
        Date endDate = sdf.parse(end);
        Date xidate = sdf.parse(xj);
        Date xpdate = sdf.parse(xp);

        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long xidateTime = xidate.getTime();
        long xpdateTime = xpdate.getTime();

        if(xidateTime > startTime && xidateTime < endTime) {
            System.out.println("秒杀成功！！");
        }else {
            System.out.println("秒杀失败");
        }

        if(xpdateTime > startTime && xpdateTime < endTime) {
            System.out.println("秒杀成功！！");
        }else {
            System.out.println("秒杀失败");
        }



    }
}
