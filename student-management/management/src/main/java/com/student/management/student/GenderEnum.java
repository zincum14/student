package com.student.management.student;

public enum GenderEnum {
    Male(1, "Male"),
    Female(2, "Female");

    private final int code;
    private final String desc;

    GenderEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static GenderEnum codeOf(int code) {
        for (GenderEnum gender : GenderEnum.values()) {
            if (gender.code == code) {
                return gender;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }

    public static GenderEnum descOf(String desc) {
        for (GenderEnum gender : GenderEnum.values()) {
            if (gender.desc == desc) {
                return gender;
            }
        }
        throw new IllegalArgumentException("Invalid desc: " + desc);
    }

    public int code() {
        return code;
    }

    public String desc() {
        return desc;
    }
}
