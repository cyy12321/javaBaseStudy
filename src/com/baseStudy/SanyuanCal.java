package com.baseStudy;

public class SanyuanCal {
    public static void main(String[] args) {
        int heshang1 = 150;
        int heshang2 = 210;
        int heshang3 = 165;
        int tempMax = heshang1 > heshang2 ? heshang1 : heshang2;
        int max=tempMax>heshang3?tempMax:heshang3;
        System.out.println(max);

    }
}
