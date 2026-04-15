import java.util.*;
public class LLtwo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.addFirst(0);
        list.addLast(6);
        list.add(3, 3);
        System.out.println(list);
    }
    
}
