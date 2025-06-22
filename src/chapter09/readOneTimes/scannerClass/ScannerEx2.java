package chapter09.readOneTimes.scannerClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
페이지 512
Scanner 클래스
 */
public class ScannerEx2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\cheerup\\JavaJungsuk-3rd-Practice\\src\\chapter09\\readOneTimes\\scannerClass\\data2.txt"));
        int sum = 0;
        int cnt = 0;

        while (sc.hasNextInt()) {
            sum += sc.nextInt();
            cnt++;
        }

        System.out.println("sum = " + sum);
        System.out.println("average =" + (double) sum / cnt);
    }
}
