package thuchanh_static_method;

public class Student {
    private int age;
    private String name;
    private static String college = "BBDIT";
    Student(int a, String n){
        age = a;
        name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(age + " " + name + " " + college);
    }

}
