package Lab_02;

import java.util.Scanner;

public class lab2_3 {
    public static void main(String[] args) {
        System.out.println("height: ");
        Scanner sc1= new Scanner(System.in);
        float h = sc1.nextFloat();
        System.out.println("weight:");
        Scanner sc2= new Scanner(System.in);
        float w = sc2.nextFloat();

        float BMI;
        BMI = w/(h*2);

        if(BMI<18.5){
            System.out.println("Underweight");
            float a ;
            a = (float) (18.5 - BMI);
            System.out.println("Hay tang:"+a+"kg");
        }
        else if(BMI<=24.9){
            System.out.println("Normal weight");
        } else if (BMI <=29.9) {
            System.out.println("Overweight");
            float b ;
            b = (float) (BMI-24.9);
            System.out.println("Giảm:"+b+"kg");
        }
        else {
            System.out.println("Obesity");
            float c ;
            c = (float) (BMI-24.9);
            System.out.println("Giảm:"+c+"kg");
        }
    }
}
