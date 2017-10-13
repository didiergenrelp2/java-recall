package co.simplon.recall;

import java.util.*;

public class PlayingWithAlgo {
	
	public static String helloWorld(String name) {
		// TODO Auto-generated method stub
		String message;
		//message = name == "" ? "Hello World": "Hello "+name;
		if (name == "")
			message = "Hello World";
		else
			message = "Hello " + name;
		return message;
	}

	public static List<String> selectElementsStartingWithA(String array[]) {
		ArrayList<String> listeMot = new ArrayList<String>();	
		String mot="";
		if(array[0]=="a")
		listeMot.add(mot);
	//	char[] letter = array.toCharArray();
		//if(letter(0) = "a")
			//System.out.println(array);
		return null;//List<array>;
	}

	public static List<String> selectElementsStartingWithVowel(String array[]) {
		return null;
	}

	public static String[] removeNullElements(String array[]) {
		//ArrayList<String> removeNullElements = new ArrayList<String>();
		String tableau[] = array;
		for(int indice = 0; indice < array.length; indice++)
		{
			if(array[indice] != null) 
			{
				return tableau[indice];
				//array = fillArray(array, indice);
				//removeNullElements.add(array);
			}
			else indice++;
			 //return removeNullElements.toArray(new String[0]);
			}
		
		
		
		return null;
		}
	

	public static String[] reverseWordsInMyStringArray(String array[]) {
		return null;
	}

	public static String[] reverseOrderInArray(String array[]) {
		return null;
	}

	public static String[][] everyPossiblePair(String array[]) {
		return null;
	}

	public static List<String> sortByLastLetter(String array[]) {
		return null;
	}

	public static String getFirstHalf(String string) {
	
		
		
		return null;
	}

	public static String exportWordWithoutALetter(String array[], char letter) {
		return null;
	}

	public static int numberOfPalindromeWord(String text) {
		return 0;
	}

	public static int numberOfPalindromeText(String text) {
		return 0;
	}
	
	public static String shortestWord(String text) {
		String court = "";
		if(court == "") 
			court = text;
		else if((court.length() > text.length()))
			court = text;
		else
		return court;
	}

	public static String longestWord(String text) {
		
		return null;
	}

	public static String getAllLetters(String[] array) {
		return null;
	}
	
	public static String removeCapitals(String text) {
		//String texteMinuscule = text.toLowerCase();
		//String[] texteMinuscule = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
		return null;
	}
	
	public static String formatDateNicely(String text) {
		return null;
	}
	
	public static String getDomainName(String email) {
		return null;
	}

	public static String titleize(String title) {
		return null;
	}
	
	public static boolean checkForSpecialCharacters(String string) {
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
		return 0;
	}

	public static int[] allElementsExceptFirstThree(int array[]) {
		return null;
	}

	public static int[] addElementToBeginning(int array[], int element) {
		return null;
	}

	public static Float makeNegative(Float number) {
		if (number > 0) 
		{
			Float negative = -number;
			return negative;
		}
		else
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
		int resultat= number;
		if(resultat == 1) 
			return 1;
		
		return resultat * factorial(resultat - 1);
		
	}

	public static int convertToCelsius(int temperature) {
		double celcius = Math.round((temperature - 32) / 1.8);
		temperature = (int)celcius;
		return temperature;
	}
	
	public static boolean checkIfPair(int number) {
		int pair = number % 2;
		if( pair == 0)
			return true;
		else
		return false;
	}
	
	public static boolean checkIfPairPairImpair(int number1, int number2, int number3) {
		int pair1 = number1 % 2;
		int pair2 = number2 % 2;
		int pair3 = number3 % 2;
		if((pair1 == 0) && (pair2 == 0) && (pair3!=0))
			return true;
		else
		return false;
	}
	
	public static boolean checkIfSumIsPair(int number1, int number2, int number3) {
		int sum = (number1 + number2 + number3) % 2;
		if(sum == 0)
			return true;
		else
		return false;
	}
	
	public static boolean checkIfAllElementsPair(int[] array) {
		return false;
	}
	
	public static ArrayList<Integer> exportAllElementsPair(int[] array) {
		return null;
	}
	
	public static ArrayList<Integer> exportAllUniqueElementsPair(int[] array) {
		return null;
	}
	
	public static boolean checkIfTriangleRectangle(int number1, int number2, int number3) {
		//a²+b²=c²	
		int carreA = number1*number1;
		int carreB = number2*number2;
		int carreC = number3*number3;
		if((number1<number3)&&(number2<number3)&&(carreA+carreB==carreC))
			return true;
		else if((number2<number1)&&(number3<number1)&&(carreC+carreB==carreA))
			return true;
		else if((number3<number2)&&(number1<number2)&&(carreC+carreA==carreB))
			return true;
		else			
		return false;
	}
	
	public static boolean checkSiTuPeuxAcheter(int prix) {
		// t'as 22 euros en monnaies de 2 euros, la machine ne rend pas de monnaie, check si tu peux payer
		int deux = prix % 2;
		if((deux==0)&&(prix <= 22))
			return true;
		else
		return false;
	}
	
	public static boolean checkCase1(double prix, int pourcentDeRemise) {
		// t'as 100 euros, verifie si tu peux acheter l'article solde
		double prixSolde = prix - (pourcentDeRemise*prix/100);
		if(prixSolde <= 100)
			return true;
		else
		return false;
	}
	
	public static boolean checkCase2(int number1, int number2) {
		// check si un des 2 chiffres, ou leur somme se divise par 7
		int div1 = number1 % 7;
		int div2 = number2 % 7;
		int sum = (number1 + number2) % 7;
		if((div1==0) || (div2==0) || (sum==0))
				return true;
		else
		return false;
	}
	
	public static boolean checkCase2a(int number1, int number2) {
		// check si une de 2 chiffres mais pas leur somme se divise par 7
		int div1 = number1 % 7;
		int div2 = number2 % 7;
		int sum = (number1 + number2) % 7;
		if(((div1==0) || (div2==0)) && (sum!=0))
			return true;
	else
		return false;
	}
	
	public static boolean checkCase3(int number1, int number2, int number3) {
		// check si les trois chiffres sont dans l'ordre, soit croissant ou decroissant
		if((number1<number2) && (number2<number3))
			return true;
		else if((number2<number1)&&(number3<number2))
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
	
	public static ArrayList<Integer> insertElementInTheMiddleOfAnArray(int array[], int element ) {
		return null;
	}
	
	public static ArrayList<Integer> exportElementsPair( ArrayList<Integer> list ) {
		
		return null;
	}
	
	public static ArrayList<Integer> exportElementsWithIndexPair( ArrayList<Integer> list ) {
		return null;
	}
	
	public static int Addition( HashMap<String, Integer> addition ) {
		return 0;
	}
	
	public static boolean checkIfStringStartsWithA( String word ) {
		return false;
	}
	
	public static boolean checkIfStringStartsWithVowel( String word ) {
		return false;
	}
	
	public static boolean checkIfStringEndsWithS( String word ) {
		return false;
	}
	
	public static String findShortestWord(String[] array ) {
		
		return null;
	}
	
	public static String swapFirstandLastLetter(String array ) {
		//array.replace(String[0] newArray, array[0])
		return null;
	}
	
	public static int[] swapFirstandLastElement(int[] array ) {
		
		return null;
	}

}
