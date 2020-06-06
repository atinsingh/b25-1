package io.pragra.leanring.entities;

public class User {
    private String name;
    private String add;
    private int id;

    public User(String name, String add, int id) {
        this.name = name;
        this.add = add;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }

    public int getId() {
        return id;
    }
}
