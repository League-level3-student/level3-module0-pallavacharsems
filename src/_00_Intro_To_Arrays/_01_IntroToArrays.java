package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
String[] names = new String[5];
names[0] = "Jan";
names[1] = "Sara";
names[2] = "Fred";
names[3] = "Marc";
names[4] = "Randy";
        // 2. print the third element in the array
System.out.println(names[2]);
        // 3. set the third element to a different value
names[2] = "Jack";
        // 4. print the third element again
System.out.println(names[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
for (int i = 0; i < names.length; i++) {
	names[i] = "Josh";
	System.out.println(names[i]);
}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE

        // 7. make an array of 50 integers
int num[] = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
int n = 0;
Random rand = new Random();
for (int i = 0; i < num.length; i++) {
	n = rand.nextInt(1000);
	num[i] = n;
	System.out.println(num[i]);
	
}
int small = num[0];
int large = num[0];
for (int x = 0; x < num.length; x++) {
	if (num[x] < small) {
		small = num[x];
	} if (num[x] > large) {
		large = num[x];
	}
	
}
System.out.println("Small: "+ small);
System.out.println("Large: "+ large);
System.out.println(num[num.length-1]);
        // 9. without printing the entire array, print only the smallest number
        //    on the array

        // 10 print the entire array to see if step 8 was correct

        // 11. print the largest number in the array.

        // 12. print only the last element in the array

    }
}
