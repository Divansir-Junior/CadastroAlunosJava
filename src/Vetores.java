import java.util.Scanner;
import java.util.Locale;
public class Vetores {
    public static void main(String[] args){
    	Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        int i = 10;
        do {
        	i --;
        	if (i ==6 )
        		break;
        	System.out.println(i);
        }while(i>1);
        System.out.println("I = " + i);
        
        int k = 5 ;
        while(k > 1) {
        	k--;
        	if (k == 2 ) 
        		continue;
        	System.out.println(k);
        	
        }
        System.out.println("k - " + k);
        
    }
}
