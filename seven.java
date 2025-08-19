// Q7. Final variable
class Demo {
    final int value = 100;

    public static void main(String[] args) {
        Demo d = new Demo();
        // d.value = 200; ❌ ERROR: cannot assign a value to final variable
    }
}
