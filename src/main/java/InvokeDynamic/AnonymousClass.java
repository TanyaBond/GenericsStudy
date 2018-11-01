package InvokeDynamic;


/***
 * up vote
 * 144
 * down vote
 * accepted
 * It is a new JVM instruction which allows a compiler to generate code which calls methods with a
 * looser specification than was previously possible -- if you know what "duck typing" is,
 * invokedynamic basically allows for duck typing. There's not too much you as a Java programmer can do with it;
 * if you're a tool creator, though, you can use it to build more flexible,
 * more efficient JVM-based languages. Here is a really sweet blog post that gives a lot of detail.
 *
 * duck typing == n computer programming is an application of the duck test—"If it walks like a duck and it quacks like a duck,
 * then it must be a duck"—to determine if an object can be used for a particular purpose
 *
 *
 * The invoke dynamics instraction is used t o help VM determinate the methid reference at runtime
 * instead hardwiring it at compile time.
 */


public class AnonymousClass {



    public Runnable getRunnable() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("I am a Runnable!");
            }
        };
    }

    public static void main(String[] args) {
        new AnonymousClass().getRunnable().run();
    }

}
