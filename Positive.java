import java.util.Scanner;

public class Positive{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your no");
        int number=Sc.nextInt();
        if(number>0){
            System.out.println("Positive no");
        }else if(number<0){
            System.out.println("Negative number");
        }else{
            System.out.println("The number is 0");
        }
    }
}