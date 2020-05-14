package COMP9103;

import java.util.Scanner;

public class Instructions extends Contact {

    public Instructions(String information) {
        for (String temp : information.split(";")) {
            Scanner scan = new Scanner(temp);
            if (scan.hasNextLine()) {
                String prefix = scan.next();
                if (prefix.equalsIgnoreCase("name")) {
                    name = scan.nextLine();
                }
                if (prefix.equalsIgnoreCase("birthday")) {
                    birthday = new FormatDate(scan.nextLine());
                }
                if (prefix.equalsIgnoreCase("phone")) {
                    phone = scan.nextLine();
                }
                if (prefix.equalsIgnoreCase("email")) {
                    Email = scan.nextLine();
                }
                if (prefix.equalsIgnoreCase("address")) {
                    address = scan.nextLine();
                }
            }
        }
    }

    public void update(Contact temp) {

        if (phone != null) {
            temp.setPhone(phone);
        }
        if (Email != null) {
            temp.setEmail(Email);
        }
        if (address != null) {
            temp.setAddress(address);
        }
        return;

    }
}
