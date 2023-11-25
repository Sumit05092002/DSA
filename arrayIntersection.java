import java.util.Scanner;

public class arrayIntersection{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int size=Sc.nextInt();
        int size2=Sc.nextInt();
        int[] arr=new int[size];
        int[] arr2=new int[size2];
        for(int i=0;i<size;i++){
            arr[i]=Sc.nextInt();
        }
        for(int i=0;i<size2;i++){
            arr2[i]=Sc.nextInt();
        }
        intersection(arr,arr2,size,size2);
    }

    public static void intersection(int arr[],int arr2[],int size,int size2){
        for(int i=0;i<size;i++){
            for(int j=0;j<size2;j++){
                if(arr[i]<arr2[j])
                break;
                if(arr[i]==arr2[j]){
                    System.out.println("The common elements are" +arr[i]);
                    arr2[j]=-1;
                    break;
                }
            }
        }
    }
}