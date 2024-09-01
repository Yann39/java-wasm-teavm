package com.example;

import org.teavm.interop.Export;

public class SumWasm {

    /**
     * TeaVM is not designed to port libraries, so we should always have a {@code main} method.
     *
     * @param args Optional command line arguments
     */
    public static void main(String[] args) {
        // empty
    }

    /**
     * Method that simply sums the 2 passed integers.<br>
     * It is exported to be accessible from the WebAssembly module.
     */
    @Export(name = "add")
    public static int add(int a, int b) {
        return a + b;
    }

}
