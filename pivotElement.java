import java.util.Scanner;

public class pivotElement{

   public static void main(String args[]){
    
    Scanner Sc=new Scanner(System.in);
    int size=Sc.nextInt();
    int [] arr=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=Sc.nextInt();
    }

    int element=pivot(arr,size);
    System.out.println("The pivot element is: "+element);
   }

   public static int pivot(int arr[],int size){

    int start=0;
    int end=size-1;
    while(start<end){
        int mid=start+(end-start)/2;
        
        if(arr[mid]>=arr[0]){
            start=mid+1;
        }else{
            end=mid;
        }
    }
    return arr[start];
    
   }
}