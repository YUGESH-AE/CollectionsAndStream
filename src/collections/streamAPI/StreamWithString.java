package collections.streamAPI;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamWithString {
    public static void main(String[] args) {

        String[]names={"Adam","Daniel","Martha","Kevin","Ben","Joe","Brad","Susan"};
        Stream.of(names).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
