/*
*Pseudocode
*
*TOP AND BOTTOM
*one "|"
*link quotes to size
*run forloop
*one "|"
*
*TOP HALF
*forloop for the " \" then ":" then "/ "
*
*BOTTOM HALF
*reverse top half
*" /" then ":" then "\ "
*
*/

public class Hourglass {
	public static final int SIZE=10;
	public static void main(String[]args) {	
		topAndBottom();
		topHalf();
	}
	public static void topAndBottom() {			
		System.out.print("|");	
		for(int c=1; c<=SIZE; c++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	public static void topHalf() {
		for(int c=1; c<=4; c++) {
			for(int a=1; a<=((SIZE/2)-1); a++) {
			System.out.print(" ");
			}
			System.out.print("\\");
			for(int n=1; n<=((SIZE/2)-1); n++) {
				System.out.print(":");
			}
			System.out.println("/");
		}
	}
}