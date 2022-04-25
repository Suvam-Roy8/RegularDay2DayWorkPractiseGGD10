package com.pack;

public class HelperClass {
    String init;

    public HelperClass(String init) {
        this.init = init;
    }
    public void show(String s)
    {
        System.out.println(s+init);
    }
}
