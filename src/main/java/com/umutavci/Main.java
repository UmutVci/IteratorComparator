package com.umutavci;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student(1,"Umut", 100.0);
        Student st2 = new Student(2,"Ayse", 70.0);
        Student st3 = new Student(3,"Ali", 30.0);
        Student st4 = new Student(4,"Fatma", 45.5);
        Student st5 = new Student(5,"Mehmet", 85.5);
        List<Student> studentList = new ArrayList<>(List.of(st1,st2,st3,st4,st5));
        Iterator<Student> iterator = studentList.iterator();

        while(iterator.hasNext()){
            if(iterator.next().getGrade() < 50){
                iterator.remove();
            }
        }
        // oder studentList.stream()
        // .sorted(Comparator.comparingDouble(Student::getGrade))
        // .toList()
        // .reversed();
        for(Student student :  studentList.stream().sorted(new GradeComparator()).toList()){
            System.out.println(student.getName() + " " + student.getGrade());
        }

    }
}