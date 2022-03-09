// Java program to illustrate if-else-if ladder

import java.io.*;

class GFG1 {
	public static void main(String[] args)
	{
		// initializing expression
		int i = 20;

		// condition 1
		if (i == 10){
			System.out.println("i is 10\n");}

		// condition 2
		else if (i == 15)
			System.out.println("i is 15\n");

		// condition 3
		else if (i == 30){
			System.out.println("i is 20\n");}

		else{
			System.out.println("i is not present\n");}

            

		System.out.println("Outside if-else-if");
	}
}
