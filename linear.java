import java.util.Scanner;
public class linear{
    
    public static void main(String args[]){

        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=Sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i] = Sc.nextInt();
        }

        System.out.println("Enter the element you want to search");
        int element=Sc.nextInt();

        int idx=linearSearch(arr,size,element);
        System.out.println("The position your element is :"+idx);

    }

    public static int linearSearch(int arr[],int size,int element){
        int pos=0;
        for(int i=0;i<size;i++){
            if(arr[i]==element){
                pos=i;
            }
        }
        return pos;
    }
}