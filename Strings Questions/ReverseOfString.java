// String reverse
// hellooo --> ooolleh
import java.util.Scanner;
class ReverseOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String rev ="";
        for(int i=0;i<s1.length();i++){
            rev = s1.charAt(i)+rev;
        }
        System.out.println("Reversed String is "+rev);
        // hello
        // h
        // eh
        // leh
        // lleh
        // olleh

        
    }
}
