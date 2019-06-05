package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("What is the file that should be searched? ");
		String Filepath = userInput.nextLine();
		File f = new File(Filepath);

		System.out.print("What is the search word you are looking for ");
		String search_word = userInput.nextLine();

		System.out.print("Should the search be case sensitive? (Y\\N) ");
		String yN = userInput.nextLine();

		try {

			Scanner sc = new Scanner(f);
			int count = 0;
			while (sc.hasNextLine()) {
				count++;
				String fileLine = sc.nextLine();
				if (yN.equalsIgnoreCase("y")) {
					if (fileLine.contains(search_word + " ")) {
						System.out.println(count + ") " + fileLine);
					}
				}
				if (yN.equalsIgnoreCase("n")) {
					String s1 = search_word.substring(0, 1).toUpperCase();
					String nameCapitalized = s1 + search_word.substring(1);

					String s2 = search_word.substring(0, 1).toLowerCase();
					String nametoLowerCase = s2 + search_word.substring(1);

					if (fileLine.contains(nameCapitalized) || fileLine.contains(nametoLowerCase)) {
						System.out.println(count + ") " + fileLine);
					}
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
