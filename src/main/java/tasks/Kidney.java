package tasks;

//почка
public class Kidney implements Organs {

    @Override
    public void amputate() {
        System.out.println("Good! I have new ipad ;)");
    }

    public String toString() {
        return "this is Kidney";
    }

}
