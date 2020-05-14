package COMP9103;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    private String dateString;
    private Date date;

    public FormatDate(String dateString) {
        this.dateString = dateString;
        String[] temp;
        if (dateString.matches("\\d+\\D\\d+\\D\\d+")) {
            temp = dateString.split("\\D");
            if (temp.length == 3) {
                for (int i = 0; i < 2; i++) {
                    temp[i] = "0" + temp[i];
                }
                dateString = temp[0] + "-" + temp[1] + "-" + temp[2];
            }
        }
        try {
            dateFormat.setLenient(false);
            date = dateFormat.parse(dateString);
        } catch (ParseException e) {
            date = null;
        }

    }

    public boolean timeCheck() {
        if (date == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return dateFormat.format(date);
    }


    public Date getDate() {
        return date;
    }

//    public static void main(String[] args) {
//        String sample = "30-02-2002";
//        String sample2 = "06/06/1995";
//        FormatDate fd = new FormatDate(sample);
////        System.out.println(fd.toString());
//        System.out.println(fd.timeCheck());  //ÏÈcheckÔÙtoString
//    }

}
