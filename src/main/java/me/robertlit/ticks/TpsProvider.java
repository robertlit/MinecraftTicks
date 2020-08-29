package me.robertlit.ticks;

/**
 * Represents an object that provides the current tps (ticks per second).
 */
public interface TpsProvider {

    /**
     * Gets the current tps.
     * @return the current tps.
     */
    double getTps();
}
