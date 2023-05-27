
public class StrinandStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder name = new StringBuilder("Patrick");
		name.append(" Stewart");
		
		System.out.println(name.toString());

		System.out.println(name.charAt(8));
		System.out.println(name.indexOf("wa"));
		//System.out.println(name.delete(1, 7));
		//System.out.println(name.reverse());
		System.out.println(name.replace(8, 15, "Cena"));
		
		String threeTimesTheString = multiplyStringByIntTime (" Morning", 5);
		System.out.println(threeTimesTheString);
		
	}

	public static String multiplyStringByIntTime (String x, int numb) {
		StringBuilder result = new StringBuilder ();
		for (int i = 0; i < numb; i++) {
			result.append(x);
		} return result.toString();
	}
}
