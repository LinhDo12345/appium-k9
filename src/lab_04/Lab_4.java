package lab_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab_4 {
    
    public static void main(String[] args) {

        List<Integer> myArrayList = new ArrayList<>(Arrays.asList(2, 4, 1, 6, 8, 5, 7));

        printSimpleMenu();
        boolean isContinuing = true;
        while (isContinuing) {
            int option = generateOptipon();
            switch (option) {
                case 1:
                    addNumberToArrayList(myArrayList);
                    break;
                case 2:
                    printNumbers(myArrayList);
                    break;
                case 3:
                    getMaxNumber(myArrayList);
                    break;
                case 4:
                    getMinNumber(myArrayList);
                    break;
                case 5:
                    getIndexInArrayList(myArrayList);
                    break;
                default:
                    isContinuing = false;
            }
        }
    }


    private static void printSimpleMenu() {
        System.out.println("=====MENU======");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Print index of number in ArrayList ");
        System.out.println("6. Exit");
    }

    private static int generateOptipon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select opton: ");
        return scanner.nextInt();
    }

    private static void addNumberToArrayList(List<Integer> myArrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number  : ");
        myArrayList.add(scanner.nextInt());
    }

    private static void printNumbers(List<Integer> myArrayList) {
        for (Object element : myArrayList) {
            System.out.print(element + "\t");
        }
        System.out.print("\n");
    }

    private static void getMaxNumber(List<Integer> myArrayList) {
        int max = myArrayList.get(0);
        for (int element : myArrayList) {
            if (element > max || element == max) {
                max = element;
            }
        }
        System.out.println("Maximum: " + max);
    }

    private static void getMinNumber(List<Integer> myArrayList) {
        int min = myArrayList.get(0);
        for (int element : myArrayList) {
            if (element < min || element == min) {
                min = element;
            }
        }
        System.out.println("Minimum: " + min);
    }

    private static void getIndexInArrayList(List<Integer> myArrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number  : ");
        int number = scanner.nextInt();
        if (myArrayList.contains(number) == true) {
            System.out.println("Index of number  : ");
            for (int index = 1; index <= myArrayList.size(); index++) {
                if (myArrayList.get(index - 1) == number) {
                    System.out.print(index + "\t");
                }
            }
            System.out.print("\n");
        } else {
            System.out.println("Not found!!!");
        }
    }

}
