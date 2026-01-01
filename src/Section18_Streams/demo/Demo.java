package Section18_Streams.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

        // ---------------------------------------------
        // 1) Stream created from a List + map operation
        // ---------------------------------------------

        List<Integer> integerList = Arrays.asList(3, 4, 5, 10, 7);

        // Creates a Stream from the list
        // map() is an INTERMEDIATE operation:
        // - it transforms each element
        // - it returns a new Stream
        // - it does NOT execute yet (lazy)
        Stream<Integer> stream1 = integerList.stream().map(number -> number * 10);

        // toArray() is a TERMINAL operation:
        // - it triggers the execution of the stream pipeline
        // - after this call, the stream is consumed and cannot be reused
        System.out.println(Arrays.toString(stream1.toArray()));

        // ---------------------------------------------
        // 2) Stream created directly using Stream.of()
        // ---------------------------------------------

        // Creates a Stream without using a collection
        Stream<String> stream2 = Stream.of("Maria", "Alex", "Bob");

        // toArray() is a terminal operation that executes the stream
        System.out.println(Arrays.toString(stream2.toArray()));

        // ---------------------------------------------
        // 3) Infinite Stream using Stream.iterate()
        // ---------------------------------------------

        // Stream.iterate creates an INFINITE stream
        // First argument: initial value (seed)
        // Second argument: function to generate the next value
        Stream<Integer> stream3 = Stream.iterate(0, number -> number + 2);

        // limit() is an INTERMEDIATE operation that restricts the number of elements
        // toArray() is the TERMINAL operation that executes the stream
        System.out.println(Arrays.toString(stream3.limit(10).toArray()));

        // ---------------------------------------------
        // 4) Infinite Stream - Fibonacci sequence
        // ---------------------------------------------

        // Each element of the stream is a Long[] representing:
        // { previousValue, currentValue }
        Stream<Long> fibonacci = Stream.iterate(
                new Long[] {0L, 1L}, // initial pair
                p -> new Long[] {p[1], p[0]+p[1]}) // next pair
                // map() transforms Stream<Long[]> into Stream<Long>
                // by extracting the first element of the array
                .map(p -> p[0]);

        // limit() prevents infinite execution
        // toArray() triggers the execution
        System.out.println(Arrays.toString(fibonacci.limit(15).toArray()));

    }
}
