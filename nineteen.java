// Q19. Each object has its own copy of instance variable
class Demo {
    int value;

    Demo(int v) {
        value = v;
    }

    public static void main(String[] args) {
        Demo d1 = new Demo(10);
        Demo d2 = new Demo(20);
        System.out.println("d1 value: " + d1.value);
        System.out.println("d2 value: " + d2.value);
    }
}
