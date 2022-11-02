package com.examclouds.xii_interfaces_and_enums.tasks.iv_clothes;

public class Atelier {

    public void DressUpMan(Clothes[] clothes) {
        for (Clothes clothes1 : clothes) {
            if (clothes1 instanceof MensClothes)
            System.out.println(clothes1);
        }
    }

    public void DressUpWoman(Clothes[] clothes) {
        for (Clothes clothes1 : clothes) {
            if (clothes1 instanceof WomenClothes)
                System.out.println(clothes1);
        }
    }
}
