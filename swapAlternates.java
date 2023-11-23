import java.util.Scanner;

public class swapAlternates{

    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int size=Sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Sc.nextInt();
        }
        System.out.println("printng the original array");
        print(arr,size);
        alternates(arr,size);
        System.out.println("printing the updated array");
        print(arr,size);
    }

    public static void alternates(int arr[],int size){
        for(int i=0;i<size-1;i=i+2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }

    public static void print(int arr[],int size){
        System.out.println("function called");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}