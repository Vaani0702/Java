import java.util.LinkedList;

public class LLfour {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        System.out.println(list);
        list.addFirst(0);
        list.addLast(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(5);
        list.add(3, 3);
        int first= list.indexOf(3);
        int last = list.lastIndexOf(3);
        System.out.println(first);
        System.out.println(last);
}
}