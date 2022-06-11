//check if sub string with size k is present or not in main string of size n
// OR Implementing contains function
import java.util.Scanner;
class SubStringPresentOrNotInMainString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String main_string = sc.nextLine();
        // String sub_string = sc.nextLine();
        String main_string = "helloh";
        String sub_string = "oh";
        int n = main_string.length();
        int k = sub_string.length();
        for(int i=0;i<=n-k;i++){
            int j = i;
            for(j=i;j<i+k;j++){
                if(main_string.charAt(j)!=sub_string.charAt(j-i)){
                    break;
                }
            }
            if(j == (i+k)){
               // System.out.println(j);
                System.out.println("Sub String present");
            }
        }
        
    }
}