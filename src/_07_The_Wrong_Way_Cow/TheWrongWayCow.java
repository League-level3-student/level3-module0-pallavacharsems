/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

import javax.swing.JOptionPane;

public class TheWrongWayCow {

	public static int[] findWrongWayCow(final char[][] field) {
		// Fill in the code to return the [col, row] coordinate position of the
		// head (letter 'c') of the wrong way cow!
		int lcoords[] = new int[2];
		int rcoords[] = new int[2];
		int ucoords[] = new int[2];
		int dcoords[] = new int[2];
		
		int lcow = 0;
		int rcow = 0;
		int ucow = 0;
		int dcow = 0;
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				if (field[i][j] == 'c') {
					if (i < field.length - 1 && field[i + 1][j] == 'o') {
						if (i < field.length - 2 && field[i + 2][j] == 'w') {
							int[] coords = { j, i };
							rcow+=1;
							rcoords = coords;
							
						}
					}
					if (i > 0 && field[i - 1][j] == 'o') {
						if (i > 1 && field[i - 2][j] == 'w') {
							int[] coords = { j, i };
							lcow+=1; 
							lcoords = coords;
							
						}
					}
					if (j > 0 && field[i][j - 1] == 'o') {
						if (j > 1 && field[i][j - 2] == 'w') {
							int[] coords = { j, i };
							ucow+=1;
							ucoords = coords;
							
						
						}
					}
					if (j < field[i].length-1 && field[i][j + 1] == 'o') {
						if (j < field[i].length-2 && field[i][j + 2] == 'w') {
							int[] coords = { j, i };
							dcow+=1;
							dcoords = coords;
							
						
						}
					}
				}
			}
		}
		if(lcow == 1) {
		return lcoords;
		}
		if(rcow == 1) {
			return rcoords;
		}
		if(ucow == 1) {
			return ucoords;
		}
		if(dcow == 1) {
			return dcoords;
		}
		return null;
	}
}
