/*
 * Copyright (C) 2006 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.diagraminterchange;

import java.util.Random;

/**
 * <p>
 * A helper class for unit test.
 * </p>
 *
 * @author TCSDEVELOPER
 * @version 1.0
 */
final class TestHelper {

    /**
     * The default value of type double.
     */
    public static final double DEFAULT_DOUBLE = 0.0;

    /**
     * An empty string for testing.
     */
    public static final String EMPTY_STRING = "";

    /**
     * The size of array to be generated.
     */
    private static final int ARRAY_SIZE = 10;

    /**
     * A Random object used to generate random value.
     */
    private static final Random RANDOM = new Random();

    /**
     * The constructor is made private.
     */
    private TestHelper() {
        // empty
    }

    /**
     * Returns an array of double values generated by random.
     *
     * @return an array of double values generated by random
     */
    public static double[] getRandomDoubles() {
        double[] doubles = new double[ARRAY_SIZE];

        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = RANDOM.nextDouble();
        }

        return doubles;
    }

    /**
     * Returns an array of string generated by random.
     *
     * @return an array of string generated by random
     */
    public static String[] getRandomStrings() {
        String[] strings = new String[ARRAY_SIZE];
        byte[] bytes = new byte[ARRAY_SIZE];

        for (int i = 0; i < strings.length; i++) {
            RANDOM.nextBytes(bytes);
            strings[i] = new String(bytes);
        }

        return strings;
    }
}