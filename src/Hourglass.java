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
*for loop for the " \" then ":" then "/ "
*
*BOTTOM HALF
*reverse top half
*" /" then ":" then "\ "
*
*/

public class Hourglass {
	public static final int SIZE=4;
	public static void main(String[]args) {	
		topAndBottom();
		topHalf();
		middle();
		bottomHalf();
		topAndBottom();
	}
	public static void topAndBottom() {			
		System.out.print("|");	
		for(int c=1; c<=SIZE*2+2; c++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	
//SPACES
	public static void topHalf() {
		for(int a=1; a<=SIZE; a++) {
			for (int b=1; b<=a; b++) {
				System.out.print(" ");
			}
		
//CONE
			System.out.print("\\");
			for(int c=(SIZE*2+2)-(a*2); c>=1; c--) {
				System.out.print(":");
			}
			System.out.println("/");
		}
	}
	
//middle bunch is aight
	public static void middle() {
		for(int d= 1; d<= SIZE+1; d++) {
			System.out.print(" ");
		}
		System.out.println("||");
	}
	
	
//INVERSE CONE IS aight
	public static void bottomHalf() {
		for (int b = SIZE; b >= 1; b--) {
			for (int space = 1; space <= b; space++) {
				System.out.print(" ");
			}
			System.out.print("/");									
			for (int dots = (2 * SIZE + 2) - (2 * b); dots >= 1; dots--) {
				System.out.print(":");
			}
			System.out.println("\\");
		}
	}
}
