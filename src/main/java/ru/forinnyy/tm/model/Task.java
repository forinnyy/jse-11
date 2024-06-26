package ru.forinnyy.tm.model;

import java.util.UUID;

public final class Task {

    private String id = UUID.randomUUID().toString();

    private String name = "";

    private String description = "";

    public Task() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
