package com.gupao.simplefactory;

/**
 * Create Time: 2019年07月21日 15:45
 * Author dj
 **/
public class PhoneFactory {
    public IPhone create(Class clazz){
        try {
            if(clazz != null){
                return (IPhone) clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
