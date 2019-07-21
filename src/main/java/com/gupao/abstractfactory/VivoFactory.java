package com.gupao.abstractfactory;

/**
 * Create Time: 2019年07月21日 16:51
 * Author dj
 **/
public class VivoFactory implements IFactory {
    @Override
    public IPhone create() {
        return new VivoPhone();
    }

    @Override
    public IComputer produce() {
        return new VivoComputer();
    }
}
