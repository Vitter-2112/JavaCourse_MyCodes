import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

    LinkedList<String> list=new LinkedList<>();
        list.add("Petr");
        list.add("Anna");
        list.add("Maria");
        list.add("Ivan");
        list.add("Anna");
        list.add("Petr");
        list.add("Filip");
        list.add("Anna");
        list.add("George");

        //System.out.println(list);
        Set<String> set= new HashSet<>();

        set.addAll(list);// Set allows no duplicates, consequently they will be eliminated by adding them to a set
        System.out.println(set);

} }
