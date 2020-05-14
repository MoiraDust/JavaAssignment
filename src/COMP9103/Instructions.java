package COMP9103;

import java.util.Scanner;

public class Instructions extends Contact{

    public Instructions( String information){
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
                    address = scan.nextLine().substring(1);
                }
            }
        }
    }
}
