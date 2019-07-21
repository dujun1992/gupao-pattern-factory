package com.gupao.abstractfactory;

/**
 * Create Time: 2019年07月21日 16:32
 * Author dj
 **/
public class HuaweiFactory implements IFactory {
    @Override
    public IPhone create() {
        return new HuaweiPhone();
    }

    @Override
    public IComputer produce() {
        return new HuaweiComputer();
    }
}
