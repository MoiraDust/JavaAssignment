package COMP9103;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Contact {
    /**fields*/
    private String name;
    private FormatDate birthday;
    private String phone;
    private String Email;
    private String address;

    IsValid ck = new IsValid();

    /**Constructors*/
//    public Contact(String name,String birthday){
//        this.name = name;
//        this.birthday = birthday;
//    }
//
//    public Contact(String name,String birthday,String phone){
//        this.name = name;
//        this.birthday = birthday;
//        this.phone = phone;
//    }
//
//    public Contact(String name,String birthday,String phone,String Email){
//        this.name = name;
//        this.birthday = birthday;
//        this.phone = phone;
//        this.Email = Email;
//    }
    public Contact(){
        name = null;
        birthday = null;
        phone = null;
        Email = null;
        address = null;
    }

    public Contact( String information){
        for(String temp: information.split(";")){
            Scanner scan = new Scanner(temp);
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
//                    address = new Scanner(scan.nextLine().substring(1)).nextLine();
//                    address = scan.nextLine().substring(1);
                    address = scan.nextLine().substring(1);

                }
            }
        }
    }

//    public boolean checkValid(){
//       return (ck.checkName(name) && ck.checkEmail(Email) && ck.checkAddress(address) && ck.checkPhone(phone));
//    }

    public String getName() {
        return name;
    }

    public FormatDate getBirthday() {
        return birthday;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return Email;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString(){
        String str = "";
        str = str + "\nname " + name + "\nbirthday " + birthday;
        if(address != null){
            str = str + "\naddress " + address;
        }
        if (phone != null){
            str = str + "\nphone " + phone;
        }
        if(Email != null){
            str = str + "\nemail " + Email;
        }

        return str;
    }

//    public static void main(String[] args) {
//        Contact c = new Contact("name Jam234es Smith; birthday 24-03-1989; address 60 Morris St, Summer Hill, NSW 2130");
//        System.out.println(c.getName());
//        System.out.println(c.getBirthday());
//        System.out.println(c.getEmail());
//        System.out.println(c.getPhone());
//        System.out.println(c.getAddress());
//    }
}
