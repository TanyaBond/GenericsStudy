package Java8;

public class Car {
    @MyAnnotation(value = "manufacturer")
    private final String make;

    @MyAnnotation
    private final String model;

    private final String year;


    public Car(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    Car() {
        this.make = "test";
        this.model = "tt";
        this.year = "1994";
    }

    ;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }
}
