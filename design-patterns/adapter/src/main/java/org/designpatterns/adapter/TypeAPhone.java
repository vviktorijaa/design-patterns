package org.designpatterns.adapter;

public class TypeAPhone implements Phone {

    private Charger usbTypeCToTypeAChargerAdapter;

    TypeAPhone(Charger usbTypeCToTypeAChargerAdapter) {
        this.usbTypeCToTypeAChargerAdapter = usbTypeCToTypeAChargerAdapter;
    }

    @Override
    public void phoneCharge() {
        usbTypeCToTypeAChargerAdapter.charge();
    }
}
