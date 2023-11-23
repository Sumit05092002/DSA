import java.util.Scanner;

public class reverse{

    public static void main(String args[]){

        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=Sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Sc.nextInt();
        }

        rev(arr,size);

        print(arr,size);
    }

    public static void rev(int arr[],int size){
        System.out.println("Function called");
        int start=0;
        int end=size-1;
        while(start<end){
            // swap(arr[start],arr[end]);
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

    }
    
    // public static void swap(int a,int b){
    //    int temp=a;
    //     a=b;
    //     b=temp;
    // }

    public static void print(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}