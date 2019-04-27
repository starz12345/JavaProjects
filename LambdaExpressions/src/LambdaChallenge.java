import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaChallenge {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			String myString = "Let's split this into an array";
			String[] parts = myString.split(" ");
			for (String i : parts)
				System.out.println(i);
		};

		runnable.run();
		
		String test = everySecondChar("1234567890");
		System.out.println(test);
		Supplier<String> supplier = () ->("I love Java");
		
		String iLoveJava = supplier.get();
		System.out.println(iLoveJava);
		
		System.out.println("-----------------------------------");
		
		List<String> topNames = Arrays.asList("Amelia", "Olivia", "emily", "Isla", "Ava", "oliver", "Jack", "Charlie", "harry", "Jacob");
		
		topNames
			.stream()
			.map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
			.peek(System.out::println)
			.sorted()
			.collect(Collectors.toList());
		 
		
//		System.out.println(topNames
//				.stream()
//				.map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
//				.filter(s-> s.startsWith("A"))
//				.count());
		
		
		
		 
		
		
		
	}

	public static String everySecondChar(String source) {
		Function<String, String> stringFunc = s -> {
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < source.length(); i++) {
				if (i % 2 == 1)
					builder.append(source.charAt(i));
			}
			return builder.toString();
		};
		return stringFunc.apply(source);

	}
}
