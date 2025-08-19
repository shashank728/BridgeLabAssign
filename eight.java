// Q8. Static block initialization
class Demo {
    static int value;

    static {
        value = 500;
        System.out.println("Static block executed!");
    }

    public static void main(String[] args) {
        System.out.println("Value = " + Demo.value);
    }
}
