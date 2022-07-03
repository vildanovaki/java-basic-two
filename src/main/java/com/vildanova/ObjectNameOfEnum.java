package com.vildanova;

public enum ObjectNameOfEnum {

    OBJECT1("OBJECT1"),
    OBJECT2("OBJECT2");

    private final String nameObject;

    ObjectNameOfEnum(String nameObject) {
        this.nameObject = nameObject;
    }

    public String getNameObject() {
        return nameObject;
    }
}
