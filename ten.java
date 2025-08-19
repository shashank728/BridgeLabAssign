// Q10. All 3 types of variables
class Demo {
    int instanceVar = 20; // instance
    static int staticVar = 30; // static

    void show() {
        int localVar = 10; // local
        System.out.println("Local: " + localVar);
        System.out.println("Instance: " + instanceVar);
        System.out.println("Static: " + staticVar);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}
