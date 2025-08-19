// Q4. Student class with constructor
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Shubham", 85);
        Student s2 = new Student("Adwait", 90);
        s1.display();
        s2.display();
    }
}
