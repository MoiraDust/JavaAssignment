package test;

public class test {public static void main(String[] args) throws Exception {
    String regex = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$";

    // ���Ȳ���
    String value = "aaa";
    System.out.println(value.matches(regex));

    // ̫��
    value = "1111aaaa1111aaaaa";
    System.out.println(value.matches(regex));

    // ������
    value = "111111111";
    System.out.println(value.matches(regex));

    // ����ĸ
    value = "aaaaaaaaa";
    System.out.println(value.matches(regex));

    // �����ַ�
    value = "####@@@@#";
    System.out.println(value.matches(regex));

    // ������ĸ���
    value = "1111aaaa";
    System.out.println(value.matches(regex));

    // ������ĸ���
    value = "aaaa1111";
    System.out.println(value.matches(regex));

    // ������ĸ���
    value = "aa1111aa";
    System.out.println(value.matches(regex));

    // ������ĸ���
    value = "11aaaa11";
    System.out.println(value.matches(regex));

    // ������ĸ���
    value = "aa11aa11";
    System.out.println(value.matches(regex));
}
}
