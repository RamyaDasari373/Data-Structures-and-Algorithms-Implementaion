// Question:
// Check the given string of parenthesis  is Balenced or Unbalenced
// I/P1 : ((()))
// O/P1 : Balenced
// I/P2 : (
// O/P2 : Unbalenced
import java.util.Scanner;
class BalencedParenthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        char ch[]=new char[100];
        int top_of_stack = -1;
        int flag = 0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='('){
                ch[top_of_stack+1] = s1.charAt(i);
                top_of_stack++;
            }
            else{
                if(top_of_stack == -1){
                    flag = 1;
                    break;
                }
                top_of_stack--;
            }
        }
        if(flag == 1 || top_of_stack != -1){
            System.out.println("Unbalenced");
        }
        else{
            System.out.println("Balenced");
        }
    }
}
