import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
        for(int i=n; i>=1; i--){
        	
        	for(int k=0;k<n-i;k++){
        		System.out.print("b");
        	}
        	
        	for(int j=i; j>=1; j--){
        		System.out.print("*");
        	}
        	
        	System.out.println("");
        }
        scan.close();
    }
}
