public class Main {
    public static void main(String[] args) {
        Car tesla = new Builder()
                .brand("Tesla")
                .model("Model S")
                .year(2025)
                .color("White")
                .isElectric(true)
                .build();

        Car bmw = new Builder()
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
