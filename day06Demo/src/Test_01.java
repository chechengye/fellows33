import weichuang.tools.DateFormatUtils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test_01 {

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.toString());

        Calendar c = new GregorianCalendar();
        Calendar c1 = Calendar.getInstance(); //月份是0-11
        System.out.println(c1.get(Calendar.YEAR) +
                "年" + (c1.get(2) + 1)
                + "月" + c1.get(Calendar.DAY_OF_MONTH)
                + "日" + c1.get(Calendar.HOUR) + ":" +
                c1.get(Calendar.MINUTE) + ":" + c1.get(Calendar.SECOND)
                + ":" + c1.get(Calendar.MILLISECOND));

        /*DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(df.format(d));*/

        System.out.println(DateFormatUtils.getFormatDate(d));

    }
}
