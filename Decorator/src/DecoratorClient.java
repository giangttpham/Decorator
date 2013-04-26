import java.util.ArrayList;


public class DecoratorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		ImmutableArrayList immutableNumbers = new ImmutableArrayList(numbers);
		
		System.out.println(immutableNumbers.size());
		
		

	}

}
