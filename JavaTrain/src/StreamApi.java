import java.util.*;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("apple","kjdsfhksjdhfkahfa","banana");
        List<String> sortedFruits=fruits.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println(sortedFruits);



        List<Integer> number=Arrays.asList(1,2,3,4,5);
        int index = Collections.binarySearch(number,3);
        System.out.println(index);

        Comparator<String>comparator=Comparator.comparingInt(String::length);

        Collections.sort(fruits,comparator);
        int indx=Collections.binarySearch(fruits,"apple",comparator);
        System.out.println(indx);
    }
}
