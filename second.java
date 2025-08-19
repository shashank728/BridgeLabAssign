// Q2. Static variable to count cars
class Car {
    String model;
    int year;
    static int numberOfCars = 0;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
        numberOfCars++;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Tesla", 2022);
        Car c2 = new Car("BMW", 2020);
        System.out.println("Number of cars created: " + Car.numberOfCars);
    }
}
