import java.util.Scanner;

public class tripletSum{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int size=Sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Sc.nextInt();
        }
        System.out.println("Enter the element");
        int element=Sc.nextInt();
        triplet(arr,size,element);
    }

    public static void triplet(int arr[],int size,int element){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                for(int k=0;k<size;k++){
                    if(arr[i]==arr[j]){
                        continue;
                    }else if(arr[i]==arr[k]){
                        continue;
                    }else if(arr[j]==arr[k]){
                        continue;
                    }else if(arr[i]+arr[j]+arr[k]==element){
                        if(arr[i]<arr[j]&&arr[j]<arr[k]){
                            System.out.println("The elements are " +arr[i] +arr[j] +arr[k]);
                        }
                    }
                }
            }
        }
    }
}