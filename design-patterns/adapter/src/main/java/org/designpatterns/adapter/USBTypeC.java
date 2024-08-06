package org.designpatterns.adapter;

public class USBTypeC implements Charger {

    @Override
    public void charge() {
        System.out.println("Charging with USB Type C...");
    }
}
