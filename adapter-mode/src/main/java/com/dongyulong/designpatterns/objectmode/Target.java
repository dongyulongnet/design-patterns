package com.dongyulong.designpatterns.objectmode;

/**
 * @author Dong YL
 * @version V1.0 2020/4/15 10:39
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
