package com.ironhack.classes.course;

public class Course {

    private Integer classID;
    private Integer capacity;
    private Integer studentCount;
    private String title;

    public Course(Integer classID, Integer capacity, Integer studentCount, String title) {
        setClassID(classID);
        setCapacity(capacity);
        setStudentCount(studentCount);
        setTitle(title);
    }

    public Integer getClassID() {
        return classID;
    }

    public void setClassID(Integer classID) {
        this.classID = classID;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
