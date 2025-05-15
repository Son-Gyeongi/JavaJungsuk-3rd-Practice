package chapter09.readOneTimes;

public class Practice9_4 {
    static void printGraph(int[] dataArr, char ch) {
        for (int i = 0; i < dataArr.length; i++) {
            System.out.println(("" + ch).repeat(dataArr[i]) + dataArr[i]);
        }
    }

    public static void main(String[] args) {
        printGraph(new int[]{3, 7, 1, 4}, '*');
    }
}
