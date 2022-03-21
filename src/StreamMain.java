import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(
                1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Stream<Integer> stream = numbersList.stream();
        stream.filter(x -> x > 0 && x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .map(x -> x + " ")
                .forEach(System.out::print);
    }
}
