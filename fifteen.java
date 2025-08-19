// Q15. Multiple methods accessing same instance variable
class Demo {
    int value = 10;

    void changeValue() {
        value = 20;
    }

    void printValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.printValue();
        d.changeValue();
        d.printValue();
    }
}
