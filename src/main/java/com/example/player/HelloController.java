package com.example.player;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class HelloController {



    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<?> ListView;

    @FXML
    private Button nextButton;

    @FXML
    private Button pauseButton;

    @FXML
    private Button playButton;





    @FXML
    private Button previousButton;

    @FXML
    private ProgressBar songProgressBar;

    @FXML
    private ComboBox<String> speedBox;

    @FXML
    private Slider volumeSlider;

    @FXML
    void initialize() {


    }

}
