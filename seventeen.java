// Q17. Static final variable (constant)
class Demo {
    static final double PI = 3.14;

    public static void main(String[] args) {
        System.out.println("PI = " + PI);
        // PI = 3.14159; ❌ ERROR: cannot assign value to final variable
    }
}
