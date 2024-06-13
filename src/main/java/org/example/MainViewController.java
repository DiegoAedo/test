package org.example;

import javafx.fxml.FXML;
import javafx.scene.web.WebView;

public class MainViewController {
    @FXML
    private WebView webView;

    @FXML
    public void initialize() {
        webView.getEngine().load("https://www.example.com");
    }
}

