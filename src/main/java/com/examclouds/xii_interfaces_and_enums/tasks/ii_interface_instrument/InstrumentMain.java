package com.examclouds.xii_interfaces_and_enums.tasks.ii_interface_instrument;

public class InstrumentMain {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(6);
        Guitar guitar1 = new Guitar(4);
        Drums drums = new Drums(12);
        Drums drums1 = new Drums(24);
        Trumpet trumpet = new Trumpet(20);

        Instrument[] instruments = {guitar, guitar1, drums, drums1, trumpet};

        for (Instrument instrument : instruments){
            instrument.play();
        }

    }
}
