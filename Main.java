import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(4, "Aaa", "Aaa", "Aaa");
        Student student2 = new Student(2, "aaa", "aaa", "aaa");
        Student student3 = new Student(3, "Aab", "Aab", "Aab");
        Student student4 = new Student(1, "bbb", "bbb", "bbb");
        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(studentList);
        studentGroup.studentList.add(student1);
        studentGroup.studentList.add(student2);
        studentGroup.studentList.add(student3);
        studentGroup.studentList.add(student4);
        StudentGroupService service = new StudentGroupService(studentGroup);
        service.soutStudentGroup();
        // service.removeStudentFIO("aab", "aab", "aab");

        System.out.println();
        // service.soutStudentGroup();
        for (Student student : service.getSortedStudentGroupBuId()) {
            System.out.println(student);
        }

        System.out.println();
        // service.soutStudentGroup();
        for (Student student : service.getSortedStudentGroupBuFIO()) {
            System.out.println(student);
        }
        // StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
        // while (iterator.hasNext()) {
        // if (iterator.counter == 2)
        // iterator.remove();
        // System.out.println(iterator.next());
        // }

    }

}
