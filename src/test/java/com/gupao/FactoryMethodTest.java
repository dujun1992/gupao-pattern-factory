package com.gupao;

import com.gupao.factorymethod.IPhone;
import com.gupao.factorymethod.IPhoneFactory;
import com.gupao.factorymethod.VivoPhoneFactory;

/**
 * Create Time: 2019年07月21日 16:35
 * Author dj
 **/
public class FactoryMethodTest {
    public static void main(String[] args) {
        IPhoneFactory ipf = new VivoPhoneFactory();
        IPhone p = ipf.create();
        p.checked();
    }
}
