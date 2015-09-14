package com.example;

public class MyObject {

    private String data;

    public MyObject(String s) {
        this.data = s;
    }

    @Override
    public String toString() {
        return data;
    }
}