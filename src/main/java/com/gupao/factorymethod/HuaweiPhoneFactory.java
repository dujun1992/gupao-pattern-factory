package com.gupao.factorymethod;

/**
 * Create Time: 2019年07月21日 16:32
 * Author dj
 **/
public class HuaweiPhoneFactory implements IPhoneFactory {
    @Override
    public IPhone create() {
        return new HuaweiPhone();
    }
}
