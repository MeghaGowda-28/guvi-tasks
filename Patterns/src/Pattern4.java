import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	for(int i=n; i>=1; i--){
    		for(int j=1; j<=i; j++){
    			if((n-i+1)%2 == 0){
    				System.out.print(i-j+1);
    			}else{
    				System.out.print(j);
    			}
    		}
    	System.out.println("");
    	}
    	scan.close();
    }
}
