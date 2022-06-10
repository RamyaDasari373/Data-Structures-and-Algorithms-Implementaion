//finding the largest sum of sub array with size k
import java.util.*;

class LargestSubArraySumWithSizeK {
    public static void main(String[] args) {
        //o(n^2) complexity
        // int arr[] = {100,200,300,400};
        // int n=4;
        // int k = 4;
        // int mx=Integer.MIN_VALUE;
        // for(int i=0;i<=n-k;i++){
        //     int sum = 0;
        //     for(int j=i;j<i+k;j++){
        //         sum = sum+arr[j];
        //     }
        //     if(sum>mx){
        //         mx=sum;
        //     }
            
        // }
        // System.out.println(mx);
        //******************o(n) complexity************************
        int arr[]={100,200,300,400};
        int n=arr.length;
        int k=2;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        int mx=sum;
        for(int i=k;i<n;i++){
            sum = sum+arr[i]-arr[i-k];
            if(sum>mx){
                mx=sum;
        }
        }
        System.out.println(mx);
        
    }
}
