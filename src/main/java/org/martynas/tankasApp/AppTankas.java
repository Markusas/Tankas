package org.martynas.tankasApp;

import org.martynas.model.Tankas;

import java.util.Scanner;

public class AppTankas {
    public static void main(String[] args) {
        Tankas tankas = new Tankas();
        Scanner sc = new Scanner(System.in);
        boolean runProgram = true;
        while(runProgram){
            tankas.pirmyn();
            tankas.desinen();
            tankas.atgal();
            tankas.kairen();
            tankas.suvis();
            tankas.info();
        }
        sc.close();
    }
}
