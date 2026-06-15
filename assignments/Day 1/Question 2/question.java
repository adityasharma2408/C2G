import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a>=b){
            System.out.println("Recharge Successful");
        }
        else{
            System.out.println("Insufficient Balance");
        }
        
    }
}