import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
        for(int i=n; i>=1; i--){
        	for(int j=1; j<=i; j++){ 
        		if(i==n){
        			System.out.print(j);
        		}
        		else{
        			if(j>1 && j<i){
        				System.out.print(" ");
        			}else {
        				System.out.print(j);
        			}
        		}
        	}
        	System.out.println("");
        }
        scan.close();
    }
}
