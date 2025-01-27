package com.umutavci;

import java.util.Comparator;

public class GradeComparator implements Comparator<Student>{


    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getGrade() > o2.getGrade()){
            return -1;
        }
        else if(o1.getGrade() == o2.getGrade()){
            return 0;
        }
        else {
            return 1;
        }
    }
}
