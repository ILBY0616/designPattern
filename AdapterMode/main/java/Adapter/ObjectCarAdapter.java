package Adapter;

import Adaptee.ObjectToy;
import Target.ObjectCar;

public class ObjectCarAdapter extends ObjectCar {
    ObjectToy objectToy = new ObjectToy();
    @Override
    public void run() {
        objectToy.flash();
        objectToy.sound();
        System.out.println("跑跑");
    }
}
