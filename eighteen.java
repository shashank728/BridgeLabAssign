// Q18. Variable shadowing
class Demo {
    int x = 50; // instance variable

    void show() {
        int x = 20; // local variable shadows instance
        System.out.println("Local x: " + x);
        System.out.println("Instance x: " + this.x);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}
