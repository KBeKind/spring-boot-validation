package dev.kbekind.springbootvalidation.model;


import jakarta.validation.constraints.NotBlank;

public class UserEntity {

    @NotBlank
    String username;

    @NotBlank
    String displayName;

    public UserEntity() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
