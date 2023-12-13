package com.twoTeam.groupProject.exceptions;


public class RegisterParamException extends RuntimeException {
    static final long serialVersionUID = -7034897190745768787L;

    public RegisterParamException() {
    }

    public RegisterParamException(String s) {
        super(s);
    }

    public RegisterParamException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public RegisterParamException(Throwable throwable) {
        super(throwable);
    }

    public RegisterParamException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }

}
