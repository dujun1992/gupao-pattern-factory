package com.gupao;

import com.gupao.simplefactory.IPhone;
import com.gupao.simplefactory.PhoneFactory;
import com.gupao.simplefactory.VivoPhone;

/**
 * Create Time: 2019年07月21日 15:53
 * Author dj
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {
        PhoneFactory pf = new PhoneFactory();
        IPhone p = pf.create(VivoPhone.class);
        p.checked();
    }

}
