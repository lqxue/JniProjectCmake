package com.jniprojectcmake;

public class Util {
    static {
        System.loadLibrary("print");
    }

    public  static native String print();
}
