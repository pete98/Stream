package work;


import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //Stream API - collection process
        //collection / group of objects

        // empty stream
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e -> {
            System.out.println(e);
        });

        //2nd way to create a stream
        String names[] = {"Het", "Pranav", "Bharat"};

        Stream<String> stream1 = Stream.of(names);

        stream1.forEach(e->{
            System.out.println(e);
        });

        //builder pattern 3rd way
        Stream<Object> streamBuilder = Stream.builder().build();

        //4 array stream method
        IntStream stream = Arrays.stream(new int[]{1, 2, 3, 4, 5});
        stream.forEach(e->{
            System.out.println(e);
        });

        //Stream API Methods.






    }
}
