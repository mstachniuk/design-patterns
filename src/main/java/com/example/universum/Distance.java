package com.example.universum;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Distance {

    private static final BigDecimal ASTRONOMICAL_UNIT_IN_METER = new BigDecimal("149597870700");
    private static final BigDecimal LIGHT_YEAR_IN_METER = new BigDecimal("9460730472580800");

    private final BigDecimal distanceInKM;

    public static Distance createFromMeter(BigDecimal distance) {
        return new Distance(distance, Unit.METER);
    }

    public static Distance createFromKM(BigDecimal distance) {
        return new Distance(distance, Unit.KILOMETER);
    }

    public static Distance createFromAU(BigDecimal distance) {
        return new Distance(distance, Unit.ASTRONOMICAL_UNIT);
    }

    public static Distance createFromLY(BigDecimal distance) {
        return new Distance(distance, Unit.LIGHT_YEAR);
    }

    private Distance(BigDecimal distance, Unit unit) {
        distanceInKM = unit.inKM(distance);
    }

    public BigDecimal getKm() {
        return distanceInKM;
    }

    public BigDecimal getMeter() {
        return distanceInKM.movePointRight(3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Distance distance = (Distance) o;

        return !(distanceInKM != null ? distanceInKM.compareTo(distance.distanceInKM) != 0 : distance.distanceInKM != null);
    }

    @Override
    public int hashCode() {
        return distanceInKM != null ? distanceInKM.setScale(0, RoundingMode.FLOOR).hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Distance " + distanceInKM + " KM";
    }

    private enum Unit {
        METER {
            @Override
            public BigDecimal inKM(BigDecimal d) {
                return d.movePointLeft(3);
            }
        }, KILOMETER {
            @Override
            public BigDecimal inKM(BigDecimal d) {
                return d;
            }
        }, ASTRONOMICAL_UNIT {
            @Override
            public BigDecimal inKM(BigDecimal d) {
                return d.multiply(ASTRONOMICAL_UNIT_IN_METER);
            }
        }, LIGHT_YEAR {
            @Override
            public BigDecimal inKM(BigDecimal d) {
                return d.multiply(LIGHT_YEAR_IN_METER);
            }
        };

        public abstract BigDecimal inKM(BigDecimal d);
    }
}
