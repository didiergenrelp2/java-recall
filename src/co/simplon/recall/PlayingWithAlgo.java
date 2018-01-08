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

		ArrayList<String> listeMot = new ArrayList<String>();
		ArrayList<String> tri = new ArrayList<String>();

		for (int i = 0; i < array.length; i++) {
			String origine = array[i];
			String reverse = new StringBuilder(origine).reverse().toString();
			listeMot.add(reverse);

		}
		Collections.sort(listeMot);
		for (int i = 0; i < listeMot.size(); i++) {
			String origine = listeMot.get(i);
			String reverse = new StringBuilder(origine).reverse().toString();
			tri.add(reverse);
		}
		return tri;
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
		boolean test = true;
		String retour = "Perdu !";
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null && i < array.length - 1)
				continue;
				//i++;
			else if (array[i] != null) {
				array[i] = array[i].toLowerCase();
				for (int j = 0; j < array[i].length(); j++) {
					System.out.println(array[i].charAt(j));
					if (letter == array[i].charAt(j)) {
						test = false;
						i++;
						j = -1;
						System.out.println(array[i] + test);

					} else if (test && j == (array[i].length() - 1)) {
						retour = array[i];
						System.out.println(retour);
						System.out.println(test);
						return retour;
					}
				}
			}
		}
		System.out.println(retour);
		return retour;
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
		String minuscules = name.toLowerCase();
		char[] alphabet = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
				'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int[] resultat = new int[name.length()];
		for (int i = 0; i < minuscules.length(); i++) {
			for (int j = 0; j < alphabet.length; j++)
				if (alphabet[j] == minuscules.charAt(i)) {
					resultat[i] = j + 1;
				}
		}
		return resultat;
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
		int debut[] = new int[array.length + 1];
		debut[0] = element;
		for (int i = 1; i < array.length + 1; i++) {
			debut[i] = array[i - 1];
		}
		return debut;
	}

	public static Float makeNegative(Float number) {
		if (number > 0) {
			Float negative = -number;
			return negative;
		} else
			return number;
	}

	public static String[] getElementsLowerThanSix(String[] array) {
		String six[] = new String[] { "1", "2", "3", "4", "5", "6" };
		ArrayList<String> resultat = new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < six.length; j++)
				if (array[i] == six[j]) {
					resultat.add(array[i]);
				}
		}
		Collections.sort(resultat);
		for (int i = 0; i < resultat.size() - 1; i++) {
			if (resultat.get(i) == resultat.get(i + 1)) {
				resultat.remove(resultat.get(i));
			}
		}
		String[] tab = resultat.toArray(new String[resultat.size()]);
		return tab;
	}

	public static int[] sortTabBySelection(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[index]) {
					index = j;
				}
			}
			int temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}
		return array;
	}

	public static int[] sortTabByInsertion(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		return array;
	}

	public static int[] sortTabByBubble(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	public static int findIndexByDichotomy(int elemet, int[] array) {
		int indexDebut = -1;
		int indexFin = array.length;
		int indexMilieu = 0;
		boolean resultat = false;

		while (!resultat && ((indexFin - indexDebut) > 1)) {

			indexMilieu = (indexDebut + indexFin) / 2;

			resultat = (array[indexMilieu] == elemet);
			if (array[indexMilieu] > elemet) {
				indexFin = indexMilieu;
			} else {
				indexDebut = indexMilieu;
			}
		}
		if (array[indexMilieu] == elemet) {
			return indexMilieu;
		} else
			return -1;

	}

	public static int roundUp(float number) {
		int rond = Math.round(number);
		return rond;
	}

	public static int findLastDayOfMonth(int month, int year) {
		int dernier;

		if ((month % 2 != 0 && month < 8) || (month % 2 == 0 && month > 7) || month == 7 || month == 8) {
			dernier = 31;

		} else if (month == 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
			dernier = 29;
		} else if (month == 2 && year % 100 == 0 && year % 400 != 0) {
			dernier = 28;
		} else if (month == 2 && year % 4 != 0) {
			dernier = 28;
		} else {
			dernier = 30;
		}
		return dernier;
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
		boolean pair = true;
		for (int i = 0; i < array.length; i++) {
			int calcul = array[i] % 2;
			if (calcul != 0) {
				pair = false;
			}
		}
		return pair;
	}

	public static ArrayList<Integer> exportAllElementsPair(int[] array) {
		ArrayList<Integer> elemPair = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			int calcul = array[i] % 2;
			if (calcul == 0) {
				elemPair.add(array[i]);
			}
		}
		return elemPair;
	}

	public static ArrayList<Integer> exportAllUniqueElementsPair(int[] array) {
		ArrayList<Integer> elemPair = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			int calcul = array[i] % 2;
			if (calcul == 0) {
				elemPair.add(array[i]);
			}
		}
		for (int i = 0; i < elemPair.size(); i++) {
			for (int j = 0; j < i; j++) {
				if (elemPair.get(i) == elemPair.get(j)) {
					elemPair.remove(elemPair.get(i));
				}
			}
		}
		return elemPair;
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
		ArrayList<Integer> tableau = new ArrayList<Integer>();
		for (int i = 1; i < array.length - 1; i++) {
			tableau.add(array[i]);
		}
		return tableau;
	}

	public static int[] allElementsExceptFirstAndLastInt(int array[]) {
		ArrayList<Integer> tableau = new ArrayList<Integer>();
		for (int i = 1; i < array.length - 1; i++) {
			tableau.add(array[i]);
		}

		int tab[] = new int[tableau.size()];
		for (int i = 0; i < tableau.size(); i++) {
			tab[i] = tableau.get(i);
		}
		return tab;
	}

	public static ArrayList<Integer> allElementsWithIndexPair(int array[]) {
		ArrayList<Integer> indexPair = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				indexPair.add(array[i]);
			}
		}
		return indexPair;
	}

	public static ArrayList<Integer> reverseOrder(int array[]) {
		ArrayList<Integer> reverse = new ArrayList<Integer>(array.length);
		for (int i = 0; i < array.length; i++) {
			reverse.add(array[array.length - i - 1]);
		}
		return reverse;
	}

	public static int[] reverseOrderInt(int array[]) {
		int reverse[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			reverse[i] = array[array.length - i - 1];
		}
		return reverse;
	}

	public static ArrayList<Integer> insertElementInTheMiddleOfAnArray(int array[], int element) {
		ArrayList<Integer> listeMilieu = new ArrayList<Integer>();
		int milieu = array.length / 2;
		for (int i = 0; i < array.length; i++)
			listeMilieu.add(array[i]);
		listeMilieu.add(milieu, element);
		return listeMilieu;
	}

	public static ArrayList<Integer> exportElementsPair(ArrayList<Integer> list) {
		ArrayList<Integer> pair = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				pair.add(list.get(i));
			}
		}
		return pair;
	}

	public static ArrayList<Integer> exportElementsWithIndexPair(ArrayList<Integer> list) {
		ArrayList<Integer> pair = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (i % 2 == 0) {
				pair.add(list.get(i));
			}
		}
		return pair;
	}

	public static int Addition(HashMap<String, Integer> addition) {
		int somme = 0;
		for (int i : addition.values()) {
			somme += i;
		}
		return somme;
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
		String voyelle = "aeiouyAEIOUY";
		for (int i = 0; i < voyelle.length(); i++) {
			if (word.charAt(0) == voyelle.charAt(i))
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
		return array.charAt(array.length() - 1) + array.substring(1, array.length() - 1) + array.charAt(0);
	}

	public static int[] swapFirstandLastElement(int[] array) {
		int tab[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (i == 0)
				tab[0] = array[array.length - 1];
			else if (i == array.length - 1)
				tab[tab.length - 1] = array[0];
			else
				tab[i] = array[i];
		}
		return tab;
	}
}
