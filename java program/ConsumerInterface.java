
// Example 1




// import java.util.function.Consumer;  
// public class ConsumerInterface {  
//     static void printMessage(String name){  
//         System.out.println("Hello "+name);  
//     }  
//     static void printValue(int val){  
//         System.out.println(val);  
//     }  
//     public static void main(String[] args) {  
//         // Referring method to String type Consumer interface   
//         Consumer<String> consumer1 = ConsumerInterface::printMessage;  
//         consumer1.accept("John");   // Calling Consumer method  
//         // Referring method to Integer type Consumer interface  
//         Consumer<Integer> consumer2 = ConsumerInterface::printValue;  
//         consumer2.accept(12);   // Calling Consumer method  
//     }  
// }  




// //  Note:

// // Functional Interface is denoted by '::'







//  Example 2




import java.util.ArrayList;  
import java.util.List;  
import java.util.function.Consumer;  
public class ConsumerInterface {  
    static void addList(List<Integer> list){  
        // Return sum of list values  
        int result = list.stream()  
                   .mapToInt(Integer::intValue)  
                   .sum();  
        System.out.println("Sum of list values: "+result);  
    }  
    public static void main(String[] args) {  
        // Creating a list and adding values  
                List<Integer> list = new ArrayList<Integer>();  
                list.add(10);  
                list.add(20);  
                list.add(30);  
                list.add(40);  
        // Referring method to String type Consumer interface   
        Consumer<List<Integer>> consumer = ConsumerInterface::addList;  
        consumer.accept(list);  // Calling Consumer method  
          
    }  
}  