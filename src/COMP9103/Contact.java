package COMP9103;

import java.util.Scanner;

public class Contact {
    /**fields*/
    protected String name;
    protected FormatDate birthday;
    protected String phone;
    protected String Email;
    protected String address;

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

    public Contact(String information){
            Scanner scan = new Scanner(information);
            while (scan.hasNext()){
                String prefix = scan.next();
                if(prefix.equalsIgnoreCase("name")){
                    name = scan.nextLine();
                }else
                if(prefix.equalsIgnoreCase("birthday")){
                    birthday = new FormatDate(scan.nextLine().substring(1));
                }else
                if(prefix.equalsIgnoreCase("phone")){
                    phone = scan.nextLine();
                }else
                if(prefix.equalsIgnoreCase("email")){
                    Email = scan.nextLine();
                }else
                if(prefix.equalsIgnoreCase("address")){
                    address = scan.nextLine();

                }
            }
        }



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
        str = str + "\nname: " + name + "\nbirthday: " + birthday;
        if(address != null){
            str = str + "\naddress: " + address;
        }
        if (phone != null){
            str = str + "\nphone: " + phone;
        }
        if(Email != null){
            str = str + "\nemail: " + Email;
        }

        return str;
    }

}
