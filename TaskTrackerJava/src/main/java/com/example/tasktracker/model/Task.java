package com.example.tasktracker.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Task implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;
    private String text;
    private String daystring;
    private boolean reminder;

    public Task(){}

    public Task(int id, String text, String day, boolean reminder){
        this.id = id;
        this.text = text;
        this.daystring = day;
        this.reminder = reminder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDay() {
        return daystring;
    }

    public void setDay(String day) {
        this.daystring = day;
    }

    public boolean isReminder() {
        return reminder;
    }

    public void setReminder(boolean reminder) {
        this.reminder = reminder;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", timeday='" + daystring + '\'' +
                ", reminder=" + reminder +
                '}';
    }
}
