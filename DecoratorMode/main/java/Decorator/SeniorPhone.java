package Decorator;

import Component.Phone;

public class SeniorPhone implements Phone {
    private Phone phone;
    public SeniorPhone(Phone phone) {
        this.phone = phone;
    }
    @Override
    public void sound() {
        this.phone.sound();
    }
}
