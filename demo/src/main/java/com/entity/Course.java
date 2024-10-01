package entity;

import jakarta.persistence.*;

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numCourse;

    private int level;

    @Enumerated(EnumType.STRING)
    private TypeCourse typeCourse;

    @Enumerated(EnumType.STRING)
    private Support support;

}
