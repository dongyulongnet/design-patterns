package com.dongyulong.designpatterns.classmode;

/**
 * @author Dong YL
 * @version V1.0 2020/4/15 10:25
 */
public interface Target {

    /**
     * 这是源类Adaptee也有的方法
     */
    void sampleOperation1();

    /**
     * 这是源类Adapteee没有的方法
     */
    void sampleOperation2();
}
