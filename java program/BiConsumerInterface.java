//  Example 1


// import java.util.function.BiConsumer;  
// public class BiConsumerInterface {  
//     static void ShowDetails(String name, Integer age){  
//         System.out.println(name+" "+age);  
//     }  
//     public static void main(String[] args) {  
//         // Referring method  
//         BiConsumer<String, Integer> biCon = BiConsumerInterface::ShowDetails;  
//         biCon.accept("Rama", 20);  
//         biCon.accept("Shyam", 25);  
//         // Using lambda expression  
//         BiConsumer<String, Integer> biCon2 = (name, age)->System.out.println(name+" "+age);  
//         biCon2.accept("Peter", 28);  
//     }  
// }  







// Example 2



import java.util.function.BiConsumer;  
import java.util.HashMap;  
import java.util.Map;  
public class BiConsumerInterface {  
    static void ShowDetails(Map<Integer, String> map, String mapName){  
        System.out.println("----------"+mapName+" records-----------");  
        map.forEach((key, val)->System.out.println(key+" "+val));  
    }  
    public static void main(String[] args) {  
        Map<Integer, String> map = new HashMap<Integer,String>();  
        map.put(100, "Mohan");  
        map.put(110, "Sujeet");  
        map.put(115, "Tom");  
        map.put(120, "Danish");  
        // Referring method  
        BiConsumer<Map<Integer, String>, String> biCon = BiConsumerInterface::ShowDetails;  
        biCon.accept(map, "Student");  
    }  
}  