package com.baseStudy;

public class Account {
    private String momeny;

    public String getMomeny() {
        return momeny;
    }

    public void setMomeny(String momeny) {
        this.momeny = momeny;
    }

    public static void main(String[] args) {
        Account account = new Account();

        String momeny;

        momeny = account != null && account.getMomeny() != null ? "0" : account.getMomeny();
    }
}
