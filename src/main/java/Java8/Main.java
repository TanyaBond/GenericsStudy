package Java8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws JsonSerializeException {

        Car audi = new Car("audi", "eee", "1222");
        System.out.println(audi.toString());

        Car audi2 = new Car("audi2", "ttt", "555");
        System.out.println(audi.toString());
        Car audi3 = new Car("audi3", "www", "666");
        System.out.println(audi.toString());
        Car audi4 = new Car("audi4", "rrrr", "7777");
        System.out.println(audi.toString());


        Car bmw = new Car("bmw", "eee", "1222");
        System.out.println(bmw.toString());

        Car bmw2 = new Car("bmw", "777", "1222");
        System.out.println(bmw.toString());

        Car bmw3 = new Car("bmw", "55", "666");
        System.out.println(bmw.toString());

        Car bmw4 = new Car("bmw", "4444", "2333");
        System.out.println(bmw.toString());

        Car car = new Car("Ford", "F150", "2018");
        JsonSerializer serializer = new JsonSerializer();
        serializer.serialize(car);
        System.out.println(car.getMake());

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


        long bmw1 = cars.stream()
                .filter(c -> c.getMake().equals("bmw"))
                .count();

        long countOfBmw = cars.stream()
                .map(Car::getMake)
                .filter(maker -> maker.equals("bmw"))
                .count();
        //autovalue


        //Написата мапу макер количество
        //ауди 4 шт бмв 5 штк


    }
}
