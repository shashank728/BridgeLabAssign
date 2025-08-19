// Q6. this keyword to differentiate
class Demo {
    int x = 100;  // instance variable

    void show(int x) {
        System.out.println("Local x: " + x);
        System.out.println("Instance x: " + this.x);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show(50);
    }
}
