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
        if(ck.checkName(c.getName()) && c.getBirthday().timeCheck()){
            contactList.add(c);
            }
        for(int i =0; i < contactList.size(); i++){
            String tempName = contactList.get(i).getName();
            FormatDate tempBirth = contactList.get(i).getBirthday();
            for(int j = i+1; j<contactList.size(); j++){
                String compName = contactList.get(j).getName();
                FormatDate compBirth = contactList.get(j).getBirthday();
                if(tempName.equals(compName) && tempBirth.equals(compBirth)){
                    contactList.set(i,contactList.get(j));
                    contactList.remove(j);
                }
            }
        }
        System.out.println(contactList);
    }



    public void delete(String info){

    }


        }

