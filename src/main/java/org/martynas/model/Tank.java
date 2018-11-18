package org.martynas.model;


import java.util.HashMap;
import java.util.Map;

public class Tank {

    private Coordinates coordinates;
    private Destination destination;
    private Map<Destination, Integer> shootHistory = new HashMap<Destination, Integer>();


    public Tank() {
        this.coordinates = new Coordinates();
        shootHistory.put(Destination.EAST, 0);
        shootHistory.put(Destination.NORTH, 0);
        shootHistory.put(Destination.SOUTH, 0);
        shootHistory.put(Destination.WEST, 0);
    }

    int sum = shootHistory.values().stream().mapToInt(i -> i).sum();

    public void forward() {
        destination = coordinates.increaseY();
        logMovment();
    }

    public void right() {
        destination = coordinates.increaseX();
        logMovment();
    }

    public void back() {
        destination = coordinates.decreaseY();
        logMovment();
    }

    public void left() {
        destination = coordinates.decreaseX();
        logMovment();
    }

    public void shoot() {
        Integer shootNumber = shootHistory.get(destination);
        shootHistory.put(destination, ++shootNumber);
        logShoot();

    }


    public void info() {
        System.out.println(String.format("INFO: tank coordinate: %s, destination: %s", coordinates, destination));
        System.out.println(String.format("INFO: Tank's shots: %s North, %s East, %s South, %s West. Total of shots: %s",
                shootHistory.get(Destination.NORTH),
                shootHistory.get(Destination.EAST),
                shootHistory.get(Destination.SOUTH),
                shootHistory.get(Destination.WEST),
                sum
                )
        );
    }

    private void logMovment() {
        System.out.println(String.format("Tank goes %s: %s", destination, coordinates.toString()));
    }

    private void logShoot() {
        System.out.println(String.format("Shot to the %s", destination));
    }
}
