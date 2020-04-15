package com.dongyulong.designpatterns.classmode;

/**
 * @author Dong YL
 * @version V1.0 2020/4/15 10:27
 */
public class Adapter extends Adaptee implements Target {
    /**
     * 由于源类Adaptee没有方法sampleOperation2()
     * 因此适配器补充上这个方法
     */
    @Override
    public void sampleOperation2() {
        //写相关的代码
    }

}