package Java8;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}