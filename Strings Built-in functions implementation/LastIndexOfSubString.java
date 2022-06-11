// Implementing string.lastIndexOf
// System.out.println(main_string.lastIndexOf(sub_string));
import java.util.Scanner;
class LastIndexOfSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String main_string = "hohelloheloh";
        String sub_string = "oh";
        int n = main_string.length();
        int k = sub_string.length();
        int last_index = -1;
        for(int i=0;i<=n-k;i++){
            int j = i;
            for(j=i;j<i+k;j++){
                if(main_string.charAt(j)!=sub_string.charAt(j-i)){
                    break;
                }
            }
            if(j == (i+k)){
                last_index = i;
            }
        }
        System.out.println(last_index);
        
    }
}