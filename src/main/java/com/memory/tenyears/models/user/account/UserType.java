package com.memory.tenyears.models.user.account;

public enum UserType {
    ROOT(1000),

    MANAGER(100),

    VIP(10),

    NORMAL(1),

    BLACK(-1);

    private int code;

    UserType(int code) {
        this.code = code;
    }

}
