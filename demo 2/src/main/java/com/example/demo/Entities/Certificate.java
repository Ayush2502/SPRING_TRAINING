package com.example.demo.Entities;


import javax.persistence.Embeddable;

@Embeddable
public class Certificate {

    private String course;
    private int duration;

    public Certificate(String course, int duration) {
        this.course = course;
        this.duration = duration;
    }

    public Certificate() {
        super();
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "course='" + course + '\'' +
                ", duration=" + duration +
                '}';
    }
}
