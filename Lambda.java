import java.util.List;


// Example 1 Without Lambda Expression


// interface Drawable{  
//     public void draw();  
// }  
// public class Lambda {  
//     public static void main(String[] args) {  
//         int width=10;  
  
//         //without lambda, Drawable implementation using anonymous class  
//         Drawable d=new Drawable(){  
//             public void draw(){System.out.println("Drawing "+width);}  
//         };  
//         d.draw();  
//     }  
// }  







// Example 2 Java Lambda Expression Example


// @FunctionalInterface  //It is optional  
// interface Drawable{  
//     public void draw();  
// }  
  
// public class Lambda {  
//     public static void main(String[] args) {  
//         int width=10;  
          
//         //with lambda  
//         Drawable d2=()->{  
//             System.out.println("Drawing "+width);  
//         };  
//         d2.draw();  
//     }  
// }  

// import java.util.ArrayList;
// public class Lambda {
//     public static void main(String args[]){
//         List<String> list = new ArrayList<String>();
//         list.add("Ankit");
//         list.add("Suresh");
//         list.add("Srinivas");
//         list.add("Vijay");

//         list.forEach(
//             (n)->System.out.println(n)
//         );
//     }
    
// }







// Example 3  Java Lambda Expression Example: No Parameter


// interface Sayable{  
//     public String say();  
// }  
// public class Lambda{  
// public static void main(String[] args) {  
//     Sayable s=()->{  
//         return "I have nothing to say.";  
//     };  
//     System.out.println(s.say());  
// }  
// }  







// Example 4 Java Lambda Expression Example: Single Parameter


// interface Sayable{  
//     public String say(String name);  
// }  
  
// public class Lambda{  
//     public static void main(String[] args) {  
      
//         // Lambda expression with single parameter.  
//         Sayable s1=(name)->{  
//             return "Hello, "+name;  
//         };  
//         System.out.println(s1.say("Sonoo"));  
          
//         // You can omit function parentheses    
//         Sayable s2= name ->{  
//             return "Hello, "+name;  
//         };  
//         System.out.println(s2.say("Sonoo"));  
//     }  
// }  








// Example 5 Java Lambda Expression Example: Multiple Parameters


// interface Addable{  
//     int add(int a,int b);  
// }  
  
// public class Lambda{  
//     public static void main(String[] args) {  
          
//         // Multiple parameters in lambda expression  
//         Addable ad1=(a,b)->(a+b);  
//         System.out.println(ad1.add(10,20));  
          
//         // Multiple parameters with data type in lambda expression  
//         Addable ad2=(int a,int b)->(a+b);  
//         System.out.println(ad2.add(100,200));  
//     }  
// }  








// Example 6 Java Lambda Expression Example: with or without return keyword



// interface Addable{  
//     int add(int a,int b);  
// }  
  
// public class Lambda {  
//     public static void main(String[] args) {  
          
//         // Lambda expression without return keyword.  
//         Addable ad1=(a,b)->(a+b);  
//         System.out.println(ad1.add(10,20));  
          
//         // Lambda expression with return keyword.    
//         Addable ad2=(int a,int b)->{  
//                             return (a+b);   
//                             };  
//         System.out.println(ad2.add(100,200));  
//     }  
// }  






// Example 7 Java Lambda Expression Example: Foreach Loop


// @FunctionalInterface  
// interface Sayable{  
//     String say(String message);  
// }  
  
// public class Lambda{  
//     public static void main(String[] args) {  
      
//         // You can pass multiple statements in lambda expression  
//         Sayable person = (message)-> {  
//             String str1 = "I would like to say, ";  
//             String str2 = str1 + message;   
//             return str2;  
//         };  
//             System.out.println(person.say("time is precious."));  
//     }  
// }  







// Example 8 Java Lambda Expression Example: Multiple Statements


// @FunctionalInterface  
// interface Sayable{  
//     String say(String message);  
// }  
  
// public class Lambda{  
//     public static void main(String[] args) {  
      
//         // You can pass multiple statements in lambda expression  
//         Sayable person = (message)-> {  
//             String str1 = "I would like to say, ";  
//             String str2 = str1 + message;   
//             return str2;  
//         };  
//             System.out.println(person.say("time is precious."));  
//     }  
// }  







// Example 9 Java Lambda Expression Example: Creating Thread


// public class Lambda{  
//     public static void main(String[] args) {  
      
//         //Thread Example without lambda  
//         Runnable r1=new Runnable(){  
//             public void run(){  
//                 System.out.println("Thread1 is running...");  
//             }  
//         };  
//         Thread t1=new Thread(r1);  
//         t1.start();  
//         //Thread Example with lambda  
//         Runnable r2=()->{  
//                 System.out.println("Thread2 is running...");  
//         };  
//         Thread t2=new Thread(r2);  
//         t2.start();  
//     }  
// }  







// Example 10 Java Lambda Expression Example: Comparator


// import java.util.ArrayList;  
// import java.util.Collections;  
// import java.util.List;  
// class Product{  
//     int id;  
//     String name;  
//     float price;  
//     public Product(int id, String name, float price) {  
//         super();  
//         this.id = id;  
//         this.name = name;  
//         this.price = price;  
//     }  
// }  
// public class Lambda{  
//     public static void main(String[] args) {  
//         List<Product> list=new ArrayList<Product>();  
          
//         //Adding Products  
//         list.add(new Product(1,"HP Laptop",25000f));  
//         list.add(new Product(3,"Keyboard",300f));  
//         list.add(new Product(2,"Dell Mouse",150f));  
          
//         System.out.println("Sorting on the basis of name...");  
  
//         // implementing lambda expression  
//         Collections.sort(list,(p1,p2)->{  
//         return p1.name.compareTo(p2.name);  
//         });  
//         for(Product p:list){  
//             System.out.println(p.id+" "+p.name+" "+p.price);  
//         }  
  
//     }  
// }  






// Example 11 Java Lambda Expression Example: Filter Collection Data


import java.util.ArrayList;  
import java.util.List;  
import java.util.stream.Stream;   
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class Lambda{  
    public static void main(String[] args) {  
        List<Product> list=new ArrayList<Product>();  
        list.add(new Product(1,"Samsung A5",17000f));  
        list.add(new Product(3,"Iphone 6S",65000f));  
        list.add(new Product(2,"Sony Xperia",25000f));  
        list.add(new Product(4,"Nokia Lumia",15000f));  
        list.add(new Product(5,"Redmi4 ",26000f));  
        list.add(new Product(6,"Lenevo Vibe",19000f));  
          
        // using lambda to filter data  
        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);  
          
        // using lambda to iterate through collection  
        filtered_data.forEach(  
                product -> System.out.println(product.name+": "+product.price)  
        );  
    }  
}  






// Example 12 Java Lambda Expression Example: Event Listener


// import javax.swing.JButton;  
// import javax.swing.JFrame;  
// import javax.swing.JTextField;  
// public class Lambda {  
//     public static void main(String[] args) {  
//         JTextField tf=new JTextField();  
//         tf.setBounds(50, 50,150,20);  
//         JButton b=new JButton("click");  
//         b.setBounds(80,100,70,30);  
          
//         // lambda expression implementing here.  
//         b.addActionListener(e-> {tf.setText("hello swing");});  
          
//         JFrame f=new JFrame();  
//         f.add(tf);f.add(b);  
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
//         f.setLayout(null);  
//         f.setSize(300, 200);  
//         f.setVisible(true);  
  
//     }  
  
// }  