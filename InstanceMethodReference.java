
// // // Example 1  In the following example, we are referring non-static methods. You can refer methods by class 
// // // object and anonymous object.


interface Sayable{  
    void say();  
}  
public class InstanceMethodReference {  
    public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
    }  
    public static void main(String[] args) {  
        InstanceMethodReference methodReference = new InstanceMethodReference(); // Creating object  
        // Referring non-static method using reference  
            Sayable sayable = methodReference::saySomething;  
        // Calling interface method  
            sayable.say();  
            // Referring non-static method using anonymous object  
            Sayable sayable2 = new InstanceMethodReference()::saySomething; // You can use anonymous object also  
            // Calling interface method  
            sayable2.say();  
    }  
}  







// // Example 2 In the following example, we are referring instance (non-static) method. Runnable 
// // interface contains only one abstract method. So, we can use it as functional interface.


// // public class InstanceMethodReference {  
// //     public void printnMsg(){  
// //         System.out.println("Hello, this is instance method");  
// //     }  
// //     public static void main(String[] args) {  
// //     Thread t2=new Thread(new InstanceMethodReference()::printnMsg);  
// //         t2.start();       
// //     }  
// // }  







// // Example 3 In the following example, we are using BiFunction interface. It is a predefined interface
// //  and contains a functional method apply(). Here, we are referring add method to apply method.


// // import java.util.function.BiFunction;  
// // class Arithmetic{  
// //     public int add(int a, int b){  
// //         return a+b;  
// //     }  
// // }  
// // public class InstanceMethodReference {  
// //     public static void main(String[] args) {  
// //         BiFunction<Integer, Integer, Integer>adder = new Arithmetic()::add;  
// //         int result = adder.apply(10, 20);  
// //         System.out.println(result);  
// //     }  
// }  



