import java.util.Scanner;

public class peakElement {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int size = Sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Sc.nextInt();
        }
        int peak = mountain(arr, size);
        System.out.println("The index of peak element is: " + peak);
    }

    public static int mountain(int arr[], int size) {
        int s = 0;
        int e = size - 1;
        // int peak=0;
        // while (s < e) {
        //     int mid = s + (e - s) / 2;
        //     if((mid==0||arr[mid]>arr[mid-1])&&(mid==size-1||arr[mid]>arr[mid+1])){
        //         peak= mid;
        //         break;
        //     }else if(arr[mid]>arr[mid-1]&&mid>0){
        //         s=mid+1;
        //     }else{
        //         e=mid;
        //     }
        // }
        // return peak;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }else{
                e=mid;
            }
        }
        return s;
    }
}
