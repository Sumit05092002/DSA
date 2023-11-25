import java.util.Scanner;
public class pairSum{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int size=Sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the element");
        int element=Sc.nextInt();
        for(int i=0;i<size;i++){
            arr[i]=Sc.nextInt();
        }
        pair(arr,size,element);
    }

    public static void pair(int arr[],int size, int element){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){ //loop is starting from 0 so as to handle the case of unsorted arrays
                if(arr[i]==arr[j])
                continue;
                if(arr[i]+arr[j]==element){
                    if(arr[i]<arr[j]){
                        System.out.println("The pairs are "+arr[i] +arr[j]);
                        break;
                    }
                }
            }
        }
    }
}