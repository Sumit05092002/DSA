import java.util.Scanner;

public class squareRoot{

    public static void main(String args[]){

        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the element whose square root you want to calculate");
        int element=Sc.nextInt();
         int [] arr=new int[element-1];
        for(int i=0;i<element-1;i++){
            arr[i]=i;
        }
        int square=sqrt(element,arr);
        System.out.println("The answer is:" +square);
    }

    public static int sqrt(int element,int arr[]){

        int start=0;
        int end=element-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int product=mid*mid;
            if(product==element){
                return mid;
            }else if(product>element){
                end=mid-1;
            }else{
                start=mid+1;
            }
            
        }
        return -1;
    }
}