package co.simplon.recall;

import java.util.*;

public class PlayingWithAlgo {

	public static String helloWorld(String name) {
		// TODO Auto-generated method stub
		String message;
		// message = name == "" ? "Hello World": "Hello "+name;
		if (name == "")
			message = "Hello World";
		else
			message = "Hello " + name;
		return message;
	}

	public static List<String> selectElementsStartingWithA(String array[]) {
		ArrayList<String> listeMot = new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			if (array[i].charAt(0) == 'a') {
				listeMot.add(array[i]);
			}
		}
		return listeMot;
	}

	public static List<String> selectElementsStartingWithVowel(String array[]) {
		List<String> listeNull = new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null && (array[i].charAt(0) == 'a' || array[i].charAt(0) == 'e' || array[i].charAt(0) == 'i'
					|| array[i].charAt(0) == 'o' || array[i].charAt(0) == 'u')) {
				listeNull.add(array[i]);
			}
		}
		return listeNull;
	}

	public static String[] removeNullElements(String array[]) {
		ArrayList<String> liste = new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				liste.add(array[i]);
			}
		}
		return liste.toArray(new String[liste.size()]);
	}

	public static String[] reverseWordsInMyStringArray(String array[]) {
		ArrayList<String> tab = new ArrayList<String>();
		String tabRetour[] = new String[tab.size()];
		for (int i = 0; i < array.length; i++) {
			String reverse = new StringBuilder(array[i]).reverse().toString();
			tab.add(reverse);
		}
		tabRetour = tab.toArray(tabRetour);
		return tabRetour;
	}

	public static String[] reverseOrderInArray(String array[]) {
		for (int i = 0; i < array.length / 2; i++) {
			String temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		return array;
	}

	public static String[][] everyPossiblePair(String array[]) {
		return null;
	}

	public static List<String> sortByLastLetter(String array[]) {
		/*
		 * ArrayList<String> listeMot = new ArrayList<String>(); for (int i=0; i <
		 * array.length + 1 ; i++) { if(i==array[i].charAt(array.length)) { char
		 * der=charAt(array.length); }
		 * 
		 * }
		 */
		return null;
	}

	public static String getFirstHalf(String string) {
		String half = string;
		int calcul = (int) Math.round(string.length() / 2);
		if (calcul % 2 != 0)
			return half.substring(0, calcul);
		else
			return half.substring(0, calcul + 1);
	}

	public static String exportWordWithoutALetter(String array[], char letter) {
		return null;
	}

	public static int numberOfPalindromeWord(String text) {
		String tableau[] = text.split("'");
		int compteur = 0;
		for (int i = 0; i < tableau.length; i++) {
			String origine = tableau[i];
			String reverse = new StringBuilder(origine).reverse().toString();
			if (reverse.equals(origine)) {
				compteur++;
			}
		}
		return compteur;
	}

	public static int numberOfPalindromeText(String text) {
		String tableau[] = text.split(",");
		int compteur = 0;
		for (int i = 0; i < tableau.length; i++) {
			String texteModif = tableau[i].replaceAll("\\p{Punct}", "").toLowerCase();
			String origine = texteModif.replace(" ", "");
			System.out.println(texteModif);
			String reverse = new StringBuilder(origine).reverse().toString();
			if (reverse.equals(origine)) {
				compteur++;
			}
		}
		return compteur;
	}

	public static String shortestWord(String text) {
		String court = "";
		String tableau[] = text.split(" ");
		for (int i = 0; i < tableau.length; i++) {
			if (court == "")
				court = tableau[i];
			else if ((court.length() > tableau[i].length()))
				court = tableau[i];
		}
		return court;
	}

	public static String longestWord(String text) {
		String texteModif = text.replaceAll("\\p{Punct}", "");
		String tableau[] = texteModif.split(" ");
		String longest = "";
		for (int i = 0; i < tableau.length; i++) {
			if (longest.length() < tableau[i].length())
				longest = tableau[i];
		}
		return longest;
	}

	public static String getAllLetters(String[] array) {
		// String lettres[] = new String[26];
		// for(int i=0;i<array.length;i++) {
		// String mot = array[i];
		// for(int j=0; j< mot.length();j++) {
		// while (mot.charAt(j)!=mot.charAt(i))
		// lettres.add(mot.charAt(j));
		// }
		// }
		return null;
	}

	public static String removeCapitals(String text) {
		String texteMinusule = text.replaceAll("[A-Z]", "");
		return texteMinusule;
	}

	public static String formatDateNicely(String text) {
		// static DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		// String date = SimpleDateFormat("dd-MM-yyyy");
		return null;
	}

	public static String getDomainName(String email) {
		String texteModif = email.replaceAll("^.+@(.+)\\..+$", "$1");
		return texteModif;
	}

	public static String titleize(String title) {
		// String titre;
		// titre.charAt(0)= title.toUpperCase().charAt(0);
		//// title = title.toUpperCase.charAt(0);
		// // title.toUpperCase().charAt(0);
		// System.out.println(titre);
		return null;
	}

	public static boolean checkForSpecialCharacters(String string) {
		if (string.matches("^.*\\p{Punct}.*$")) // \\W
			return true;

		return false;
	}

	public static String[] findAnagrams(String name) {

		return null;
	}

	public static int[] letterPosition(String name) {
		return null;
	}

	public static long addingTwoNumbers(long number1, long number2) {
		long resultat = number1 + number2;
		return resultat;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		long resultat = number1 + number2 + number3;
		return resultat;
	}

	public static long addingSeveralNumbers(final long... numbers) {
		long addition = 0;
		for (long num : numbers) {
			addition = num + addition;
		}
		return addition;
	}

	public static int[] allElementsExceptFirstThree(int array[]) {
		int[] resultat = new int[array.length - 3];
		for (int i = 3; i < array.length; i++) {
			resultat[i - 3] = array[i];
		}
		return resultat;
	}

	public static int[] addElementToBeginning(int array[], int element) {
		return null;
	}

	public static Float makeNegative(Float number) {
		if (number > 0) {
			Float negative = -number;
			return negative;
		} else
			return number;
	}

	public static String[] getElementsLowerThanSix(String[] array) {
		return null;
	}

	public static int[] sortTabBySelection(int[] array) {
		return null;
	}

	public static int[] sortTabByInsertion(int[] array) {
		return null;
	}

	public static int[] sortTabByBubble(int[] array) {
		return null;
	}

	public static int findIndexByDichotomy(int elemet, int[] array) {
		return 0;
	}

	public static int roundUp(float number) {
		int rond = Math.round(number);
		return rond;
	}

	public static int findLastDayOfMonth(int month, int year) {
		return 0;
	}

	public static int factorial(int number) {
		int resultat = number;
		if (resultat == 1)
			return 1;

		return resultat * factorial(resultat - 1);

	}

	public static int convertToCelsius(int temperature) {
		int celcius = (int) Math.round((temperature - 32) / 1.8);
		return celcius;
	}

	public static boolean checkIfPair(int number) {
		int pair = number % 2;
		if (pair == 0)
			return true;
		else
			return false;
	}

	public static boolean checkIfPairPairImpair(int number1, int number2, int number3) {
		int pair1 = number1 % 2;
		int pair2 = number2 % 2;
		int pair3 = number3 % 2;
		if ((pair1 == 0) && (pair2 == 0) && (pair3 != 0))
			return true;
		else
			return false;
	}

	public static boolean checkIfSumIsPair(int number1, int number2, int number3) {
		int sum = (number1 + number2 + number3) % 2;
		if (sum == 0)
			return true;
		else
			return false;
	}

	public static boolean checkIfAllElementsPair(int[] array) {
		for (int i = 0; i < array.length; i++) {
			// int tab = array[i];
			int calcul = array[i] % 2;
			if (calcul == 0) {
				continue;
			}
			if (i == array.length) {
				return true;
			} 
			else {
				return false;
			}
			
		}

	}

	public static ArrayList<Integer> exportAllElementsPair(int[] array) {
		return null;
	}

	public static ArrayList<Integer> exportAllUniqueElementsPair(int[] array) {
		return null;
	}

	public static boolean checkIfTriangleRectangle(int number1, int number2, int number3) {
		// a²+b²=c²
		int carreA = number1 * number1;
		int carreB = number2 * number2;
		int carreC = number3 * number3;
		if ((number1 < number3) && (number2 < number3) && (carreA + carreB == carreC))
			return true;
		else if ((number2 < number1) && (number3 < number1) && (carreC + carreB == carreA))
			return true;
		else if ((number3 < number2) && (number1 < number2) && (carreC + carreA == carreB))
			return true;
		else
			return false;
	}

	public static boolean checkSiTuPeuxAcheter(int prix) {
		// t'as 22 euros en monnaies de 2 euros, la machine ne rend pas de monnaie,
		// check si tu peux payer
		int deux = prix % 2;
		if ((deux == 0) && (prix <= 22))
			return true;
		else
			return false;
	}

	public static boolean checkCase1(double prix, int pourcentDeRemise) {
		// t'as 100 euros, verifie si tu peux acheter l'article solde
		double prixSolde = prix - (pourcentDeRemise * prix / 100);
		if (prixSolde <= 100)
			return true;
		else
			return false;
	}

	public static boolean checkCase2(int number1, int number2) {
		// check si un des 2 chiffres, ou leur somme se divise par 7
		int div1 = number1 % 7;
		int div2 = number2 % 7;
		int sum = (number1 + number2) % 7;
		if ((div1 == 0) || (div2 == 0) || (sum == 0))
			return true;
		else
			return false;
	}

	public static boolean checkCase2a(int number1, int number2) {
		// check si une de 2 chiffres mais pas leur somme se divise par 7
		int div1 = number1 % 7;
		int div2 = number2 % 7;
		int sum = (number1 + number2) % 7;
		if (((div1 == 0) || (div2 == 0)) && (sum != 0))
			return true;
		else
			return false;
	}

	public static boolean checkCase3(int number1, int number2, int number3) {
		// check si les trois chiffres sont dans l'ordre, soit croissant ou decroissant
		if ((number1 < number2) && (number2 < number3))
			return true;
		else if ((number2 < number1) && (number3 < number2))
			return true;
		else
			return false;
	}

	public static ArrayList<Integer> allElementsExceptFirstAndLast(int array[]) {

		return null;
	}

	public static int[] allElementsExceptFirstAndLastInt(int array[]) {
		return null;
	}

	public static ArrayList<Integer> allElementsWithIndexPair(int array[]) {
		return null;
	}

	public static ArrayList<Integer> reverseOrder(int array[]) {
		return null;
	}

	public static int[] reverseOrderInt(int array[]) {
		return null;
	}

	public static ArrayList<Integer> insertElementInTheMiddleOfAnArray(int array[], int element) {
		return null;
	}

	public static ArrayList<Integer> exportElementsPair(ArrayList<Integer> list) {

		return null;
	}

	public static ArrayList<Integer> exportElementsWithIndexPair(ArrayList<Integer> list) {
		return null;
	}

	public static int Addition(HashMap<String, Integer> addition) {
		return 0;
	}

	public static boolean checkIfStringStartsWithA(String word) {
		if (word.charAt(0) == 'a')
			return true;
		else if (word.charAt(0) == 'A')
			return true;
		else
			return false;
	}

	public static boolean checkIfStringStartsWithVowel(String word) {

		if (word.matches("[aeiouyAEIOUY]")) {
			// if ("aeiouyAEIOUY".indexOf(word) != -1)
			return true;
		}
		return false;
	}

	public static boolean checkIfStringEndsWithS(String word) {
		if (word.charAt(word.length() - 1) == 's')
			return true;
		else if (word.charAt(word.length() - 1) == 'S')
			return true;

		return false;
	}

	public static String findShortestWord(String[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() > array[i + 1].length())
				return array[i + 1];
		}
		return null;
	}

	public static String swapFirstandLastLetter(String array) {
		// String texte = array;
		// texte.charAt(0) = array.charAt(array.length());
		// texte.charAt(texte.length()) = array.charAt(0);
		//
		// array.replace(String[0] newArray, array[0])
		// array.charAt(0) => charAt(array.length)
		return null;
	}

	public static int[] swapFirstandLastElement(int[] array) {

		return null;
	}

}
