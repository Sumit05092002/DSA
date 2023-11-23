import java.util.Scanner;

public class findDuplicates{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int size=Sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Sc.nextInt();
        }
        int find=duplicate(arr,size);
        System.out.println("The duplicate element is" +find);
    }

    public static int duplicate(int arr[],int size){
        for(int i=0;i<size;i++){
            int count=0;
            for(int j=0;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                    if(count==2){
                        return arr[i];
                    }
                }
            }
            
        }
        return -1;
    }
}