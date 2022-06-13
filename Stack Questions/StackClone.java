/***************************************************************************
 CLONE ONE STACK INTO ANOTHER (COPY)
 I/P :   O/P:
 4        4
 3        3 
 2        2
 1        1
 **************************************************************************/
import java.util.*;
class StackClone
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		int top1=-1;
		int top2=-1;
		int top3=-1;
		int st1[]=new int[size1];
		int st2[]=new int[size1];
		int st3[]=new int[size1];
		for(int i=0;i<size1;i++){
		    st1[top1+1] = sc.nextInt();
		    top1=top1+1;
		}
		while(top1 != -1){
		    st2[top2+1] = st1[top1];
		    top2++;
		    top1--;
		}
		for(int i=0;i<size1;i++){
		    st3[top3+1] = st2[top2];
		    top3++;
		    top2--;
		}
		//orignal stack
		System.out.println(Arrays.toString(st1));
		//middle stack ,it store reverse of orignalstack
		System.out.println(Arrays.toString(st2));
		//copied stack
		System.out.println(Arrays.toString(st3));

	}
}
