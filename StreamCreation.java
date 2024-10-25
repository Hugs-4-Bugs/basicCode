package StreamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String args[]) {
//	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//	Stream<Integer> streamFromCollection = numbers.stream();

//	System.out.println(numbers);
//	
//	String[] array = {"apple", "banana", "orange"};
//	Stream<String> streamFromArray = Arrays.stream(array);
//	
////	streamFromArray.forEachOrdered(System.out::println);
//	System.out.println(array.toString());
//	
//	Stream<String> stream = Stream.of("apple", "banana", "orange");
//	stream.peek(System.out::println).count(); // terminal operation to trigger intermediate operations

//	1. **From a Collection:**
//
//	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//	Stream<Integer> streamFromCollection = numbers.stream();
//
//

//	2. **From an Array:**
//
//	String[] array = {"apple", "banana", "orange"};
//	Stream<String> streamFromArray = Arrays.stream(array);
//

//
//	3. **Using Stream.of() for Individual Elements:**
//
//	By using Stream.of() we can print all element (array, int etc..)

//	Stream<String> streamOfElements = Stream.of("apple", "banana", "orange");
//
//

//	4. **Generating Streams with Stream.generate():**

		/*
		 * The Stream.generate() method in Java returns an infinite sequential unordered
		 * stream where each element is generated by the provided Supplier. This method
		 * is useful for generating constant streams, streams of random elements, and
		 * more.
		 * 
		 * The syntax for Stream generate() is: static <T> Stream<T>
		 * generate(Supplier<T> s) Use code with caution. Learn more Stream is an
		 * interface T is the type of stream elements s is the Supplier of generated
		 * elements The return value is a new infinite sequential unordered Stream
		 */
//
//		Stream<String> generatedStream = Stream.generate(() -> "Hello");
//
//

//	5. **Iterating with Stream.iterate():**
//
//	Stream<Integer> iteratedStream = Stream.iterate(0, n -> n + 2).limit(5);
//

//
//	6. **From a Range of Values:**
//		It will print all value in range : n to n-1.
//
//	IntStream rangeStream = IntStream.range(1, 6);
//

//
//	7. **From a Range of Values (Inclusive):**
//
//	IntStream rangeClosedStream = IntStream.rangeClosed(1, 5);
//
//

//	8. **Creating an Empty Stream:**
//		An empty Stream is useful to handle NullPointerExceptions.
////
//	Stream<Object> emptyStream = Stream.empty();
//
//	emptyStream.forEachOrdered(System.out::println);
		

// First convert Stream to collection then iterate it 	
		Stream<String> stream = Stream.of("apple", "banana", "orange");
		Map<Object, Object> collect = stream.collect(Collectors.toMap(null, null));
//		List<String> list = stream.collect(Collectors.toList());  
//		Iterator<String> iterator = list.iterator();  // for List
		Iterator<Object> iterator = collect.keySet().iterator(); // for Map
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

	}
}