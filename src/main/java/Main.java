


//import java.util.ArrayList;
//import java.util.List;
//
//class Fruit {
//    @Override
//    public String toString() {
//        return "I am a Fruit !!";
//    }
//}
//
//class Apple extends Fruit {
//    @Override
//    public String toString() {
//        return "I am an Apple !!";
//    }
//}
//
//
//class AsianApple extends Apple {
//    @Override
//    public String toString() {
//        return "I am an AsianApple !!";
//    }
//}
//
//class Orange extends Fruit {
//    @Override
//    public String toString() {
//        return "I am an Orange !!";
//    }
//}

public class Main {

    public static void main(String[] args) {


    }
    }
////1 Exptend))
//        //List of apples
//        List<Apple> apples = new ArrayList<Apple>();
//        apples.add(new Apple());
//
//
//        List<Orange> oranges = new ArrayList<Orange>();
//        oranges.add(new Orange());
//        //We can assign a list of apples to a basket of fruits;
//        //because apple is subtype of fruit
//        List<? extends Fruit> basket = apples;
//
//        //Here we know that in basket there is nothing but fruit only
//        for (Fruit fruit : basket) {
//            System.out.println(fruit);
//        }


        //1 vs 2 without)
        // List<Fruit> basket = apples;


        //3 UPER)

        //We can assign a list of apples to a basket of apples
        //  List<Apple> basket1 = apples;

//        basket1.add(new Apple());      //Successful
//        basket1.add(new AsianApple()); //Successful
//       basket1.add(new Fruit());      //Compile time error

   /*
   * he wildcard declaration of List<? extends Number> foo3 means that any of these are legal assignments:

List<? extends Number> foo3 = new ArrayList<Number>();  // Number "extends" Number (in this context)
List<? extends Number> foo3 = new ArrayList<Integer>(); // Integer extends Number
List<? extends Number> foo3 = new ArrayList<Double>();  // Double extends Number
Reading - Given the above possible assignments, what type of object are you guaranteed to read from List foo3:

You can read a Number because any of the lists that could be assigned to foo3 contain a  Number or a subclass of Number.
You can't read an Integer because foo3 could be pointing at a List<Double>.
You can't read a Double because foo3 could be pointing at a List<Integer>.
Writing - Given the above possible assignments, what type of object could you add to List foo3 that would be legal for all the above possible ArrayList assignments:

You can't add an Integer because foo3 could be pointing at a List<Double>.
You can't add a Double because foo3 could be pointing at a List<Integer>.
You can't add a Number because foo3 could be pointing at a List<Integer>.
You can't add any object to List<? extends T> because you can't guarantee what kind of List it is really pointing to, so you can't guarantee that the object is allowed in that List. The only "guarantee" is that you can only read from it and you'll get a T or subclass of  T.

super
Now consider List <? super T>.

The wildcard declaration of List<? super Integer> foo3 means that any of these are legal assignments:

List<? super Integer> foo3 = new ArrayList<Integer>();  // Integer is a "superclass" of Integer (in this context)
List<? super Integer> foo3 = new ArrayList<Number>();   // Number is a superclass of Integer
List<? super Integer> foo3 = new ArrayList<Object>();   // Object is a superclass of Integer
Reading - Given the above possible assignments, what type of object are you guaranteed to receive when you read from List foo3:

You aren't guaranteed an Integer because foo3 could be pointing at a List<Number> or List<Object>.
You aren't guaranteed a Number because foo3 could be pointing at a List<Object>.
The only guarantee is that you will get an instance of an Object or subclass of Object (but you don't know what subclass).
Writing - Given the above possible assignments, what type of object could you add to List foo3 that would be legal for all the above possible ArrayList assignments:

You can add an Integer because an Integer is allowed in any of above lists.
You can add an instance of a subclass of Integer because an instance of a subclass of Integer is allowed in any of the above lists.
You can't add a Double because foo3 could be pointing at an ArrayList<Integer>.
You can't add a Number because foo3 could be pointing at an ArrayList<Integer>.
You can't add an Object because foo3 could be pointing at an ArrayList<Integer>.
PECS
Remember PECS: "Producer Extends, Consumer Super".

"Producer Extends" - If you need a List to produce T values (you want to read Ts from the list), you need to declare it with ? extends T, e.g. List<? extends Integer>. But you cannot add to this list.

"Consumer Super" - If you need a List to consume T values (you want to write Ts into the list), you need to declare it with ? super T, e.g. List<? super Integer>. But there are no guarantees what type of object you may read from this list.

If you need to both read from and write to a list, you need to declare it exactly with no wildcards, e.g. List<Integer>.

Example
Note this example from the Java Generics FAQ. Note how the source list src (the producing list) uses extends, and the destination list dest (the consuming list) uses super:

public class Collections {
  public static <T> void copy(List<? super T> dest, List<? extends T> src) {
      for (int i = 0; i < src.size(); i++)
        dest.set(i, src.get(i));
  }
}

   *
   *
   * */

//   List<? extends Apple> basket1 = apples;
//        for (Fruit fruit : basket1) {
//            System.out.println(fruit);
//        }
/////4)
//        List<? extends Apple> bb = null;
//
//
//        //5)
//
//
//    }
//
//    //5)
//    public static <X extends Fruit> void func1(List<Fruit> nn) {
//        System.out.println(nn + " ");
//    }
//
//    public static void func2(List<? extends Fruit> nn) {
//
//    }

