package Java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class task5 {

    public static void main(String[] args) {

        Car audi = new Car("audi", "eee", 1998);
        Car audi2 = new Car("audi", "ttt", 1998);
        Car audi3 = new Car("audi", "www", 1999);
        Car audi4 = new Car("audi", "rrrr", 2001);
        Car bmw = new Car("bmw", "eee", 2002);
        Car bmw2 = new Car("bmw", "777", 2300);
        Car bmw3 = new Car("bmw", "55", 3456);
        Car bmw4 = new Car("bmw", "4444", 1234);
        Car car = new Car("Ford", "F150", 2018);

//        JsonSerializer serializer = new JsonSerializer();
//        serializer.serialize(car);

        List<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(audi);
        cars.add(bmw);
        cars.add(bmw2);
        cars.add(bmw3);
        cars.add(bmw4);
        cars.add(audi2);
        cars.add(audi3);
        cars.add(audi4);


//        long bmw1 = cars.stream()
//                .filter(c -> c.getMake().equals("bmw"))
//                .count();
//
//        long countOfBmw = cars.stream()
//                .map(Car::getMake)
//                .filter(maker -> maker.equals("bmw"))
//                .count();
        //autovalue


        //Написать мапу макер количество
        //ауди 4 шт бмв 5 штк

        HashMap<String, Integer> oldStyle = new HashMap<>();
//initialize
        for (int j = 0; j < cars.size(); j++) {
            oldStyle.put(cars.get(j).getMake(), 0);
        }
//set value
        for (int i = 0; i < cars.size(); i++) {
            oldStyle.put(cars.get(i).getMake(), oldStyle.get(cars.get(i).getMake()) + 1);
        }
//print
        for (String model : oldStyle.keySet()) {
            System.out.println(model + " : " + oldStyle.get(model));
        }

///WOOOOWWWWW
        cars
                .stream()
                .collect(
                        groupingBy(o -> o.getMake(), Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println(cars
                .stream()
                .filter(p -> p.getMake().equals("audi"))
                .mapToInt(Car::getYear)
                .average()
                .getAsDouble());

    }


}
