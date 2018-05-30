package JAVA_8_Optional_APIs;

import java.util.Optional;

public class Java8OptionalTest {

    public static void main(String[] args){
        Integer value1 = null;
        Integer value2 = new Integer(10);

        Optional<Integer> a = Optional.ofNullable(value1);

        Optional<Integer> b = Optional.of(value2);

        Integer sum = sum(a, b);
        System.out.println(sum);
    }

    private static Integer sum(Optional<Integer> a, Optional<Integer> b) {
        System.out.println("Fist Parameter is present : " + a.isPresent());
        System.out.println("Second Parameter is present : " + b.isPresent());
        Integer value3 = a.orElse(new Integer(0));
        Integer value4 = b.get();
        return value3 + value4;
    }

}
