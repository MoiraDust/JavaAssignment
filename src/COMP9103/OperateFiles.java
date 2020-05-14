package COMP9103;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class OperateFiles {

    private String instruct;

    private File inputFile;
    private File outputFile;
    private File readContact;

    IsValid ck = new IsValid();

    public ArrayList<Contact> contactList = new ArrayList<Contact>();

//    public operateFiles(String[] s){
//        readContact = new Files(s[0])
//        readInstructions = new File(s[1]);
//        outputResult = new File(s[2]);
//    }

    public void readContact(File sample){
        try{
            Scanner scanFile = new Scanner(sample);//һ����������sample�ĳ�inputFile
            while(scanFile.hasNextLine()) {
                String record = "";
                while (scanFile.hasNextLine()) {
                    String info = scanFile.nextLine();
                    if (info.equals("")) {
                        record += '\n';
                        break;
                    }
                    record += info + '\n';
                }
                Contact c = new Contact(record);
                contactList.add(c);
            }
            for(Contact c : contactList){
                System.out.println(c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void readInstruction(File sample){
        try{
            Scanner scanFile = new Scanner(sample);   //һ����������sample�ĳ�inputFile
            String information = "null";
            while(scanFile.hasNextLine()){
               if(scanFile.hasNext()){
                   instruct = scanFile.next();
                   if(scanFile.hasNextLine()){
                       information = scanFile.nextLine();
                   }
               }
//                System.out.println(instruct);               //��������������е�ָ�add,delete��
//                System.out.println(information);            //�����������
                jumpToOperation(instruct,information);
            }
            scanFile.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void jumpToOperation(String keyword, String param){
        switch (keyword){
            case "add":
                add(param);
                break;
            case "delete":
                delete(param);
                break;
        }
    }

    public void add(String info){
        Instructions instructFile = new Instructions(info);
        if(ck.checkName(instructFile.getName()) && instructFile.getBirthday().timeCheck()){
            contactList.add(instructFile);
        }
//        for(int i =0; i < contactList.size(); i++){
//            String tempName = contactList.get(i).getName();
//            FormatDate tempBirth = contactList.get(i).getBirthday();
//            for(int j = i+1; j<contactList.size(); j++){
//                String compName = contactList.get(j).getName();
//                FormatDate compBirth = contactList.get(j).getBirthday();
//                if(tempName.equals(compName) && tempBirth.equals(compBirth)){
//                    contactList.set(i,contactList.get(j));
//                    contactList.remove(j);
//                }
//            }
//        }
        System.out.println(contactList);
    }

    public void delete(String info){

    }

    public static void main(String[] args) {
        String path = "D:\\STUDY\\U Sleep You Die\\COMP9103 without hw\\assignment\\samples_release\\instructions_1.txt";
        String path2 = "D:\\STUDY\\U Sleep You Die\\COMP9103 without hw\\assignment\\samples_release\\instructions_2.txt";
        String path3 = "D:\\STUDY\\U Sleep You Die\\COMP9103 without hw\\assignment\\samples_release\\instructions_3.txt";
        String path4 = "D:\\STUDY\\U Sleep You Die\\COMP9103 without hw\\assignment\\samples_release\\instructions_4.txt";
        String path5 = "D:\\STUDY\\U Sleep You Die\\COMP9103 without hw\\assignment\\samples_release\\instructions_5.txt";
        String path6 = "D:\\STUDY\\U Sleep You Die\\COMP9103 without hw\\assignment\\test.txt";

        String rPath = "D:\\STUDY\\U Sleep You Die\\COMP9103 without hw\\assignment\\samples_release\\contacts_1.txt";
        File rf = new File(rPath);

        File f = new File(path3);
        OperateFiles file = new OperateFiles();
        file.readInstruction(f);
//        file.readContact(rf);
    }

}
