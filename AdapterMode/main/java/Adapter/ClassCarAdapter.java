package Adapter;

import Adaptee.ClassToy;
import Target.ClassCar;

public class ClassCarAdapter extends ClassToy implements ClassCar {
    @Override
    public void run() {
        super.flash();
        super.sound();
        System.out.println("跑跑");
    }
}
