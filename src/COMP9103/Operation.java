package COMP9103;

import java.util.ArrayList;
import java.util.Scanner;

public class Operation{

    private ArrayList<Contact> contactList = new ArrayList<Contact>();
//    private ArrayList<String> tp = new ArrayList<String>();
//
//    private String name = " ";
//    private String birthday = " ";
//    private String phone = " ";
//    private String Email = " ";
//    private String address = " ";

    IsValid ck = new IsValid();
    
    public void add(String info){
        Contact c = new Contact(info);
//        System.out.println(c.getAddress());
    }

    public void delete(String info){
//        System.out.println("delete");
    }

//    public void SplitInfo(String param){
//        for(String temp: param.split(";")){
//              Scanner scan = new Scanner(temp);
//              if (scan.hasNextLine()){
//                  String prefix = scan.next();
////                  System.out.println(prefix);                 //取出name,birthday
////                  String info = scan.nextLine();
////                  System.out.println(info);                   //取出info
//                  if(prefix.equalsIgnoreCase("name")){
//                      name = scan.nextLine().substring(1);
//                  }
//                  if(prefix.equalsIgnoreCase("birthday")){
//                      birthday = scan.nextLine().substring(1);
////                      formatDob = new FormatDate(birthday);
////                      System.out.println(fm);
//                  }
//                  if(prefix.equalsIgnoreCase("phone")){
//                      phone = scan.nextLine().substring(1);
//                  }
//                  if(prefix.equalsIgnoreCase("email")){
//                      Email = scan.nextLine().substring(1);
//                  }
//                  if(prefix.equalsIgnoreCase("address")){
//                      address = scan.nextLine().substring(1);
//                  }
//              }
//            }
////        System.out.println(name);
//        FormatDate fd = new FormatDate(birthday);
////        System.out.println(!name.equals( " "));
//
//        if(!name.equals(" ") && !birthday.equals(null)){
//            if(ck.checkName(name) && ck.checkEmail(Email) && ck.checkPhone(phone) && ck.checkAddress(address) && fd.timeCheck()){
//                Contact c = new Contact(name,birthday,phone,Email,address);
////            System.out.println(c.getName());
//                addContact(c);
//            }
        }

//        System.out.println(ck.checkName(name));
//        System.out.println(ck.checkEmail(Email));
//        System.out.println(ck.checkPhone(phone));
//        System.out.println(ck.checkAddress(address));
//        System.out.print(fd+" ");
//        System.out.println(fd.timeCheck());
