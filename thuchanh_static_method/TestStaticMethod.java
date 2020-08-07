package thuchanh_static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(27, "Phuc" );
        Student s2 = new Student(25,"Phuong");
        Student s3 = new Student(20, "Phong");
        s1.display();
        s2.display();
        s3.display();
    }
}
