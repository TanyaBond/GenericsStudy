package Java8;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}

/**
 * https://www.geeksforgeeks.org/functional-interfaces-java/
 *
 *
 *
 * A functional interface is an interface that contains only one abstract method. They can have only
 * one functionality to exhibit. From Java 8 onwards, lambda expressions can be used to represent the instance
 * of a functional interface. A functional interface can have any number of default methods.
 * Runnable, ActionListener, Comparable are some of the examples of functional interfaces.
 * Before Java 8, we had to create anonymous inner class objects or implement these interfaces.


 class Test
 {
 public static void main(String args[])
 {
 // create anonymous inner class object
 new Thread(new Runnable()
 {
 @Override public void run()
 {
 System.out.println("New thread created");
 }
 }).start();
 }
 }




 // Java program to demonstrate functional interface

 class Test
 {
 public static void main(String args[])
 {
 // create anonymous inner class object
 new Thread(new Runnable()
 {
 @Override public void run()
 {
 System.out.println("New thread created");
 }
 }).start();
 }
 }
 Copy CodeRun on IDE

 Output:

 New thread created
 Java 8 onwards, we can assign lambda expression to its functional interface object like this:

 // Java program to demonstrate Implementation of
 // functional interface using lambda expressions

 class Test
 {
 public static void main(String args[])
 {

 // lambda expression to create the object
 new Thread(()->
 {System.out.println("New thread created");}).start();
 }
 }

 @FunctionalInterface Annotation
 @FunctionalInterface annotation is used to ensure that the functional interface can’t
 have more than one abstract method. In case more than one abstract methods are present,
 the compiler flags an ‘Unexpected @FunctionalInterface annotation’ message.
 However, it is not mandatory to use this annotation





 // Java program to demonstrate lamda expressions to implement
 // a user defined functional interface.

 @FunctionalInterface interface Square
 {
 int calculate(int x);
 }

 class Test
 {
 public static void main(String args[])
 {
 int a = 5;

 // lambda expression to define the calculate method
 Square s = (int x)->x*x;

 // parameter passed and return type must be
 // same as defined in the prototype
 int ans = s.calculate(a);
 System.out.println(ans);
 }
 }
 Copy CodeRun on IDE

 Output:



 25



 java.util.function Package:
 The java.util.function package in Java 8 contains many builtin functional interfaces like-

 Predicate: The Predicate interface has an abstract method test which gives a Boolean value as a result for the specified argument. Its prototype is
 public Predicate
 {
 public boolean test(T  t);
 }
 BinaryOperator: The BinaryOperator interface has an abstract method apply which takes two argument and returns a result of same type. Its prototype is
 public interface BinaryOperator
 {
 public T apply(T x, T y);
 }
 Function: The Function interface has an abstract method apply which takes argument of type T and returns a result of type R. Its prototype is
 public interface Function
 {
 public R apply(T t);
 }
 */