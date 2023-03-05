import java.util.*;
public class FIFO {
   public static void main(String[] args) {
        Deque<String> kolejkaDoKasy = new ArrayDeque<String>();
        kolejkaDoKasy.add("Kamil");
        kolejkaDoKasy.add("Franek");
        kolejkaDoKasy.add("Paula");

        System.out.println(kolejkaDoKasy.toString());

        kolejkaDoKasy.pop();
        System.out.println(kolejkaDoKasy.toString());
    }
    
}
