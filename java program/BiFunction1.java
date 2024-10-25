// 1. BiFunction<T, U, R> :-takes two Integers and returns an Integer, Double or List


// import java.util.Arrays;
// import java.util.List;
// import java.util.function.BiFunction;

// public class BiFunction1 {

//     public static void main(String[] args) {

//         // takes two Integers and return an Integer
//         BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;

//         Integer result = func.apply(2, 3);

//         System.out.println(result); // 5

//         // take two Integers and return an Double
//         BiFunction<Integer, Integer, Double> func2 = (x1, x2) -> Math.pow(x1, x2);

//         Double result2 = func2.apply(2, 4);

//         System.out.println(result2);    // 16.0

//         // take two Integers and return a List<Integer>
//         BiFunction<Integer, Integer, List<Integer>> func3 = (x1, x2) -> Arrays.asList(x1 + x2);

//         List<Integer> result3 = func3.apply(2, 3);

//         System.out.println(result3);

//     }

// }











// 2. BiFunction<T, U, R> + Function<T, R> :- takes two Integer and returns a Double, and uses andThen() to 
// chain it with a Function to convert the Double into a String.

// import java.util.function.BiFunction;
// import java.util.function.Function;

// public class BiFunction1 {

//     public static void main(String[] args) {

//         // Math.pow(a1, a2) returns Double
//         BiFunction<Integer, Integer, Double> func1 = (a1, a2) -> Math.pow(a1, a2);

//         // takes Double, returns String
//         Function<Double, String> func2 = (input) -> "Result : " + String.valueOf(input);

//         String result = func1.andThen(func2).apply(2, 4);

//         System.out.println(result);

//     }

// }






// This example converts the above program into a method that accepts BiFunction and Function
//  as arguments and chains it together.



// import java.util.function.BiFunction;
// import java.util.function.Function;

// public class BiFunction1 {

//     public static void main(String[] args) {

//         String result = powToString(2, 4,
//                 (a1, a2) -> Math.pow(a1, a2),
//                 (r) -> "Result : " + String.valueOf(r));

//         System.out.println(result); // Result : 16.0

//     }

//     public static <R> R powToString(Integer a1, Integer a2,
//                                     BiFunction<Integer, Integer, Double> func,
//                                     Function<Double, R> func2) {

//         return func.andThen(func2).apply(a1, a2);

//     }

// }






// This example converts the above method into a generic method:


// public static <A1, A2, R1, R2> R2 convert(A1 a1, A2 a2,
//                                           BiFunction<A1, A2, R1> func,
//                                           Function<R1, R2> func2) {

//     return func.andThen(func2).apply(a1, a2);

// }









// A lot of possibilities in this generic method, let see:


// import java.util.function.BiFunction;
// import java.util.function.Function;

// public class BiFunction1 {

//     public static void main(String[] args) {

//         // Take two Integers, pow it into a Double, convert Double into a String.
//         String result = convert(2, 4,
//                 (a1, a2) -> Math.pow(a1, a2),
//                 (r) -> "Pow : " + String.valueOf(r));

//         System.out.println(result);     // Pow : 16.0

//         // Take two Integers, multiply into an Integer, convert Integer into a String.
//         String result2 = convert(2, 4,
//                 (a1, a2) -> a1 * a1,
//                 (r) -> "Multiply : " + String.valueOf(r));

//         System.out.println(result2);    // Multiply : 4

//         // Take two Strings, join both, join "cde"
//         String result3 = convert("a", "b",
//                 (a1, a2) -> a1 + a2,
//                 (r) -> r + "cde");      // abcde

//         System.out.println(result3);

//         // Take two Strings, join both, convert it into an Integer
//         Integer result4 = convert("100", "200",
//                 (a1, a2) -> a1 + a2,
//                 (r) -> Integer.valueOf(r));

//         System.out.println(result4);    // 100200

//     }

//     public static <A1, A2, R1, R2> R2 convert(A1 a1, A2 a2,
//                                               BiFunction<A1, A2, R1> func,
//                                               Function<R1, R2> func2) {

//         return func.andThen(func2).apply(a1, a2);

//     }

// }









// 3. Factory :- uses BiFunction to create an object, acts as a factory pattern.


// import java.util.function.BiFunction;

// public class BiFunction1 {

//     public static void main(String[] args) {

//         GPS obj = factory("40.741895", "-73.989308", GPS::new);
//         System.out.println(obj);

//     }

//     public static <R extends GPS> R factory(String Latitude, String Longitude,
//                                             BiFunction<String, String, R> func) {
//         return func.apply(Latitude, Longitude);
//     }

// }

// class GPS {

//     String Latitude;
//     String Longitude;

//     public GPS(String latitude, String longitude) {
//         Latitude = latitude;
//         Longitude = longitude;
//     }

//     public String getLatitude() {
//         return Latitude;
//     }

//     public void setLatitude(String latitude) {
//         Latitude = latitude;
//     }

//     public String getLongitude() {
//         return Longitude;
//     }

//     public void setLongitude(String longitude) {
//         Longitude = longitude;
//     }

//     @Override
//     public String toString() {
//         return "GPS{" +
//                 "Latitude='" + Latitude + '\'' +
//                 ", Longitude='" + Longitude + '\'' +
//                 '}';
//     }
// }





// The GPS::new calls the following constructor, which accepts two arguments and return an object (GPS), 
// so it matches with the BiFunction signature.


//   public GPS(String latitude, String longitude) {
//         Latitude = latitude;
//         Longitude = longitude;
//     }











// 4. More :- Filtering a List by some conditions.



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunction1 {

    public static void main(String[] args) {

        BiFunction1 obj = new BiFunction1();

        List<String> list = Arrays.asList("node", "c++", "java", "javascript");

        List<String> result = obj.filterList(list, 3, obj::filterByLength);

        System.out.println(result);   // [node, java, javascript]

        List<String> result1 = obj.filterList(list, 3, (l1, size) -> {
            if (l1.length() > size) {
                return l1;
            } else {
                return null;
            }
        });

        System.out.println(result1);  // [node, java, javascript]

        List<String> result2 = obj.filterList(list, "c", (l1, condition) -> {
            if (l1.startsWith(condition)) {
                return l1;
            } else {
                return null;
            }
        });

        System.out.println(result2);  // [c++]

        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result3 = obj.filterList(number, 2, (l1, condition) -> {
            if (l1 % condition == 0) {
                return l1;
            } else {
                return null;
            }
        });

        System.out.println(result3);  // [2, 4]

    }

    public String filterByLength(String str, Integer size) {
        if (str.length() > size) {
            return str;
        } else {
            return null;
        }
    }

    public <T, U, R> List<R> filterList(List<T> list1, U condition,
                                        BiFunction<T, U, R> func) {

        List<R> result = new ArrayList<>();

        for (T t : list1) {
            R apply = func.apply(t, condition);
            if (apply != null) {
                result.add(apply);
            }
        }

        return result;

    }

}

