public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String color;
    private final boolean isElectric;

    
    Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.isElectric = builder.isElectric;
    }

    @Override
    public String toString() {
        return "Car { " +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", isElectric=" + isElectric +
                " }";
    }
}
