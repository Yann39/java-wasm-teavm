package com.example;

import org.teavm.interop.Export;
import org.teavm.interop.Import;
import org.teavm.jso.JSBody;

public class HelloWasm {

    /**
     * TeaVM is not designed to port libraries, so we should always have a {@code main} method.
     *
     * @param args Optional command line arguments
     */
    public static void main(String[] args) {
        // empty
    }

    /**
     * Method that simply outputs a message by calling the private native {@code printMessage} method.<br>
     * It is exported to be accessible from the WebAssembly module.
     */
    @Export(name = "hello")
    public static void hello() {
        printMessage("Hello, WebAssembly!");
    }

    /**
     * Native method that is expected to print the message specified as parameter.<br>
     * It is a native method whose implementation will be written in JavaScript.
     *
     * @param message The message to be printed
     */
    @Import(module = "env", name = "printMessage")
    @JSBody(params = {"message"}, script = "printMessage(message)")
    private static native void printMessage(String message);

}