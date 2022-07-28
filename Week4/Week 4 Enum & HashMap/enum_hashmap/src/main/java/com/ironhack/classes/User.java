package com.ironhack.classes;

import com.ironhack.enums.Status;

public class User {

    public Object setStatus;
    private long id;
    private String name;
    private Status status;


    public User(long id, String name, Status status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public User(long id, String name) {
        this.id = id;
        this.name = name;
        this.status = Status.ONLINE;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
