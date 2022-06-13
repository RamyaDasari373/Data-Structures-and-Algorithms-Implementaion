/******************************************************************************

                         Count of occurence of each charecter using hasing

*******************************************************************************/

public class CountChars
{
	public static void main(String[] args) {
	    String s="ACBCCADE";
        int n= s.length();
        int ascii[]=new int[128];
        
        for(int i=0;i<n;i++){
            int index = (int) s.charAt(i);
            ascii[index]++;
        }
        char ch=' ';
        int count = 0;
        for(int i=0;i<128;i++){
            if(ascii[i]>0){
                ch = (char) i;
                count = ascii[i];
                System.out.println(ch+" "+count);
            }
        }
	}
}
