package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class day03_3 {
    public static long getms(String data) throws DataFormaterNotRightException {
        long ms=0;
        SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date=sDateFormat.parse(data);
            Calendar cal= Calendar.getInstance();
            cal.setTime(date);
            ms=cal.getTimeInMillis();
        } catch(ParseException px) {
            throw new DataFormaterNotRightException();
        }
        return ms;
    }

    public static void main(String[] args) throws DataFormaterNotRightException {
        System.out.println(getms("2008-8-8 23:23:23"));
    }
}
class DataFormaterNotRightException extends Exception{
    public static void main(String[] args) {
        System.out.println("日期输入错误");
    }
}
