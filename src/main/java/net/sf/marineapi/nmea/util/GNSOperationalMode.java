package net.sf.marineapi.nmea.util;

import net.sf.marineapi.nmea.parser.NoStatementValues;

/**
 * GNS operational modes, a mix of {@link FaaMode}
 * and {@link GpsFixQuality} with some omitted
 * values.
 */
public enum GNSOperationalMode {
    /**
     * Operating in autonomous mode (automatic 2D/3D).
     */
    AUTOMATIC('A'),
    /**
     * Operating in manual mode (forced 2D or 3D).
     */
    MANUAL('M'),
    /**
     * Operating in differential mode (DGPS).
     */
    DGPS('D'),
    /**
     * Operating in estimating mode (dead-reckoning).
     */
    ESTIMATED('E'),
    /**
     * Real Time Kinetic, satellite system used in RTK mode with fixed integers.
     */
    RTK('R'),
    /**
     * Float RTK, satellite system used in real time kinematic mode with floating integers.
     */
    FRTK('F'),
    /**
     * Precise mode, no deliberate degradation like Selective Availability (NMEA 4.00 and later).
     */
    PRECISE('P'),
    /**
     * Simulated data (running in simulator/demo mode).
     */
    SIMULATED('S'),
    /**
     * No valid GPS data available.
     */
    NONE('N'),

    /**
     * No data available for Mode field.
     */
    NO(Character.MIN_VALUE);

    private final char ch;

    GNSOperationalMode(char c) {
        this.ch = c;
    }

    /**
     * Returns the operational mode character.
     *
     * @return char indicator of mode
     */
    public char toChar() {
        if (ch == Character.MIN_VALUE) {
            return NoStatementValues.charNoStatement;
        }
        return ch;
    }

    /**
     * Returns the operational mode for given char.
     *
     * @param ch Char indicator
     * @return Operational mode enum
     */
    public static GNSOperationalMode valueOf(char ch) {
        for (GNSOperationalMode m : values()){
            if (m.toChar() == ch) {
                return m;
            }
        }
        return valueOf(String.valueOf(ch));
    }
}
