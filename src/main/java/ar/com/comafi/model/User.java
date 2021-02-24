package ar.com.comafi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty(value = "first_name")
    private String firstName;

    public User() {}

    public User(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
