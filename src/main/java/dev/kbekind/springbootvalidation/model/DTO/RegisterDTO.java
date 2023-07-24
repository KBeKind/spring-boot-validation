package dev.kbekind.springbootvalidation.model.DTO;

import jakarta.validation.constraints.NotBlank;

public class RegisterDTO {


    @NotBlank
    String username;

    @NotBlank
    String displayName;

    public RegisterDTO() {
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
