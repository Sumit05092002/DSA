import java.util.Scanner;

public class Maxmin{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=Sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Sc.nextInt();
        }
        int max=maximum(arr,size);
        System.out.println("The max no is"+max);
        int min=minimum(arr,size);
        System.out.println("The min no is"+min);
    }

   public static int maximum(int[] arr,int size){
    int max=arr[0];
    for(int i=0;i<size;i++){
        if(max<arr[i]){
            max=arr[i];
        }
    }
    return max;
    }

    public static int minimum(int[] arr,int size){
        int min=arr[0];
        for(int i=0;i<size;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}