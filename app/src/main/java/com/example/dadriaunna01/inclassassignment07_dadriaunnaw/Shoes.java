package com.example.dadriaunna01.inclassassignment07_dadriaunnaw;

/**
 * Created by cmltdstudent on 3/20/17.
 */

public class Shoes {

    private String name;
    private int size;
    private boolean cute;

    public Shoes () {} // Empty constructor is needed to read from Firebase

    public Shoes(String name, int size, boolean cute) {
        this.name = name;
        this.size = size;
        this.cute = cute;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public boolean isCute() {
        return cute;
    }
}
