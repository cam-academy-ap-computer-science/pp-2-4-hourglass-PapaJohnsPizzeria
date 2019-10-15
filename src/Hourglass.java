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
		topAndBottom();					//sequence shape
		topHalf();
	}
	public static void topAndBottom() {			//the caps
		System.out.print("|");	
		for(int c=1; c<=SIZE; c++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	public static void topHalf() {					//the \/ shape of hourglass
		for(int c=1; c<=((SIZE/2)-1); c++) {
				for(int n=1; n<=1; n++) {
					System.out.print(" ");
				}
			}
			System.out.print("\\");
			for(int t=1; t<=SIZE-2; t++) {
				System.out.print(":");
			}
			System.out.println("/");
		}
	}
