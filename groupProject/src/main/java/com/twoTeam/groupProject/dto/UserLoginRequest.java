package com.twoTeam.groupProject.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UserLoginRequest {
    @NotNull
    private String email;
    @NotNull
    private String password;
}
