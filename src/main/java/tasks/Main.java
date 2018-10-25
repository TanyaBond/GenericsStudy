package tasks;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Container<Organs> bucket = new Container<>(new ArrayList<>());
        bucket.addElement(new Lung());
        bucket.addElement(new Arm());
        bucket.addElement(new Eye());


        for (Organs elem : bucket) {
            elem.amputate();
        }

        List<Eye> eyes = new ArrayList<>();
        eyes.add(new Eye());
        eyes.add(new Eye());
        eyes.add(new Eye());

        // bucket.addElements(eyes);// dont compile xD


        Container<? extends Organs> bucket1 = new Container<Eye>(eyes);
        System.out.println("----------");
        bucket1.getElement(1).amputate();

        // Eye eye = (Eye) bucket.getElement(2);


        Container<? super Arm> bucket2 = new Container<>(new ArrayList<>());
        bucket2.addElement(new Arm());

        System.out.println(bucket2.getElement(0).toString());


        OldStyle bucket3 = new OldStyle(new ArrayList<>());
        bucket3.addElement(new Lung());
        bucket3.addElement(new Arm());
        bucket3.addElement(new Eye());

       Organs arm =  (Organs) bucket3.getElement(1);


    }


}



