package Java8;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}

/**
 * https://www.geeksforgeeks.org/functional-interfaces-java/
 */