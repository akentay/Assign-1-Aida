public class Builder {
    String brand;
    String model;
    int year;
    String color;
    boolean isElectric;

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

    // Метод build() создаёт объект Car
    public Car build() {
        return new Car(this);
    }
}
