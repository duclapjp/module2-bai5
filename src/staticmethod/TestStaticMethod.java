package staticmethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"Lập");
        Student s2 = new Student(112,"thái");
        s1.display();
        s2.display();
    }
}
