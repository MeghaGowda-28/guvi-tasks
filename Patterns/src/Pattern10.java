import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	String n = scan.nextLine();
    	String[] list = n.split(" ");
    	int a = Integer.valueOf(list[0]);
    	int b = Integer.valueOf(list[1]);
        for(int i=1; i<=a; i++){
        	for(int j=1; j<=b; j++){ 
        		if(i>1 && i<a){
        			if(j>1 && j<b){
        				System.out.print("  ");
        			}else {
        				System.out.print("*");
        				if(j==1){
        					System.out.print(" ");
        				}
        			}
        		}
        		else {
        			System.out.print("*");
        			if(j<b){
        				System.out.print(" ");
        			}
        		}
        	}
        	System.out.println("");
        }
        scan.close();
    }
}
