package Java8;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Task1 {
    public static void main(String[] args) {
        List<String> names = asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        System.out.println(names);


        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123

        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");

//https://habr.com/post/216431/

        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");


        stringCollection
                .stream()
                .sorted()
                .filter((s) -> s.contains("a"))
                .forEach(System.out::println);


        stringCollection
                .stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);

        stringCollection
                .stream();

        boolean anyStartsWithA =
                stringCollection
                        .stream()
                        .anyMatch((s) -> s.startsWith("a"));

        System.out.println(anyStartsWithA);      // true

        boolean allStartsWithA =
                stringCollection
                        .stream()
                        .allMatch((s) -> s.startsWith("a"));

        System.out.println(allStartsWithA);      // false

        boolean noneStartsWithZ =
                stringCollection
                        .stream()
                        .noneMatch((s) -> s.startsWith("z"));

        System.out.println(noneStartsWithZ);

        long startsWithB =
                stringCollection
                        .stream()
                        .filter((s) -> s.startsWith("b"))
                        .count();

        System.out.println(startsWithB);    // 3


        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        long t0 = System.nanoTime();

        long count = values.stream().sorted().count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("sequential sort took: %d ms", millis));


        long t01 = System.nanoTime();

        long count1 = values.parallelStream().sorted().count();
        System.out.println(count);

        long t11 = System.nanoTime();

        long millis1 = TimeUnit.NANOSECONDS.toMillis(t11 - t01);
        System.out.println(String.format("parallel sort took: %d ms", millis1));


        System.out.println(ZoneId.getAvailableZoneIds());
// prints all available timezone ids

        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Brazil/East");

        System.out.println(zone1.getRules());
        System.out.println(zone2.getRules());

        LocalTime now1 = LocalTime.now(zone1);
        LocalTime now2 = LocalTime.now(zone2);

        System.out.println(now1.isBefore(now2));  // false

        long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
        long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);

        System.out.println(hoursBetween);       // -3
        System.out.println(minutesBetween);     // -239


        // stream vs for

/*
        Streams are a more declarative style. Or a more expressive style. It may be considered better to declare your
        intent in code, than to describe how it's done:

        return people
                .filter( p -> p.age() < 19)
                .collect(toList());
... says quite clearly that you're filtering matching elements from a list, whereas:

        List<Person> filtered = new ArrayList<>();
        for(Person p : people) {
            if(p.age() < 19) {
                filtered.add(p);
            }
        }
        return filtered;
        Says "I'm doing a loop". The purpose of the loop is buried deeper in the logic.

        Streams are often terser. The same example shows this. Terser isn't always better, but if you can be terse and
        expressive at the same time, so much the better.

        Streams have a strong affinity with functions. Java 8 introduces lambdas and functional interfaces, which opens
         a whole toybox of powerful techniques. Streams provide the most convenient and natural way to apply functions
         to sequences of objects.

                Streams encourage less mutability. This is sort of related to the functional programming aspect
                -- the kind of programs you write using streams tend to be the kind of programs where you don't modify objects.

        Streams encourage looser coupling. Your stream-handling code doesn't need to know the source of the stream,
         or its eventual terminating method.

        Streams can succinctly express quite sophisticated behaviour. For example:

        stream.filter(myfilter).findFirst();
        Might look at first glance as if it filters the whole stream, then returns the first element.
        But in fact findFirst() drives the whole operation, so it efficiently stops after finding one item.

                Streams provide scope for future efficiency gains. Some people have benchmarked and
                found that single-threaded streams from in-memory Lists or arrays can be slower than the equivalent loop.
                 This is plausible because there are more objects and overheads in play.

        But streams scale. As well as Java's built-in support for parallel stream operations,
         there are a few libraries for distributed map-reduce using Streams as the API, because the model fits.

        Disadvantages?

                Performance: A for loop through an array is extremely lightweight both in terms of heap and CPU usage.
                 If raw speed and memory thriftiness is a priority, using a stream is worse.

        Familiarity.The world is full of experienced procedural programmers, from many language backgrounds,
        for whom loops are familiar and streams are novel. In some environments, you want to write code that's
        familiar to that kind of person.

        Cognitive overhead. Because of its declarative nature, and increased abstraction from what's
        happening underneath, you may need to build a new mental model of how code relates to execution.
         Actually you only need to do this when things go wrong, or if you need to deeply analyse performance
         or subtle bugs. When it "just works", it just works.

        Debuggers are improving, but even now, when you're stepping through stream code in a debugger,
        it can be harder work than the equivalent loop, because a simple loop is very close to the variables
        and code locations that a traditional debugger works with.


*/


// flapmap vs map
//
        List<String> myList = Stream.of("a", "b")
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(asList("A", "B").equals(myList));


        //Function ограаничения где использовать ?
        //method reference как работает зачем
        //terminal operations
        //когда хорошо и плохо работает parallel stream
        // map vs reduce
        //

        //options vs guava optional
        //lyamda во что компилируется invoke dynamic
        //
    }
}
