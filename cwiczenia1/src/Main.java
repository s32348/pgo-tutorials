import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        if(a>0) {
            System.out.println("The number is positive");
        }else if(a==0){
            System.out.println("The value equals 0");
        }else{
            System.out.println("The number is negative");
        }
    }
}