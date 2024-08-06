package org.designpatterns.adapter;

public class AdapterDesignPattern {
    public static void main(String[] args) {
        TypeAPhone typeAPhone = new TypeAPhone(new USBTypeCToTypeAAdapter());
        typeAPhone.phoneCharge();
    }
}