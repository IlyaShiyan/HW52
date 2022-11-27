import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {

        Deque<Capital> arrayOfCapital = new ArrayDeque<>();
        Capital name1 = new Capital("Minsk");
        Capital name2 = new Capital("Moscow");
        Capital name3 = new Capital("Paris");
        Capital name4 = new Capital("Berlin");
        Capital name5 = new Capital("Tbilisi");

        arrayOfCapital.addFirst(name1);
        arrayOfCapital.addFirst(name2);
        arrayOfCapital.addLast(name3);
        arrayOfCapital.addFirst(name4);
        arrayOfCapital.addLast(name5);

        System.out.println(arrayOfCapital.getFirst());
        System.out.println(arrayOfCapital.getLast());
        System.out.println(arrayOfCapital.size());
    }
}
