package com.example;

import org.teavm.interop.Export;
import org.teavm.interop.Import;

public class Hello {

    /**
     * TeaVM is not designed to port libraries, so we should always have a "main" method
     *
     * @param args Optional command line arguments
     */
    public static void main(String[] args) {
        // empty
    }

    @Import(module = "env", name = "printMessage")
    private static native void printMessage(String message);

    @Export(name = "hello")
    public static void hello() {
        printMessage("Hello, WebAssembly!");
    }

}
