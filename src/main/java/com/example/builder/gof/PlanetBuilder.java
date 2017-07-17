package com.example.builder.gof;

import com.example.universum.Distance;
import com.example.universum.Gas;
import com.example.universum.Planet;
import com.example.universum.RotationDirection;

import java.util.Set;

public interface PlanetBuilder {
    PlanetBuilder avgOrbitalSpeedInKmPerSecond(String avgOrbitalSpeed);

    PlanetBuilder siderealYearInEarthDays(String siderealYear);

    PlanetBuilder acceleration(double acceleration);

    PlanetBuilder atmosphereGases(Set<Gas> atmosphereGases);

    PlanetBuilder name(String name);

    PlanetBuilder rotationDirection(RotationDirection rotationDirection);

    PlanetBuilder diameter(Distance diameter);

    Planet build();
}
