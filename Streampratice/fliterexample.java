package Streampratice;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fliterexample {
    public static void main(String[] args)
    {

        Set<String> s1 =Stream.of("sd","ds","fg","tg").
                filter(s->s.startsWith("s")).collect(Collectors.toSet());
        s1.forEach(System.out::println);
    }
}
