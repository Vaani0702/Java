import java.util.*;

public class hashsettwo {
    public static void main(String[] args) {
        String[] arr = {"Apple", "Banana", "Cherry", "Apple"};
        HashSet<String> st = new HashSet<>();
        for(String s:arr){
            st.add(s);
        }
        System.out.println(st);
    }
    
}
