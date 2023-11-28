import java.util.Scanner;

public class SortZeroOne{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int size=Sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Sc.nextInt();
        }
        sort(arr,size);
        print(arr,size);
    }

    public static void sort(int arr[],int size){
         int start=0;
         int end=size-1;
         while(start<end){
            if(arr[start]<arr[end]){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                end--;
            }
            start++;
         }
    }

     public static void print(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
     }
}