package tasks;

public class Eye implements Organs {
    private String colorEyes = "RED";

    @Override
    public void amputate() {
        System.out.println("EYE. You are pirate right now! ;)");
    }

    public String toString() {
        return "this is Eye";
    }

    public void changeColor(String newColor) {
        this.colorEyes = newColor;
    }

}
