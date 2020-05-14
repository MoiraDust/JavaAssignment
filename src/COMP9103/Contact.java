package COMP9103;

import java.util.Scanner;

public class Contact {
    /**
     * fields
     */
    protected String name;
    protected FormatDate birthday;
    protected String phone;
    protected String Email;
    protected String address;

    /**
     * Constructors
     */
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
    public Contact() {
        name = null;
        birthday = null;
        phone = null;
        Email = null;
        address = null;
    }

    public Contact(String information) {
        Scanner scan = new Scanner(information);
        while (scan.hasNext()) {
            String prefix = scan.next();
            if (prefix.equalsIgnoreCase("name")) {
                name = scan.nextLine();
            } else if (prefix.equalsIgnoreCase("birthday")) {
                birthday = new FormatDate(scan.nextLine().substring(1));
            } else if (prefix.equalsIgnoreCase("phone")) {
                phone = scan.nextLine();
            } else if (prefix.equalsIgnoreCase("email")) {
                Email = scan.nextLine();
            } else if (prefix.equalsIgnoreCase("address")) {
                address = scan.nextLine();
            } else if (!prefix.equalsIgnoreCase("")) {
                address += prefix;
                address += scan.nextLine();
            }
        }
    }

    public boolean IsValid() {

        boolean isValid = true;
        String regEx = null;
        if (name != null && !name.equals(" ")) {
            regEx = "[a-zA-Z ]+$";
            name = name.trim();
            isValid &= name.matches(regEx);
        } else {
            return false;
        }

        if (birthday != null && !birthday.equals(" ")) {
            isValid &= birthday.timeCheck();
        } else {
            return false;
        }

        if (phone != null && !phone.equals(" ")) {
            int i = 0;
            for (i = 0; i < phone.length(); i++) {
                if (phone.charAt(i) != '0' && phone.charAt(i) != ' ') {
                    break;
                }
            }
            phone = phone.substring(i);

            regEx = "[0-9]+$";
            isValid &= phone.matches(regEx);
        }

        if (Email != null && !Email.equals(" ")) {
            regEx = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$";
            Email.trim();
            isValid &= Email.matches(regEx);
        }

        return isValid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(FormatDate birthday) {
        this.birthday = birthday;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setAddress(String address) {
        this.address = address;
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
    public String toString() {
        String str = "";
        str = str + "\nname: " + name + "\nbirthday: " + birthday;
        if (address != null) {
            str = str + "\naddress: " + address;
        }
        if (phone != null) {
            str = str + "\nphone: " + phone;
        }
        if (Email != null) {
            str = str + "\nemail: " + Email;
        }

        return str;
    }

}
