package lab_06;

public class Lab6_4 {

    public static void main(String[] args) {
        String url = "https://google.com";
        if(url.indexOf("https:") < 0){
            System.out.println("http");
        } else {
            System.out.println("https");
        }

        System.out.println(url.substring(8,14));

        if (url.indexOf(".com") <0 ){
            System.out.println(".net");
        }
        else {
            System.out.println(".com");
        }
    }
}
