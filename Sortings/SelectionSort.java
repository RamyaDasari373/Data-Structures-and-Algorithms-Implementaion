import java.util.Scanner;
import java.util.Arrays;
class SelectionSort {
    public static void main(String[] args) {
        //SORT THE ARRAYS IN ASC ORDER
        //every Iteration it will move the smallest element to fisrt place by swapping.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int min_index = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            if(arr[min_index]<arr[i]){
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i]=temp;
            }
            System.out.println(Arrays.toString(arr));
        }
        //System.out.println(Arrays.toString(arr));
       
        
        // 2 3 1 4
    }
}