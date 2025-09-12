public class Main {
    public static void main(String[] args) {
        Car tesla = new Car.Builder()
                .brand("Tesla")
                .model("Model S")
                .year(2025)
                .color("White")
                .isElectric(true)
                .build();

        Car bmw = new Car.Builder()
                .brand("BMW")
                .model("X5")
                .year(2023)
                .color("Black")
                .isElectric(false)
                .build();

        System.out.println(tesla);
        System.out.println(bmw);
    }
}

class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String color;
    private final boolean isElectric;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.isElectric = builder.isElectric;
    }

    @Override
    public String toString() {
        return String.format(
            "Car: %s %s (%d), Color: %s, Electric: %b",
            brand, model, year, color, isElectric
        );
    }

    public static class Builder {
        private String brand;
        private String model;
        private int year;
        private String color;
        private boolean isElectric;

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder isElectric(boolean isElectric) {
            this.isElectric = isElectric;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
