import java.util.Scanner;
class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int search = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int flag = 0;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==search){
                flag++;
                break;
            }
            else if(search<arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            
        }
        if(flag == 1){
            System.out.println("Search Found");
        }
        else{
            System.out.println("Search Not Found");
        }
        
        
        
    }
}