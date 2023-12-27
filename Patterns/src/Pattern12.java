import java.util.Scanner;

public class Pattern12{
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
        for(int i=n; i>=1; i--){
        	//printing space
        	for(int j=n; j>i; j--){
        		System.out.print(" ");
        	}
        	//printing star
        	for(int k=1; k<=i; k++){
        		System.out.print("*");
        	}
        	System.out.println("");
        }
        scan.close();
    }
}
