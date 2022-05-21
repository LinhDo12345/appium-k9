package Lab_02;

import java.util.Scanner;

public class lab2_2 {
    public static void main(String[] args) {
        System.out.println("Nhap so:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a%2==0){
            System.out.println(a+" la so chan");
        }
        else {
            System.out.println(a+"la so le");
        }
    }
}
