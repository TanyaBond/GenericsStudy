package tasks;

//легкое
public class Lung implements Organs {

    @Override
    public void amputate() {
        System.out.println("LUNG. Congrats! You live in Krakow. U dont need it ");
    }

    public String toString() {
        return "this is Lung";
    }


}
