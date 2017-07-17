package com.example.universum;

import java.math.BigDecimal;

import static com.example.universum.Speed.Unit.KILOMETER_PER_SECOND;
import static com.example.universum.Speed.Unit.METER_PER_SECOND;

public class Speed {

    private final BigDecimal speedInMeterPerSecond;

    public static Speed createKmPerSecond(String v) {
        return new Speed(new BigDecimal(v), KILOMETER_PER_SECOND);
    }

    public static Speed createMeterPerSecond(String v) {
        return new Speed(new BigDecimal(v), METER_PER_SECOND);
    }

    private Speed(BigDecimal v, Unit unit) {
        if (unit == METER_PER_SECOND) {
            speedInMeterPerSecond = v;
        } else if (unit == KILOMETER_PER_SECOND) {
            speedInMeterPerSecond = v.movePointRight(3);
        } else {
            throw new IllegalArgumentException("Invalid Unit: " + unit);
        }
    }

    public BigDecimal getMeterPerSecond() {
        return speedInMeterPerSecond;
    }

    public BigDecimal getKmPerSecond() {
        return speedInMeterPerSecond.movePointLeft(3);
    }

    @Override
    public String toString() {
        return "Speed " + speedInMeterPerSecond + " m/s";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Speed speed = (Speed) o;

        return speedInMeterPerSecond.compareTo(speed.speedInMeterPerSecond) == 0;
    }

    @Override
    public int hashCode() {
        return speedInMeterPerSecond.hashCode();
    }

    enum Unit {
        METER_PER_SECOND, KILOMETER_PER_SECOND
    }
}
