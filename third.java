// Q3. Local variable scope
class Demo {
    void show() {
        int x = 10;  // local variable
        System.out.println("Inside method: " + x);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
        // System.out.println(x); ❌ ERROR: x cannot be resolved outside method
    }
}
