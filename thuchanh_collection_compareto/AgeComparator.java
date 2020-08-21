package thuchanh_collection_compareto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Student> {




    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() > o2.getAge()){
            return 1;
        }else if (o1.getAge().equals(o2.getAge())){
            return 0;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Phuc", 27, "DN");
        Student student1 = new Student("Phuong", 25, "DN");
        Student student2 = new Student("Bao", 25, "DN");
        Student student3 = new Student("Van", 26, "DN");
        List<Student> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st : lists){
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        lists.sort(ageComparator);
        System.out.println("So sanh theo tuoi: ");
        for (Student st : lists){
            System.out.println(st.toString());
        }

    }
}
