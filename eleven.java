// Q11. Static variable default value
class Demo {
    static int value; // default 0

    public static void main(String[] args) {
        System.out.println("Default: " + Demo.value);
        Demo.value = 100;
        System.out.println("After assigning: " + Demo.value);
    }
}
