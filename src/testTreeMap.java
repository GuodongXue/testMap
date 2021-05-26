import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class testTreeMap {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<Student, String>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                Student s1 = (Student)o1;
                Student s2 = (Student)o2;

                return s1.getAge()-s2.getAge();
            }
        });


        Student s1 = new Student("lili1", 18, 160.4);
        tm.put(s1, s1.getName());
        Student s2 = new Student("lili2", 19, 161.4);
        tm.put(s2, s2.getName());
        Student s3 = new Student("lili3", 20, 162.4);
        tm.put(s3, s3.getName());
        Student s4 = new Student("lili4", 121, 163.4);
        tm.put(s4, s4.getName());

        System.out.println(tm.size());



    }
}
