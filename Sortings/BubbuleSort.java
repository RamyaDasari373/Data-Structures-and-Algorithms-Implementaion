import java.util.Scanner;
import java.util.Arrays;
class BubbuleSort {
    public static void main(String[] args) {
        //SORT THE ARRAYS IN ASC ORDER
        //Logic : compare every element with next adjecent element , if elements not in correct order ,it will
        // swaps.Every iteration largest element will move to last position .
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(i+" "+Arrays.toString(arr));
            
        }
        
        
    }
}
