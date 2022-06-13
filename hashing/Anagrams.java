/******************************************************************************

Find the given string2 are anagrams or Not using hashing
String 1: ACBCCADE
String 2: ACBADECC
OUTPUT:  YES

*******************************************************************************/

class Anagrams
{
	public static void main(String[] args) {
	    String s1="ABC";
	    String s2="CABB";
        int n1= s1.length();
        int n2= s2.length();
        int ascii1[]=new int[128];
        int ascii2[]=new int[128];
        for(int i=0;i<n1;i++){
            int index = (int)s1.charAt(i);
            ascii1[index]++;
        }
         for(int i=0;i<n2;i++){
            int index = (int)s2.charAt(i);
            ascii2[index]++;
        }
        int flag=0;
        for(int i=0;i<128;i++){
            if(ascii1[i] != ascii2[i]){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("anagrams");
        }
        else{
            System.out.println("Not anagrams");
        }
        
	}
}
