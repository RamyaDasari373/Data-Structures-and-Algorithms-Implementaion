// {{{}}}  - Balenced
// {{]]}}  - UnBalenced

import java.util.Scanner;
class BalencedParenthesisType2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        char st[]=new char[s.length()];
        int top = -1;
        int flag=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                st[top+1] = s.charAt(i);
                top++;
            }
            else{
                if(top == -1){
                    flag = 1;
                    break;
                }
                else if(s.charAt(i)==')' && st[top] == '(' || s.charAt(i)=='}' && st[top] == '{' || s.charAt(i)==']' && st[top] == '[' ){
                    top--;
                }
                else{
                    flag = 1;
                    break;
                }
            }
        }
        if(flag==1 || top != -1){
            System.out.println("Unbalenced");
            
        }
        else{
            System.out.println("Balenced");
        }
        
    }
}