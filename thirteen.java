// Q13. Static variable in A, change in B
class A {
    static int x = 10;
}

class B {
    public static void main(String[] args) {
        System.out.println("Before: " + A.x);
        A.x = 99;
        System.out.println("After: " + A.x);
    }
}

