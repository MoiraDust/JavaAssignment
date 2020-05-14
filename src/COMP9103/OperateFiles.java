package COMP9103;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class OperateFiles {

    private String instruct;

    private File inputFile;
    private File outputFile;
    private File readContact;


    public static ArrayList<Contact> contactList = new ArrayList<Contact>();

//    public operateFiles(String[] s){
//        readContact = new Files(s[0])
//        readInstructions = new File(s[1]);
//        outputResult = new File(s[2]);
//    }

    public void readContact(File sample) {
        try {
            Scanner scanFile = new Scanner(sample);//一会儿将这里的sample改成inputFile
            while (scanFile.hasNextLine()) {
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
                if (c.IsValid()) {
                    contactList.add(c);
                    c.toString();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void readInstruction(File sample) {
        try {
            Scanner scanFile = new Scanner(sample);   //一会儿将这里的sample改成inputFile
            String information = "null";
            while (scanFile.hasNextLine()) {
                if (scanFile.hasNext()) {
                    instruct = scanFile.next();
                    if (scanFile.hasNextLine()) {
                        information = scanFile.nextLine();
                        jumpToOperation(instruct, information);
                    }
                }
            }
            scanFile.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void jumpToOperation(String keyword, String param) {
        switch (keyword) {
            case "add":
                add(param);
                break;
            case "delete":
                delete(param);
                break;
            case "query":
                query(param);
//            case "save":
//                save();
//                break;
        }
    }

    public void add(String info) {
        Instructions instructFile = new Instructions(info);
        if (instructFile.IsValid()) {
            boolean succeed = false;
            for (int i = 0; i < contactList.size(); i++) {
                Contact temp = contactList.get(i);
                if (temp.getName().equals(instructFile.getName()) &&
                        temp.getBirthday().toString().equals(instructFile.getBirthday().toString())) {
                    instructFile.update(temp);
                    succeed = true;
                    break;
                }
            }

            if (!succeed) {
                contactList.add(instructFile);
            }
        }
    }

    public void delete(String info) {
        String[] temp = info.split(";");
        for (Contact c : contactList) {
            if (temp.length == 0) {
                return;
            }
            temp[0] = temp[0].trim();
            if (c.getName().equals(temp[0])) {
                if (temp.length > 1) {
                    FormatDate fd = new FormatDate(temp[1]);
                    if (c.getBirthday().toString().equals(fd.toString())) {
                        contactList.remove(c);
                        break;
                    }
                } else {
                    contactList.remove(c);
                    break;
                }
            }
        }
    }

    public void query(String info){
        String keyword = info.split("\\s")[1];
        if(keyword.equals("name")){}
        if(keyword.equals("birthday")){
            String param = info.split("\\s")[2];
            FormatDate fd = new FormatDate(param);
            System.out.println("====== query birthday 05-09-1980 ======");
            for(Contact c: contactList){
                if(fd.toString().equals(c.getBirthday().toString())){
                    System.out.println(c);
                }
            }
            System.out.println("====== end of query birthday 05-09-1980 ======");
        }
        if(keyword.equals("phone")){
            String param = info.split("\\s")[2];
            for(Contact c: contactList){
                if(param.equals(c.getPhone())){
                    System.out.println("====== query phone 13589634 ======");
                    System.out.println(c);
                    System.out.println("====== end of query phone 13589634 ======");
                }
            }
        }
    }



    public static void main(String[] args) {
        String path = "D:\\STUDY\\U Sleep You Die\\COMP9103 without hw\\assignment\\samples_release\\instructions_1.txt";
        String path2 = "D:\\STUDY\\U Sleep You Die\\COMP9103 without hw\\assignment\\samples_release\\instructions_2.txt";
        String path3 = "D:\\STUDY\\U Sleep You Die\\COMP9103 without hw\\assignment\\samples_release\\instructions_3.txt";
        String path4 = "D:\\STUDY\\U Sleep You Die\\COMP9103 without hw\\assignment\\samples_release\\instructions_4.txt";
        String path5 = "D:\\STUDY\\U Sleep You Die\\COMP9103 without hw\\assignment\\samples_release\\instructions_5.txt";
        String path6 = "D:\\STUDY\\U Sleep You Die\\COMP9103 without hw\\assignment\\test.txt";

        String rPath = "D:\\STUDY\\U Sleep You Die\\COMP9103 without hw\\assignment\\samples_release\\contacts_5.txt";
        File rf = new File(rPath);

        File f = new File(path5);
        OperateFiles file = new OperateFiles();

        file.readContact(rf);
        file.readInstruction(f);

//        for (Contact c : contactList) {
//            System.out.println(c);
//        }
    }

}
