import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {

        int [] arr = IntStream.range(0, 100).filter(it -> it % 2 == 0).toArray();
        System.out.println(Arrays.toString(arr));

    }

    private static void test() {
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");



    }
}