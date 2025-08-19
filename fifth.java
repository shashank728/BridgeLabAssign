// Q5. Modify static variable from one object and access from another
class Demo {
    static int value = 10;

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        d1.value = 50; // change using one object

        System.out.println("Value from d1: " + d1.value);
        System.out.println("Value from d2: " + d2.value); // reflects same
    }
}
