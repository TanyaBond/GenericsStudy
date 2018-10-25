import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyArrayList<Integer> list = new MyArrayList<>();
//        list.add(1);

        List<Integer> intList = newArrayList();
        List<Integer> objects = Main.<Integer>newArrayList();
        intList.add(1);

        Object first = intList.get(0);


    }

    private static <T> List<T> newArrayList() {
        return new ArrayList<T>();
    }

}
