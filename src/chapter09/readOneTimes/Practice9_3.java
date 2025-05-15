package chapter09.readOneTimes;

import java.io.File;

public class Practice9_3 {
    public static void main(String[] args) {
        String fullPath = "C:\\cheerup\\JavaJungsuk-3rd-Practice\\src\\chapter09\\readOneTimes\\Practice9_3.java";
        String path = "";
        String fileName = "";

        File file = new File(fullPath);
        path = file.getParent();
        fileName = file.getName();

        System.out.println("fullPath = " + fullPath);
        System.out.println("path = " + path);
        System.out.println("fileName = " + fileName);
    }
}
