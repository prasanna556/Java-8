import java.util.*;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenOddPartitioningExample {
    public static void main(String[] args) throws Exception {
        // given list of integers separate them in even and odd numbers
       List<Integer> list = Arrays.asList(2,4,5,7,89,94,53);
       Map<Boolean,List<Integer>> map = list.stream()
                                            .collect(Collectors.partitioningBy(i -> i % 2 == 0));
        Set<Entry<Boolean,List<Integer>>> entrySet = map.entrySet();

        for (Entry<Boolean,List<Integer>> entry : entrySet) {
            
            if (entry.getKey()) {
                System.out.println("Even numbers");
            }
            else {
                System.out.println("Odd numbers");
            }
            List<Integer> list1 = entry.getValue();
            for (Integer num : list1) {
                System.out.println(num);
            }
        }
    }

}
