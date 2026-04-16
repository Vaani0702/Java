import java.util.*;
public class hashsetthree {
    public static void main(String[] args) {
        String[] var1 = new String[]{"Apple", "Banana", "Cherry", "Apple","vaani", "trisha"};
        LinkedHashSet<String> var2 = new LinkedHashSet<>();
        for(String var6 : var1) {
            var2.add(var6);
         }
   
         System.out.println(var2);
    }
}
