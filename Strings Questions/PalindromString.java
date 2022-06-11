// String Palindrom
// abba  --> Palindrom
// aab   --> Not Palindrom
import java.util.Scanner;
class PalindromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String rev ="";
        // for(int i=0;i<s1.length();i++){
        //     rev = s1.charAt(i)+rev;
        // }
        // int flag = 0;
        // for(int i=0;i<s1.length();i++){
        //     if(s1.charAt(i) != rev.charAt(i)){
        //         flag = 1;
        //         break;
        //     }
        // }
        // if(flag == 1){
        //     System.out.println("Not Palindrom");
        // }
        // else{
        //     System.out.println("Palindrom");
        // }
        
        // *******************using 2 pointer approach
        int low=0;
        int high = s1.length()-1;
        int flag = 0;
        while(low <= high){
            if(s1.charAt(low)==s1.charAt(high)){
                low++;
                high--;
            }
            else {
                flag++;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not Palindrom");
        }

        
    }
}