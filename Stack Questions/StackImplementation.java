/******************************************************************************
IMPLEMENTING STACK
ALWAYS ACCESS ELEMENTS FROM TOP
ALWAYS REMOVE ELEMENT FROM TOP
EXAMPLE: PLATES,BANGLES

*******************************************************************************/
import java.util.*;
class StackImplementation
{
	public static void main(String[] args) {
	   int top = -1;
	   Scanner sc = new Scanner(System.in);
	   int size = sc.nextInt();
	   int st[] = new int[size];

	   //push operation into Stack 
	   for(int i=0;i<size;i++){
	       st[top+1]=sc.nextInt();
	       top++;
	   }
	   //pop 
	   for(int i=0;i<size;i++){
	       top--;
	   }
	   //isempty
	   if(top == -1){
	       System.out.println("STACK IS EMPTY");
	   }
	   // peek
	   else{
	       System.out.println("top element is "+st[top]);
	   }
	   //displaying the STACK
	   //System.out.println(Arrays.toString(st));
	   
	}
}
