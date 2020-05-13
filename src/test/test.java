package test;

public class test {public static void main(String[] args) throws Exception {
    String regex = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$";

    // 长度不够
    String value = "aaa";
    System.out.println(value.matches(regex));

    // 太长
    value = "1111aaaa1111aaaaa";
    System.out.println(value.matches(regex));

    // 纯数字
    value = "111111111";
    System.out.println(value.matches(regex));

    // 纯字母
    value = "aaaaaaaaa";
    System.out.println(value.matches(regex));

    // 特殊字符
    value = "####@@@@#";
    System.out.println(value.matches(regex));

    // 数字字母组合
    value = "1111aaaa";
    System.out.println(value.matches(regex));

    // 数字字母组合
    value = "aaaa1111";
    System.out.println(value.matches(regex));

    // 数字字母组合
    value = "aa1111aa";
    System.out.println(value.matches(regex));

    // 数字字母组合
    value = "11aaaa11";
    System.out.println(value.matches(regex));

    // 数字字母组合
    value = "aa11aa11";
    System.out.println(value.matches(regex));
}
}
