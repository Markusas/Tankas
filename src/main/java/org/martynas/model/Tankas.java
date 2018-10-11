package org.martynas.model;


public class Tankas {

    Point point = new Point();
    private String saugotiKoordinates = "Tanko koordinates: (" + point.getX() + ";" + point.getY() + ")";


    public void pirmyn() {

    }

    public void desinen() {
    }

    public void atgal() {
    }

    public void kairen() {
    }

    public void suvis() {
    }

    public void info() {
        System.out.println(saugotiKoordinates);
    }
}
