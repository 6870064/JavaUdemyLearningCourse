package com.examclouds.xii_interfaces_and_enums.tasks.i_interface_printable;

import java.util.Objects;

public class Magazine implements Printable {
    private String magazineTitle;

    public Magazine(String magazineTitle) {
        this.magazineTitle = magazineTitle;
    }

    public String getMagazineTitle() {
        return magazineTitle;
    }

    public void setMagazineTitle(String magazineTitle) {
        this.magazineTitle = magazineTitle;
    }

    public static void printMagazine(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                System.out.println(printable);
            }
        }
    }

    @Override
    public void print() {
        System.out.println(String.format("Printing magazine: %s", getMagazineTitle()));
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "magazineTitle='" + magazineTitle + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(magazineTitle, magazine.magazineTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(magazineTitle);
    }
}
