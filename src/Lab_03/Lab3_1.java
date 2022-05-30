package Lab_03;

public class Lab3_1 {

    public static void main(String[] args) {
        int[] myIntArray = {1, 2, 3, 4, 5};
        int soChan = 0;
        int soLe = 0;

        for (int i : myIntArray) {
            if (i % 2 == 0) {
                soChan++;
            } else {
                soLe++;
            }
        }
        System.out.println("So chan: " + soChan);
        System.out.println("So le: " + soLe);
    }
}
