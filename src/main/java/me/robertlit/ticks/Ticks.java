/*
This is a part of MinecraftTicks.

MIT License

Copyright (c) 2020 robertlit

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */
package me.robertlit.ticks;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Methods to convert minecraft ticks to other time units.
 */
public final class Ticks {

    /**
     * Hide public constructor.
     */
    private Ticks() {}

    /**
     * The current TpsProvider.
     */
    private static TpsProvider tpsProvider = () -> 20;

    /**
     * Sets the TpsProvider.
     * @param tpsProvider the wanted TpsProvider.
     */
    public static void withTpsProvider(@NotNull TpsProvider tpsProvider) {
        Ticks.tpsProvider = Objects.requireNonNull(tpsProvider, "tps provider can not be null");
    }

    /**
     * Represents how many nanoseconds are in one second.
     */
    private static final double NANOS_IN_SECOND = 1_000_000_000;

    /**
     * Converts ticks to seconds.
     * @param ticks the amount of ticks to convert.
     * @return the time in seconds.
     */
    public static double toSeconds(double ticks) {
        return ticks / tpsProvider.getTps();
    }

    /**
     * Converts ticks to nanoseconds.
     * @param ticks the amount of ticks to convert.
     * @return the time in nanoseconds.
     */
    public static double toNanoseconds(double ticks) {
        return toSeconds(ticks) * NANOS_IN_SECOND;
    }

    /**
     * Converts ticks to microseconds.
     * @param ticks the amount of ticks to convert.
     * @return the time in microseconds.
     */
    public static double toMicroseconds(double ticks) {
        return toNanoseconds(ticks) / 1000;
    }

    /**
     * Converts ticks to milliseconds.
     * @param ticks the amount of ticks to convert.
     * @return the time in milliseconds.
     */
    public static double toMilliseconds(double ticks) {
        return toMicroseconds(ticks) / 1000;
    }

    /**
     * Converts ticks to minutes.
     * @param ticks the amount of ticks to convert.
     * @return the time in minutes.
     */
    public static double toMinutes(double ticks) {
        return toSeconds(ticks) / 60;
    }

    /**
     * Converts ticks to hours.
     * @param ticks the amount of ticks to convert
     * @return the time in hours
     */
    public static double toHours(double ticks) {
        return toMinutes(ticks) / 60;
    }

    /**
     * Converts ticks to days.
     * @param ticks the amount of ticks to convert.
     * @return the time in days.
     */
    public static double toDays(double ticks) {
        return toHours(ticks) / 24;
    }

    /**
     * Converts seconds to ticks.
     * @param seconds the amount of seconds to convert.
     * @return the time in ticks.
     */
    public static double fromSeconds(double seconds) {
        return seconds * tpsProvider.getTps();
    }

    /**
     * Converts nanoseconds to ticks.
     * @param nanoseconds the amount of nanoseconds to convert.
     * @return the time in ticks.
     */
    public static double fromNanoseconds(double nanoseconds) {
        return fromSeconds(nanoseconds / NANOS_IN_SECOND);
    }

    /**
     * Converts microseconds to ticks.
     * @param microseconds the amount of microseconds to convert.
     * @return the time in ticks.
     */
    public static double fromMicroseconds(double microseconds) {
        return fromNanoseconds(microseconds * 1000);
    }

    /**
     * Converts milliseconds to ticks.
     * @param milliseconds the amount of milliseconds to convert.
     * @return the time in ticks.
     */
    public static double fromMilliseconds(double milliseconds) {
        return fromMicroseconds(milliseconds * 1000);
    }

    /**
     * Converts minutes to ticks.
     * @param minutes the amount of minutes to convert.
     * @return the time in ticks.
     */
    public static double fromMinutes(double minutes) {
        return fromSeconds(minutes * 60);
    }

    /**
     * Converts hours to ticks.
     * @param hours the amount of hours to convert.
     * @return the time in ticks.
     */
    public static double fromHours(double hours) {
        return fromMinutes(hours * 60);
    }

    /**
     * Converts days to ticks.
     * @param days the amount of days to convert.
     * @return the time in ticks.
     */
    public static double fromDays(double days) {
        return fromHours(days * 24);
    }
}
