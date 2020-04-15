package com.dongyulong.designpatterns.objectmode;

/**
 * @author Dong YL
 * @version V1.0 2020/4/15 10:40
 */
public class Main {

    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Adaptee());
        adapter.sampleOperation1();
        adapter.sampleOperation2();
    }
}
