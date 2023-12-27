import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
        for(int i=1; i<=n; i++){
        	for(int k=1; k<=n-i; k++){
        		System.out.print(" ");
        	}
        	for(int j=1; j<=i; j++){
        		if(i>2 && i<n){
        			if(j>1 && j<i){
        				System.out.print(" ");
        			}else{
        				System.out.print(j);
        			}
        		}else{
        			System.out.print(j);
        		}
        		if(j<i){
        			System.out.print(" ");
        		}
        	}
        	System.out.println("");
        }
        scan.close();
    }
}
