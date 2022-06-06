package lab_06;

public class Lab6_1 {

    public static void main(String[] args) {
        String time = "2hrs and 5 minutes";
        String timeNumber1 = time.replaceAll("[^2]", "");
        String timeNumber2 = time.replaceAll("[^5]", "");
        System.out.println(timeNumber1);
        System.out.println(timeNumber2);
        int time1 = Integer.valueOf(timeNumber1);
        int time2 = Integer.valueOf(timeNumber2);
        int totalTime = (time1 * 60) + time2;
        System.out.println("Tong so phut la:" + totalTime);

    }
}
