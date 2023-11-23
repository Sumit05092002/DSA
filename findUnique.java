import java.util.Scanner;

public class findUnique{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int size=Sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Sc.nextInt();
        }
        int find=unique(arr,size);
        System.out.println("The unique element is:" +find);

    }
    public static int unique(int arr[],int size){
        for(int i=0;i<size;i++){
            int count=0;
            for(int j=0;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                    if(count==2){
                        break;
                    }
                    
                }

            }
            if(count==1){
             return arr[i];
            }
        }
        return -1;
    }
}