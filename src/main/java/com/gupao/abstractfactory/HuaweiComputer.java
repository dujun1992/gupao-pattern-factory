package com.gupao.abstractfactory;

/**
 * Create Time: 2019年07月21日 16:50
 * Author dj
 **/
public class HuaweiComputer implements IComputer {
    @Override
    public void play() {
        System.out.println("Huawei 玩电脑");
    }
}
