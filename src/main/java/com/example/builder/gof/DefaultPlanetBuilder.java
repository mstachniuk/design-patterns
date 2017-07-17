package com.example.builder.gof;

import com.example.universum.*;

import java.math.BigDecimal;
import java.util.Set;

public class DefaultPlanetBuilder implements PlanetBuilder {
    private Speed avgOrbitalSpeed;     // średnia prędkość orbitalna
    private double acceleration;        // przyspieszenie
    private Set<Gas> atmosphereGases;
    private String name;
    private RotationDirection rotationDirection;
    private Distance diameter;              // średnica
    private SiderealYear siderealYear;  // rok gwiezdny

    public DefaultPlanetBuilder() {
    }

    @Override
    public PlanetBuilder avgOrbitalSpeedInKmPerSecond(String avgOrbitalSpeed) {
        this.avgOrbitalSpeed = Speed.createKmPerSecond(avgOrbitalSpeed);
        return this;
    }

    @Override
    public PlanetBuilder siderealYearInEarthDays(String siderealYear) {
        this.siderealYear = new SiderealYear(new BigDecimal(siderealYear));
        return this;
    }

    @Override
    public PlanetBuilder acceleration(double acceleration) {
        this.acceleration = acceleration;
        return this;
    }

    @Override
    public PlanetBuilder atmosphereGases(Set<Gas> atmosphereGases) {
        this.atmosphereGases = atmosphereGases;
        return this;
    }

    @Override
    public PlanetBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PlanetBuilder rotationDirection(RotationDirection rotationDirection) {
        this.rotationDirection = rotationDirection;
        return this;
    }

    @Override
    public PlanetBuilder diameter(Distance diameter) {
        this.diameter = diameter;
        return this;
    }

    @Override
    public Planet build() {
        Planet planet = new Planet(name, rotationDirection, diameter, siderealYear);
        planet.setAvgOrbitalSpeed(avgOrbitalSpeed);
        planet.setAcceleration(acceleration);
        planet.setAtmosphereGases(atmosphereGases);
        return planet;
    }
}
