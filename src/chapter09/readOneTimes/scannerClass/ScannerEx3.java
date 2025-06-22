package chapter09.readOneTimes.scannerClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
페이지 512
Scanner 클래스
 */
public class ScannerEx3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\cheerup\\JavaJungsuk-3rd-Practice\\src\\chapter09\\readOneTimes\\scannerClass\\data3.txt"));
        int cnt = 0;
        int totalSum = 0;

        while (sc.hasNextInt()) {
            String line = sc.nextLine();
            Scanner sc2 = new Scanner(line).useDelimiter(",");
            int sum = 0;

            while (sc2.hasNextInt()) {
                sum += sc2.nextInt();
            }
            System.out.println(line + ", sum = " + sum);
            totalSum += sum;
            cnt++;
        }
        System.out.println("Line: " + cnt + ", Total: " + totalSum);
    }
}
