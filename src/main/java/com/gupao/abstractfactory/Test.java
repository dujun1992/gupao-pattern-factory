package com.gupao.abstractfactory;

/**
 * Create Time: 2019年07月21日 16:53
 * Author dj
 **/
public class Test {
    public static void main(String[] args) {
        IFactory f = new HuaweiFactory();
        IPhone p = f.create();
        IComputer c = f.produce();
        p.checked();
        c.play();
    }
}
