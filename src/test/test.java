package test;

public class test {public static void main(String[] args) throws Exception {
    String regex = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$";

    String value = "aaa";  // ���Ȳ���
    System.out.println(value.matches(regex));

    value = "1111aaaa1111aaaaa";  // ̫��
    System.out.println(value.matches(regex));

    value = "111111111"; // ������
    System.out.println(value.matches(regex));

    value = "aaaaaaaaa"; // ����ĸ
    System.out.println(value.matches(regex));

    value = "####@@@@#"; // �����ַ�
    System.out.println(value.matches(regex));

    value = "1111aaaa";  // ������ĸ���
    System.out.println(value.matches(regex));

    value = "aaaa1111"; // ������ĸ���
    System.out.println(value.matches(regex));

    value = "aa1111aa";	// ������ĸ���
    System.out.println(value.matches(regex));

    value = "11aaaa11";	// ������ĸ���
    System.out.println(value.matches(regex));

    value = "aa11aa11"; // ������ĸ���
    System.out.println(value.matches(regex));
}
}
