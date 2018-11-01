package Java8;

public class Car {
    private final String make;

    private final String model;

    private final int year;


    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    Car() {
        this.make = "test";
        this.model = "tt";
        this.year = 1994;
    }

    ;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }
}
