// Q16. Local variable must be initialized
class Demo {
    public static void main(String[] args) {
        int x; // declared
        // System.out.println(x); ❌ ERROR: variable x might not have been initialized
    }
}
