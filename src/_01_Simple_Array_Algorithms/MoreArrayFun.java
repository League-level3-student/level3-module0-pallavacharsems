package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
public static void main(String[] args) {
	String[] names = { "Bob", "Jeff", "Josh", "Noah", "Jack" };
	printArray(names);
	printReverseArray(names);
	printOtherArray(names);
	printRandomArray(names);
	
}


     static //2. Write a method that takes an array of Strings and prints all the Strings in the array.
void printArray(String [] names) {
	for (int i = 0; i < names.length; i++) {
		System.out.println(names[i]);
	}
}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
 static void printReverseArray(String [] names) {
	for (int i = names.length-1; i >= 0 ; i--) {
		System.out.println(names[i]);
	}
}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
 static void printOtherArray(String [] names) {
	 for (int i = 0; i < names.length; i++) {
		 if(i%2 == 0) {
				System.out.println(names[i]);
		 }
		
	}
 }


    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
static void printRandomArray(String [] names) {
	int num = 0;
	Random rand = new Random();
	num = rand.nextInt(names.length-1);
	for (int i = 0; i < num; i++) {
		System.out.println(names[i]);
		
	}
	
}

}
