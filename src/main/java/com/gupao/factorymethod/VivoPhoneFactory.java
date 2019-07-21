package com.gupao.factorymethod;

/**
 * Create Time: 2019年07月21日 16:34
 * Author dj
 **/
public class VivoPhoneFactory implements IPhoneFactory {
    @Override
    public IPhone create() {
        return new VivoPhone();
    }
}
