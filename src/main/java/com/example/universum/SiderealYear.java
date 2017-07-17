package com.example.universum;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SiderealYear {

    private static final BigDecimal SECONDS_IN_DAY = new BigDecimal(86400);
    private final BigDecimal earthDays;

    public SiderealYear(BigDecimal earthDays) {
        this.earthDays = earthDays;
    }

    public BigDecimal inEarthDays() {
        return earthDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SiderealYear that = (SiderealYear) o;

        return that.earthDays.compareTo(earthDays) == 0;
    }

    @Override
    public int hashCode() {
        return earthDays != null ? earthDays.setScale(0, RoundingMode.FLOOR).hashCode() : 0;
    }

    public BigDecimal inSeconds() {
        return earthDays.multiply(SECONDS_IN_DAY);
    }
}
