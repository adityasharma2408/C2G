import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your solution here
        String username=sc.nextLine();
        boolean hasLetter=false;
        boolean hasDigit=false;
        boolean hasSpace=false;
        for (int i=0;i<username.length();i++){
            char ch=username.charAt(i);
            if(Character.isLetter(ch)){hasLetter=true;}
            if (Character.isDigit(ch)){hasDigit=true;}
            if(ch==' '){hasSpace=true;}
        }
        if(username.length()>=8&&hasLetter&&hasDigit&&!hasSpace){
            System.out.println("Valid");
        }
        else{System.out.println("Invalid");}
    }
}