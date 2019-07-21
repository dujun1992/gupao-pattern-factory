package com.gupao.abstractfactory;

/**
 * Create Time: 2019年07月21日 16:52
 * Author dj
 **/
public class VivoComputer implements IComputer {
    @Override
    public void play() {
        System.out.println("Vivo 玩电脑");
    }
}
