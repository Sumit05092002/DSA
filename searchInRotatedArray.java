import java.util.Scanner;

public class searchInRotatedArray {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = Sc.nextInt();
        System.out.println("Enter the values");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Sc.nextInt();
        }
        System.out.println("ENter the element you are searching for");
        int element = Sc.nextInt();
        int idx = search(arr, size, element);
        System.out.println("The element is at: " + idx);
    }

    public static int search(int arr[], int size, int element) {
        int start = 0;
        int end = size - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] >= arr[0]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        if (arr[start] <= element && arr[size-1] >= element) {
            int pos=bsearch(arr,size,start,size-1,element);
            return pos;
        } else {
            int pos=bsearch(arr,size,0,start-1,element);
            return pos;
        }
    }

    public static int bsearch(int arr[], int size, int s, int e, int element) {
        while (s <= e) {
            int middle = s + (e - s) / 2;
            if (arr[middle] == element) {
                return middle;
            } else if (arr[middle] > element) {
                e = middle - 1;
            } else {
                s = middle + 1;
            }
        }
        return -1;
    }
}
