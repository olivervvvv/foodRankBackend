package com.twoTeam.groupProject.dto;




import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class UserRegisterRequest {
    @NotNull
    private String name;
    @NotNull
    @Email
    private String email;
    @NotNull
    private String password;

}
