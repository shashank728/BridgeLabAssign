// Q1. Create Car class with model and year
class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Tesla", 2022);
        Car c2 = new Car("BMW", 2020);
        c1.display();
        c2.display();
    }
}
