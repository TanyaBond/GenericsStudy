package InvokeDynamic;

public class Lambda {

    public Runnable getRunnable() {
        return () -> System.out.println("I am a Runnable!");
    }

    public static void main(String[] args) {
        new Lambda().getRunnable().run();
    }

}
