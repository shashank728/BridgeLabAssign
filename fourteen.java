// Q14. Parameter same as instance variable
class Demo {
    int value;

    void setValue(int value) {
        this.value = value; // differentiate
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.setValue(42);
        System.out.println("Value: " + d.value);
    }
}
