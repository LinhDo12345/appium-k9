package Lab_02;

import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        System.out.println("height: ");
        Scanner sc= new Scanner(System.in);
        float h = sc.nextFloat();
        System.out.println("weight:");

        float w = sc.nextFloat();

        float BMI;
        BMI = w/(h*2);

        if(BMI<18.5){
            System.out.println("Underweight");
        }
        else if(BMI<=24.9){
            System.out.println("Normal weight");
        } else if (BMI <=29.9) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obesity");
        }
    }
}
