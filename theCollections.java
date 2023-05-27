import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class theCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this creates an Array list of integer;
		
		//List;
		List<Integer> number =  new ArrayList<Integer>();
		
		//adding values into the Arraylist.
		number.add(23);
		number.add(15);
		number.add(90);
		number.add(null);
		number.add(12);
		number.add(1);
		//prints out the size of the arrayList;
		System.out.println(number.size());
		//for loops that prints out every list in the array.
		for (Integer numbs : number) {
			System.out.println(numbs);
		}
		System.out.println(" ");
		System.out.println(number.get(4));
		
		System.out.println(" ");
		
		//Set;
		Set<String> city = new HashSet<String>();
		city.add("Madrid");
		city.add("New York");
		city.add("Ibiza");
		city.add(null);
		
		for (String ville : city) {
			System.out.println(ville);
		}
		System.out.println(" ");
		System.out.println(city.size());
		
		System.out.println(" ");
		if (city.contains("Ibiza")) {
			System.out.println("Ibiza");
		}
		System.out.println(" ");
		
		//Map;
		Map <Integer, String> placement = new HashMap <Integer, String>();
		placement.put(1, "Minato");
		placement.put(2, "Sasuke");
		placement.put(3, "Gara");
		placement.put(4, "Madara");
		placement.put(5, "Kakashi");
		//this command for the Map returns the corresponding value to such Key.
		System.out.println(placement.get(3));
		
		System.out.println(" ");
		//this logic is for when we want get the keyset + corresponding value;
		Set <Integer> theKeys = placement.keySet();
		
		for (Integer key : theKeys) {
			System.out.println(key+ " "+placement.get(key));
		}
		System.out.println(" ");
		//This command is to get the collection of values.
		Collection <String> theValue = placement.values();
		for (String value : theValue) {
			System.out.println(value);
		}
		
	}
	

}
