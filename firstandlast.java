import java.util.Scanner;

public class firstandlast{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int size=Sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Sc.nextInt();
        }

        System.out.println("Enter the element whose first and last occurence you want to check");
        int element=Sc.nextInt();
        int firstOccurence=first(arr,size,element);
        int lastOccurence=last(arr,size,element);
        System.out.println("The first occurence is: "+firstOccurence);
        System.out.println("The last occurence is: "+lastOccurence);
    }

    public static int first(int arr[],int size,int element){
        int s=0;
        int e=size-1;
        int idx=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==element){
               idx=mid;
               e=mid-1;
            }else if(arr[mid]>element){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return idx;
    }

    public static int last(int arr[],int size,int element){
        int s=0;
        int e=size-1;
        int idx=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==element){
                idx=mid;
                s=mid+1;
            }else if(arr[mid]>element){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return idx;
    }

    
}