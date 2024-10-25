package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterConcept {
	public static void main(String[] arg) {
		
		List<String> lines = Arrays.asList("java", "c", "python"); 
		List<String> result = lines.stream()// convert list to stream  
		                                      .filter(line -> !"c".equals(line)) // we dont like c              
		                                              .collect(Collectors.toList()); // collect the output and convert streams to a List 
		 result.forEach(System.out::println);
	}

}
