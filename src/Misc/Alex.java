package Misc;

import java.util.Scanner;

public final class Alex {
	public static final void sort(Comparable[] array) {
		swapSort(array);
	}
	public static final void swapSort(Comparable[] array) {
		int count = array.length;
		int i_left = 0;
		int i_right = i_left+1;
		//Start at the left side and move right while swapping elements
		while(i_right < count) {
			Comparable s_left = array[i_left];
			Comparable s_right = array[i_right];
			if(s_left.compareTo(s_right) > 0) {
				array[i_right] = s_left;
				array[i_left] = s_right;
				i_left--;	//Step left in case we have to move the left element further
				if(i_left < 0) {
					i_left = 0;
				}
			} else {
				i_left++;
			}
			i_right = i_left+1;
		}
	}
	public static final int askForInt(Scanner s, String message) {
		System.out.println(message);
		int result = s.nextInt();
		s.nextLine();
		return result;
	}
	public static final String askForNext(Scanner s, String message) {
		System.out.println(message);
		String result = s.next();
		s.nextLine();
		return result;
	}
	public static final String askForNextLine(Scanner s, String message) {
		System.out.println(message);
		return s.nextLine();
	}
	public static final String randomStrings(int count, int length, String separator) {
		String output = "";
		for(int i = 0; i < count-1; i++) {
			output += randomString(length) + separator;
		}
		output += randomString(length);
		return output;
	}
	public static final String randomString(int length) {
		String result = "";
		for(int i = 0; i < length; i++) {
			result += randomChar();
		}
		return result;
	}
	public static final char randomChar() {
		switch((int) (Math.random() * 3)) {
		case 0 : return randomLowerCase();
		case 1 : return randomUpperCase();
		case 2 : return randomNumber();
		default : return (Character) null;
		}
	}
	public static final char randomLowerCase() {
		return (char) ('a' + Math.random() * (1 + 'z' - 'a'));
	}
	public static final char randomUpperCase() {
		return (char) ('A' + Math.random() * (1 + 'Z' - 'A'));
	}
	public static final char randomNumber() {
		return (char) ('0' + Math.random() * (1 + '9' - '0'));
	}
}
