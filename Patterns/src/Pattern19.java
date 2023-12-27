import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	for(int k=1; k<n; k++){
        	for(int l=1; l<=k; l++){
        		System.out.print("*");
        	}
        	System.out.println("");
        }
        for(int i=n; i>=1; i--){
        	for(int j=1; j<=i; j++){
        		System.out.print("*");
        	}
        	System.out.println("");
        }
        scan.close();
    }
}
