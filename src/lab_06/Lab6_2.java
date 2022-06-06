package lab_06;

import java.util.Scanner;

public class Lab6_2 {

    public static void main(String[] args) {
        String myPassword = "password123";
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhap Password:");
            Scanner sc = new Scanner(System.in);
            String password = sc.nextLine();
            if (password.equals(myPassword)){
                System.out.println("Dang nhap thanh cong!!!");
                break;
            }
            else{
                System.out.println("Nhap lai:");

            }
        }
    }
}