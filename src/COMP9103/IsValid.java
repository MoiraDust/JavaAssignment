package COMP9103;

public class IsValid {

    public boolean checkName(String name){
        String regEx = "[a-zA-Z]+$";
        String cName = name.trim().replace(" ","");
        return cName.matches(regEx);
    }

    public boolean checkPhone(String phone){
        if(phone.equals(" ")){
            return true;
        }else{
        String regEx = "[0-9]+$";
        return phone.matches(regEx);}
    }

    public String formatPhone(String phone){
        String fmt_Phone;
        int temp = Integer.parseInt(phone);
        fmt_Phone = temp + " ";
        return fmt_Phone.trim();
    }

    public boolean checkEmail(String Email){
        if(Email.equals(" ")){
            return true;
        }else{
        String regEx = "[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})";
        String cEmail = Email.trim();
        return cEmail.matches(regEx);
        }
    }

    public boolean checkAddress(String address){
        return true;
    }


//    public static void main(String[] args) {
//        String name = "Jo Bloggs";
//        String email = " ";
//        String phone = "0478141899aaa";
//        IsValid ck = new IsValid();
//        System.out.println(ck.checkName(name));
//        System.out.println(ck.checkEmail(email));
//        System.out.println(ck.checkPhone(phone));
//        if(ck.checkPhone(phone)){
//            System.out.println(ck.formatPhone(phone));
//        }
//    }


}
