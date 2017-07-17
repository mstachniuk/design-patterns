package com.example.builder.gof;

import com.example.universum.*;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlanetBuildDirector {
    private PlanetBuilder planetBuilder;

    public PlanetBuildDirector(PlanetBuilder planetBuilder) {
        this.planetBuilder = planetBuilder;
    }

    public Planet construct() {
        Set<Gas> mercuryGases = Stream.of(Gas.OXYGEN, Gas.SODIUM, Gas.HYDROGEN).collect(Collectors.toSet());

        return planetBuilder.name("Mercury")
                .rotationDirection(RotationDirection.LEFT)
                .diameter(Distance.createFromMeter(new BigDecimal("4879400")))
                .siderealYearInEarthDays("87.96935")
                .acceleration(3.701)
                .avgOrbitalSpeedInKmPerSecond("47.362")
                .atmosphereGases(mercuryGases)
                .build();
    }
}
