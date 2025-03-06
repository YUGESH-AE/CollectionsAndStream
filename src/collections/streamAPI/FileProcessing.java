package collections.streamAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileProcessing {
    public static void main(String[] args) {

        String path="src/collections/streamAPI/names";
        try {

            Stream<String> names=Files.lines(Paths.get(path));
            names.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
