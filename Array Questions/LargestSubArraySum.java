//finding the largest sum of sub array 
import java.util.*;

class LargestSubArraySum {
    public static void main(String[] args) {
        //***************************************with O(n^2) time complexity***************************************
        // int arr[] = {8,9,-1,5,98,-5,-2,11,15,18,-9,-2,10};
        // int n = arr.length;
        // int mx_sum = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     int sum = 0;
        //     for(int j=i;j<n;j++){
        //         sum = sum + arr[j];
        //         if(sum>mx_sum){
        //             mx_sum = sum;
        //         }
        //     }
            
        // }
        //System.out.println(mx_sum);
        //***************************************** (with kadane alg ) O(n) time complexity**********************************
        int arr[] = {8,9,-1,5,98,-5,-2,11,15,18,-9,-2,10};
        // 17 16 21 119 114 112 123 138 156 147 145 155
        int n = arr.length;
        int mx_sum = Integer.MIN_VALUE;
        int sum = 0;
        int st = 0;
        int ed = -1;
        int fst = 0;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
            if(sum>mx_sum){
                mx_sum = sum;
                fst = st;
                ed = i;
            }
            if(sum<0){
                sum = 0;
                st = i+1;
            }
        }
        System.out.println(mx_sum+" "+fst+" "+ed);
    }
}
