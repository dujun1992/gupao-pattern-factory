package com.gupao;

import com.gupao.abstractfactory.HuaweiFactory;
import com.gupao.abstractfactory.IComputer;
import com.gupao.abstractfactory.IFactory;
import com.gupao.abstractfactory.IPhone;

/**
 * Create Time: 2019年07月21日 16:53
 * Author dj
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        IFactory f = new HuaweiFactory();
        IPhone p = f.create();
        IComputer c = f.produce();
        p.checked();
        c.play();
    }
}
