// Implementing string.indexOf function
//System.out.println(main_string.indexOf("el")); 
//o/p : 1
import java.util.Scanner;
class IndexOfSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String main_string = "hohellohel";
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
                System.out.println(i);
                break;
            }
        }
        
    }
}
