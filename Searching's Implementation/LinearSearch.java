import java.util.Scanner;
class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int search = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int flag = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==search){
                flag++;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Search not found");
        }
        else{
            System.out.println("Search found");
        }
        
        
        
    }
}
