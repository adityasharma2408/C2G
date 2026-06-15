import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double p=(b*100.0)/a;
        if(p>=75){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
        
    }
}