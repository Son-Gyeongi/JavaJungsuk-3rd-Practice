package chapter06.readOneTimes.example;

/*
페이지 289
가변인자 String... args
 */
public class Ex6_22 {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};

        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"1", "2", "3"}));
        System.out.println("[" + concatenate(",", new String[0]) + "]");
        System.out.println("[" + concatenate(",") + "]");

        // 허용하지 않음
//        System.out.println(concatenate("-", {"100", "200", "300"}));
    }

    static String concatenate(String delim, String... args) {
        String result = "";

        for (String str : args) {
            result += str + delim;
        }

        return result;
    }

    /*static String concatenate(String... args) {
        return concatenate("", args);
    }*/
}
