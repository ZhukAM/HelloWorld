package mypackage;

/**
 * Created by Aleksandr Zhuk on 19.12.16.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {
    public static void main(String[] args) {
        Calendar cl = Calendar.getInstance();
        //cl.set(Calendar.YEAR, 2010);
        //cl.set(Calendar.MONTH, Calendar.JANUARY);
        //cl.set(Calendar.DAY_OF_MONTH, 1);

        //System.out.println(cl);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        String format1 = sdf.format(cl.getTime());
        System.out.println("First date:" + format1);

        cl.add(Calendar.YEAR, 1);
        String format2 = sdf.format(cl.getTime());
        System.out.println("Second date:" + format2);

        // На самом деле можно не вводить строку а сразу использовать преобразование
        cl.add(Calendar.YEAR, -5);
        System.out.println("Third date:" + sdf.format(cl.getTime()));

        // Удобный класс для хранения даты
        // Date d = cl.getTime();
        // System.out.println(d);
    }
}
