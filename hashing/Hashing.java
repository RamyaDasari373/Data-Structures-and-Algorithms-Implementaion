/******************************************************************************
Display the char that occures max no of time in java using hashing
time complexity 0(n)
*******************************************************************************/

public class Hashing
{
	public static void main(String[] args) {
	    String s="ABCC";
        int n= s.length();
        int ascii[]=new int[128];
        
        for(int i=0;i<n;i++){
            int index = (int) s.charAt(i);
            ascii[index]++;
        }
        int count = 0;
        char ch=' ';
        for(int i=0;i<128;i++){
            if(ascii[i]>count){
                count = ascii[i];
                ch = (char) i;
            }
        }
        System.out.println(ch+" "+count);
	}
}
