package COMP9103;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class OperateFiles {

    private String instruct;

    private File inputFile;
    private File outputFile;
    private File readContact;

    private Operation o = new Operation();

    public ArrayList<Contact> contactList = new ArrayList<Contact>();

//    public operateFiles(String[] s){
//        readContact = new Files(s[0])
//        readInstructions = new File(s[1]);
//        outputResult = new File(s[2]);
//    }

    public void readOrginalContact(File sample){
        try{
            Scanner scanFile = new Scanner(sample);//һ����������sample�ĳ�inputFile
            String information = "";
            while(scanFile.hasNextLine()){
                       information = scanFile.nextLine();
                       System.out.println(information);
                       formatContact c = new formatContact(information);/**���캯�������⣬һ������ļ��������ݸ��ƽ�ȥ����*/
                System.out.println(c.getName());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void getInstruction(File sample){
        try{
            Scanner scanFile = new Scanner(sample);   //һ����������sample�ĳ�inputFile
            String information = "null";
            while(scanFile.hasNextLine()){
//                String temp = scanFile.nextLine();
//                System.out.println(temp);
//                Scanner scan = new Scanner(temp);
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
//        try {
//            Scanner scan = new Scanner(sample);
//            while(scan.hasNextLine()){
//                String instruction = scan.nextLine();
//                Scanner sc = new Scanner(instruction);
//                String keyword,param;
//                if(sc.hasNext()){
//                    keyword = sc.next();
//                    if(sc.hasNextLine()){
//                        param = sc.nextLine();
//                        if(keyword.equalsIgnoreCase("add")){
//                            o.add(param);
//                        }else if(keyword.equalsIgnoreCase("delete")){
//                            o.delete(param);
//                        }else{continue;}
//                        sc.close();
//                    }
//                }
//            }
            scanFile.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void jumpToOperation(String keyword, String param){
        switch (keyword){
            case "add":
                o.add(param);
                break;
            case "delete":
                o.delete(param);
                break;
        }
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
//        file.getInstruction(rf);


        file.readOrginalContact(rf);
    }

}
