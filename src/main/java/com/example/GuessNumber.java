package com.example;

import org.teavm.interop.Export;
import org.teavm.interop.Import;

public class GuessNumber {

    /**
     * TeaVM is not designed to port libraries, so we should always have a "main" method
     *
     * @param args Optional command line arguments
     */
    public static void main(String[] args) {
        // empty
    }

    /**
     * This method will be invoked by the browser.
     *
     * @param range The range of the magic number
     */
    @Export(name = "getMagicNumber")
    public static void getMagicNumber(int range) {
        /* Pretend this is intense, complex logic. */
        int magicNumber = (range / 2) + (range % 3);
        setMagicNumber(magicNumber);
    }

    /**
     * This method maps to a JavaScript method in a web page.
     *
     * @param number The magic number
     */
    @Import(module = "env", name = "setMagicNumber")
    private static native void setMagicNumber(int number);

}