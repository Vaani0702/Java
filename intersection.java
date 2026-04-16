import java.util.*;
public class intersection {
    public static void main(String[] args) {
        int[] arr = new int[6];
        int[] arr2 = new int[4];
        Scanner sc = new Scanner(System.in);

        for(int i =0; i<6; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<4; i++){
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for(int x : arr){
            set.add(x);
        }
        
        for(int x : arr2){
            if(set.contains(x)){
                System.out.print(x + " ");
                set.remove(x); 
            }
        }
    
    }
} 





