package com.example.universum;

import java.util.Set;

public class Planet {

    private final String name;
    private final RotationDirection rotationDirection;
    private final Distance diameter;              // średnica
    private final SiderealYear siderealYear;  // rok gwiezdny
    private Speed avgOrbitalSpeed;     // średnia prędkość orbitalna
    private double acceleration;        // przyspieszenie
    private Set<Gas> atmosphereGases;

    // constructor, getters & setters

    public Planet(String name, RotationDirection rotationDirection, Distance diameter, SiderealYear siderealYear) {
        this.name = name;
        this.rotationDirection = rotationDirection;
        this.diameter = diameter;
        this.siderealYear = siderealYear;
    }

    public String getName() {
        return name;
    }

    public RotationDirection getRotationDirection() {
        return rotationDirection;
    }

    public Distance getDiameter() {
        return diameter;
    }

    public SiderealYear getSiderealYear() {
        return siderealYear;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public Set<Gas> getAtmosphereGases() {
        return atmosphereGases;
    }

    public void setAtmosphereGases(Set<Gas> atmosphereGases) {
        this.atmosphereGases = atmosphereGases;
    }

    public Speed getAvgOrbitalSpeed() {
        return avgOrbitalSpeed;
    }

    public void setAvgOrbitalSpeed(Speed avgOrbitalSpeed) {
        this.avgOrbitalSpeed = avgOrbitalSpeed;
    }

    @Override
    public String toString() {
        return name;
    }
}
