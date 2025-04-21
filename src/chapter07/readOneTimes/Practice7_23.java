package chapter07.readOneTimes;

public class Practice7_23 {
    public static double sumArea(Shape7_22[] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].extent();
        }

        return sum;
    }

    public static void main(String[] args) {
        Shape7_22[] arr = {new Circle7_22(5.0), new Rectangle7_22(3, 4), new Circle7_22(1)};
        System.out.println("면적의 합:" + sumArea(arr));
    }
}
