
public class codingAssignmentWeek04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1 	
		int [] ages = { 3, 9, 23, 64, 2, 8, 28, 93};
		int substract = ages[ages.length - 1] - ages[0];
		System.out.println(substract);

		int [] ages2 = { 3, 9, 23, 64, 2, 8, 28, 93, 120};
		int substract2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println("The difference is "+substract2);
//c)
		int x = 0;
		for (int age : ages) {
			 x += age;
		}
		double average = x / ages.length;
		System.out.println("The age's average is "+average);
		System.out.println(" ");
//2			
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int sumOfLetters = 0;
		int totalNum = names.length;
		double avg;
		
		for (String name : names) {
			sumOfLetters += name.length();
		} 
		avg = sumOfLetters / totalNum;
		System.out.println("The average letters per name is "+avg);
		System.out.println(" ");
//b
		String holder ="";	
		for (String name : names) {
			holder = holder + " "+ name; 
		} 
		System.out.println("Here are the names:"+holder);
		System.out.println(" ");
//3 

		System.out.println("Here is the last element: "+names[names.length- 1]);
		System.out.println(" ");
//4
		System.out.println("Here is the first element: "+names[0]);
		System.out.println(" ");
//5 -6
		int[] nameLengths = new int [names.length];
		int i = 0;
		for (String name : names) {
			nameLengths[i] = name.length();
			i++;
		}
		int sum = 0;
		for (int length : nameLengths) {
			//System.out.println(length);
				sum += length;
		}
		System.out.println("The total sum of legnths is: "+sum);
		System.out.println(" ");
//7
		System.out.println(concateWord("hi", 4));
		System.out.println(" ");
//8 
		System.out.println(createFullName("Carmen", "Cena"));
		System.out.println(" ");
//9
		int [] numb = {20, 10, 1, 90, 7};
		System.out.println(arrayOfInt(numb));
		System.out.println(" ");
//10 	 
		double [] numbers = {70, 80, 10, 0.5, 203, 1.5};
		System.out.println(avgOfAllelement(numbers));
		System.out.println(" ");
//12
		boolean hotTemp = true; 
		double money = 10.14;
		System.out.println(willBuyDrink(hotTemp, money));
		System.out.println(" ");
//11
		double[] firstArray = {2,4,6,8,10};
		double[] secondArray = {1,2,3,4,5,6,25};
		System.out.println(compareAverages(firstArray, secondArray));
		System.out.println(" ");
//13
		int number = 27;
		multiplicationTable(number);
	}
	
	
	
	
	
	
//7
	public static String concateWord(String word, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(word);
		} 
		return sb.toString();
	} 
	
//8 
	public static String createFullName(String firstName, String lastName) {
		String fullName = firstName +" "+lastName;
		return fullName;
	}	
//9
	public static boolean arrayOfInt(int[] array) {
		int sum = 0;
		for (int integer : array) {
			
			sum = sum + integer; 
		}
		return sum > 100;		
	}
//10 
	public static double avgOfAllelement(double[] array) {
		double sum = 0;
		for (double numb : array) {
			sum += numb;
		}
		double avg = sum / array.length;
		return avg; 
	}
//11
	public static boolean compareAverages(double[] array1, double[] array2) {
		double sum1 = 0;
		double sum2 = 0;
		for (double num : array1) {
			sum1 += num;
		}
		for (double element : array2) {
			sum2 += element;
		}
		double average1 = sum1 / array1.length; 
		double average2 = sum2 / array2.length;
		
		if (average1 > average2) {
			return true;
		}else {
			return false;
		}
	}
//12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true; 
		} else {
			return false;
		}
		 
	}
	
//13 Method takes in an int and create a multiplication table up to 10. 
// children and people of all ages can learn their multiplication table by inserting any numbers.
	public static void multiplicationTable(int num) {
		for (int i = 0; i <=10; i++) {
			System.out.println(num+"x"+i+"="+(num*i));
		}
	
	}
	
	
	
}
