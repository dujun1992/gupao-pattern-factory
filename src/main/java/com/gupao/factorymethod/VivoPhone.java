package com.gupao.factorymethod;

/**
 * Create Time: 2019年07月21日 15:36
 * Author dj
 **/
public class VivoPhone implements IPhone {
    @Override
    public void checked() {
        System.out.println("Vivo 手机检测");
    }
}
