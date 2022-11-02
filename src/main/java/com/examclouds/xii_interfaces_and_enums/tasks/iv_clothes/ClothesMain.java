package com.examclouds.xii_interfaces_and_enums.tasks.iv_clothes;

public class ClothesMain {
    public static void main(String[] args) {
        Skirt skirt = new Skirt(Size.XS, 100,"Black");
        Pants pants = new Pants(Size.L, 120, "Green");
        Tie tie = new Tie(Size.XXS, 25, "Red");
        TShirt tShirt = new TShirt(Size.XS, 75, "White");
        Pants pants1 = new Pants(Size.S, 100, "Yellow");

        Clothes[] clothes = {skirt, pants, tie, pants1, tShirt};
        Atelier atelier = new Atelier();
        atelier.DressUpMan(clothes);
        System.out.println();
        atelier.DressUpWoman(clothes);

    }
}
