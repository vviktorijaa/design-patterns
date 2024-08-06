package org.designpatterns.adapter;

public class USBTypeCToTypeAAdapter implements Charger {

    private USBTypeC usbTypeC;

    public USBTypeCToTypeAAdapter() {
        usbTypeC = new USBTypeC();
    }

    @Override
    public void charge() {
        usbTypeC.charge();
    }
}
