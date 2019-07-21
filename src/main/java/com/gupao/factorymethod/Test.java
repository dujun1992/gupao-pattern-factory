package com.gupao.factorymethod;

/**
 * Create Time: 2019年07月21日 16:35
 * Author dj
 **/
public class Test {
    public static void main(String[] args) {
        IPhoneFactory ipf = new VivoPhoneFactory();
        IPhone p = ipf.create();
        p.checked();
    }
}
