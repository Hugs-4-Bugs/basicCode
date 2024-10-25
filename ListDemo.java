import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class ListDemo {
    public static void main(String args[]){
    List list1 = new ArrayList();
    List<String> list2 = new ArrayList();

    list1.add("some string");
    list2.add("1");
    
    Object object = list1.get(1);
    System.out.println(object);
    list2.add("some string");
    String string = list2.get(0);
    System.out.println(string);
    list2 = new LinkedList<>();
    list2.add("another string");
    System.out.println(list2.get(0));

    List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3));
    System.out.println(list3.get(1));
    System.out.println(list3);
    for(int i : list3){
        System.out.println(i);
    }
    list3.clear();
    System.out.println(list3);
    }
}
