package ZYUR._24_04_19;

import jdk.jfr.StackTrace;
import lombok.extern.apachecommons.CommonsLog;

import java.beans.BeanProperty;
import java.beans.JavaBean;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;

public class StudentDemo {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Ramiz", 20));
        studentSet.add(new Student("Ivan", 18));
        studentSet.add(new Student("Petr", 22));
        System.out.println(studentSet);
        System.out.println("===================");
        Set<Student> studentSet2 = updateAvgMark(studentSet);
        System.out.println(studentSet2);
        
    }

    public static Set<Student> updateAvgMark(Set<Student> studentSet) {
        Random random = new Random();
        Set<Student> students = new HashSet<>();
        for (Student student : studentSet) {
            students.add(student.updateAvgMark((int) random.nextDouble(1.0, 5.0)));
        }
        return students;
    }
}
