/******************************************************************************
IMPLEMENTING QUEUE

1 2 3 4 5

front --> index of the front element from the QUEUE
end   -->index of the last element from the QUEUE
*******************************************************************************/
import java.util.*;
class QueueImplementation
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int size = sc.nextInt();
	   int queue[] = new int[size];
	   int front = -1;
	   int end = -1;
	   //push operation
	   for(int i=0;i<size;i++){
	       if(front == -1){
	           queue[front+1]=sc.nextInt();
	           front++;
	           end++;
	       }
	       else{
	           queue[end+1]=sc.nextInt();
	           end++;
	       }
	   }
	   //pop operation
	   for(int i=0;i<size;i++){
	       if(front == -1){
	           System.out.println("STACK IS ALREADY EMPTY");
	           break;
	       }
	       else if(front == end){
	           front = -1;
	       }
	       else{
	           front++;
	       }
	   }
	   //peek and isempty()
	   if(front != -1){
	   System.out.println("front element is "+queue[front]);
	   }
	   else{
	       System.out.println("queue is empty");
	   }


	   
	}
}
