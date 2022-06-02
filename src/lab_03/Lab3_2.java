package lab_03;

public class Lab3_2 {

    public static void main(String[] args) {
        int[] myIntArray = {1, 2, 3, 4, 5};
        int max = myIntArray[0];
        int min = myIntArray[0];

        for (int i : myIntArray) {
            if (myIntArray[i] < min) {
                min = myIntArray[i];
            }
            if (myIntArray[i] > max) {
                max = myIntArray[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

    }
}
