import java.util.Scanner;
import java.util.Arrays;
class InsertionSort {
    public static void main(String[] args) {
        //SORT THE ARRAYS IN ASC ORDER
        //2 parts here , one is sorted part,another is unsorted part
        //take first element from unsorted part and put that element in sorted part suitable position
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++){
            int j = i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
            System.out.println(Arrays.toString(arr));
    }
}

