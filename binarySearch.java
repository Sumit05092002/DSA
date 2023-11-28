import java.util.Scanner;

public class binarySearch{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int size=Sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Sc.nextInt();
        }
        System.out.println("Enter the element you want to search for");
        int element=Sc.nextInt();
        int pos=binary(arr,size,element);
        System.out.println(pos);
    }

    public static int binary(int arr[],int size,int element){
        int start=0;
        int end=size-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]== element){
                return mid;
            }else if(arr[mid]>element){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}