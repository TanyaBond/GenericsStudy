package tasks;

public class Arm implements Organs {

    @Override
    public void amputate() {
        System.out.println("ohohoho amputate Arm");
    }

    public String toString() {
        return "this is Arm";
    }

}
