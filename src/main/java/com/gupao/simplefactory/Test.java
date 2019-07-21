package com.gupao.simplefactory;

/**
 * Create Time: 2019年07月21日 15:53
 * Author dj
 **/
public class Test {
    public static void main(String[] args) {
        PhoneFactory pf = new PhoneFactory();
        IPhone p = pf.create(VivoIPhone.class);
        p.checked();
    }

}
