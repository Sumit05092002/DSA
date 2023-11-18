import java.util.Scanner;

public class Character{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        char ch= Sc.next().charAt(0);
        if(ch>=97&&ch<=122){
            System.out.println("Lower case alphabet");
        }else if(ch>=65&&ch<=90){
            System.out.println("Upper case letter");
        }else{
            System.out.println("Numeric character");
        }

    }
}