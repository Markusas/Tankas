package org.martynas.tankasApp;

import org.martynas.model.Tank;

import java.util.Scanner;

public class AppTankas {
    public static void main(String[] args) {
        Tank tank = new Tank();

        tank.forward();
        tank.right();
        tank.forward();
        tank.shoot();
        tank.shoot();
        tank.left();
        tank.shoot();
        tank.forward();
        tank.info();
        tank.left();
        tank.left();
        tank.shoot();
        tank.shoot();
        tank.shoot();
        tank.shoot();
        tank.info();


    }
}



