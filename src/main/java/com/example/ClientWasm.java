package com.example;

import org.teavm.jso.dom.html.HTMLDocument;
import org.teavm.jso.dom.html.HTMLElement;

import static org.teavm.jso.browser.Window.alert;

public class ClientWasm {

    /**
     * TeaVM is not designed to port libraries, so we should always have a "main" method
     *
     * @param args Optional command line arguments
     */
    public static void main(String[] args) {
        final HTMLDocument document = HTMLDocument.current();

        final HTMLElement div = document.createElement("div");

        final HTMLElement button = document.createElement("button");
        button.setInnerText("Say hello");
        button.addEventListener("click", event -> alert("Hello from JavaScript!"));
        button.setAttribute("style", "display:block; margin-top: 10px;");

        div.appendChild(document.createTextNode("I'm a TeaVM generated element"));
        div.appendChild(button);

        document.getBody().appendChild(div);
    }

}
