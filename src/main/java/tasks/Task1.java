package tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task1 {
    //использовать java4 без дженериков второй вараиант с дженериками
    // написать холодильник для хранения и доставания легких
    // с использованием джериков и прикольчиков и без


    //java 8
    //outofMemory metaspace
    //gb in java8


    //java util function что это такое и ограаничение в чем различие между обычным интерфейсоми как связано с лямбдой
    //create myAnnotation
    //Retention
    // когда использовать анонимный класс а когда лямбды
    // лябмда ограничение
    //
    /*
    Stream API
    Lazy vs Iager
    * Terminal operations
    * Map or FlapMap
    * stream
    * stream vs for
    * нужны ли еще for
    * когда прикольно использовать и для чего
    *
    * effective java
    * orracle documentation
    *
    * vencat java 8 video with him
    *
    *
    * */

    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
    }


}
