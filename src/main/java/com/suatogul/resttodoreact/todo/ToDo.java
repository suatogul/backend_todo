package com.suatogul.resttodoreact.todo;

import java.util.UUID;

public class ToDo {

    UUID uuid = UUID.randomUUID();
    private String todoName;
    private boolean done;

    public ToDo(){}

    public ToDo(String todoName) {
        this.todoName = todoName;
        this.done=false;
    }


    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getTodoName() {
        return todoName;
    }

    public void setTodoName(String todoName) {
        this.todoName = todoName;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
