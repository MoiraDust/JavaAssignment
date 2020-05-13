package COMP9103;

import java.util.Scanner;

public class formatContact extends Contact {

    public formatContact(){
        super();
    }

    public formatContact(String information) {
        for(String temp : information.split("\\n")){
            Scanner scan = new Scanner(temp);
            System.out.println(temp);
               if (scan.hasNextLine()){
                   String prefix = scan.next();
                   if(prefix.equalsIgnoreCase("name")){
                       name = scan.nextLine().substring(1);
                   }
                   if(prefix.equalsIgnoreCase("birthday")){
                       birthday = new FormatDate(scan.nextLine().substring(1));
                   }
                   if(prefix.equalsIgnoreCase("phone")){
                       phone = scan.nextLine().substring(1);
                   }
                   if(prefix.equalsIgnoreCase("email")){
                       Email = scan.nextLine().substring(1);
                   }
                   if(prefix.equalsIgnoreCase("address")){
                       address = scan.nextLine().substring(1);

                   }
               }
           }
        }

//    public static void main(String[] args) {
//        Contact c = new formatContact("name Posephine Esmerelda Bloggs\n" +
//                "birthday 13-05-1980\n" +
//                "phone 16549853\n" +
//                "email j.e.bloggs@gmail.com\n" +
//                "address 102 Smith St, Summer hill, NSW 2130\n" +
//                "\n" +
//                "name James Smith\n" +
//                "birthday 23-3-1989\n" +
//                "phone 98765425\n" +
//                "email j.smith@gmail.com\n" +
//                "address 60 Morris St, Summer Hill, NSW 2130\n" +
//                "\n" +
//                "name John Jones\n" +
//                "birthday 18-09-1968\n" +
//                "phone 13649852\n" +
//                "email j.jones@fanfare.com.au\n" +
//                "address 2 Fairmount St, Dulwich Hill, NSW 2203\n");
//        System.out.println(c);
//    }
}
