// 1) Reference to a Static Method


// // Example 1  In the following example, we have defined a functional interface 
// and referring a static method to it's functional method say().

// interface Sayable{  
//     void say();  
// }  
// public class MethodReference {  
//     public static void saySomething(){  
//         System.out.println("Hello, this is static method.");  
//     }  
//     public static void main(String[] args) {  
//         // Referring static method  
//         Sayable sayable = MethodReference::saySomething;  
//         // Calling interface method  
//         sayable.say();  
//     }  
// }  





// Example 2 In the following example, we are using predefined functional
//  interface Runnable to refer static method.

// public class MethodReference {  
//     public static void ThreadStatus(){  
//         System.out.println("Thread is running...");  
//     }  
//     public static void main(String[] args) {  
//         Thread t2=new Thread(MethodReference::ThreadStatus);  
//         t2.start();       
//     }  
// }  







// Example 3 You can also use predefined functional interface to refer methods. In the following example,
//  we are using BiFunction interface and using it's apply() method.

// import java.util.function.BiFunction;  
// class Arithmetic{  
//     public static int add(int a, int b){  
//         return a+b;  
//     }  
// }  
// public class MethodReference {  
//     public static void main(String[] args) {  
//         BiFunction<Integer, Integer, Integer>adder = Arithmetic::add;  
//         int result = adder.apply(10, 20);  
//         System.out.println(result);  
//     }  
// }  







// Example 4 You can also override static methods by referring methods. In the following example, 
// we have defined and overloaded three add methods.



import java.util.function.BiFunction;  
class Arithmetic{  
    public static int add(int a, int b){  
        return a+b;  
    }  
    public static float add(int a, float b){  
        return a+b;  
    }  
    public static float add(float a, float b){  
        return a+b;  
    }  
}  
public class MethodReference {  
    public static void main(String[] args) {  
        BiFunction<Integer, Integer, Integer>adder1 = Arithmetic::add;  
        BiFunction<Integer, Float, Float>adder2 = Arithmetic::add;  
        BiFunction<Float, Float, Float>adder3 = Arithmetic::add;  
        int result1 = adder1.apply(10, 20);  
        float result2 = adder2.apply(10, 20.0f);  
        float result3 = adder3.apply(10.0f, 20.0f);  
        System.out.println(result1);  
        System.out.println(result2);  
        System.out.println(result3);  
    }  
}  







