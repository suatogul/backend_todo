package com.suatogul.resttodoreact.data.entity;


import javax.persistence.*;

@Entity
@Table(name="todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String todoText;
    private boolean done;
    public Todo(){}

    public Todo(String todoText,boolean done) {
        this.todoText = todoText;
        this.done = done;
    }

    public long getId() {
        return id;
    }

    public String getTodoText() {
        return todoText;
    }

    public void setTodoText(String todoText) {
        this.todoText = todoText;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
