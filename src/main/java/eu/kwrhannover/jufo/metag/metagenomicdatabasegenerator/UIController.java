package eu.kwrhannover.jufo.metag.metagenomicdatabasegenerator;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;


public class UIController {
    @FXML
    private Button buttonGenerate;
    @FXML
    private ProgressBar progressBar;
    @FXML
    private TextField textFieldPath;
    @FXML
    private Slider sliderDatabases;
    @FXML
    private Label labelDatabases;
    @FXML
    private Slider sliderReads;
    @FXML
    private Label labelReads;
    @FXML
    private CheckBox checkBoxCreateFolder;
    @FXML
    private Label labelOutput;
    @FXML
    private VBox vBox;

    @FXML
    protected void onGenerateButtonClick() {
        if (Objects.equals(textFieldPath.getText(), "")) {
            System.out.println("Choose directory first.");
            labelOutput.setText("Choose directory first.");
        } else {
            isSettingsWindowActive(false);
            labelOutput.setText("");
            Path path = Path.of(textFieldPath.getText());
            int databases = (int) sliderDatabases.getValue();
            int reads = (int) sliderReads.getValue();
            boolean createFolder = checkBoxCreateFolder.isSelected();

            buttonGenerate.setText("GENERATING...");
            Thread thread = new Thread(() -> {
                Generator.generateDatabases(path, databases, reads, createFolder, progress -> Platform.runLater(() -> progressBar.setProgress(progress)));
            Platform.runLater(this::completeCreating);
            });
            thread.setDaemon(true);
            thread.start();
        }
    }

    private void completeCreating() {
        isSettingsWindowActive(true);
        progressBar.setProgress(0.0);
        buttonGenerate.setText("GENERATE");
    }

    @FXML
    protected void isSettingsWindowActive(boolean activityStatus){
        vBox.setDisable(!activityStatus);
        buttonGenerate.setDisable(!activityStatus);
    }

    @FXML
    protected void onSliderDatabases() {
        labelDatabases.setText(Integer.toString((int) sliderDatabases.getValue()));
    }

    @FXML
    protected void onSliderReads() {
        labelReads.setText(Integer.toString((int) sliderReads.getValue()));
    }

    @FXML
    protected void onButtonBrowseClick() {
        DirectoryChooser directoryChooser = new DirectoryChooser();
        Path dir = Paths.get(System.getProperty("user.home", "."));
        directoryChooser.setInitialDirectory(dir.toFile());
        Path path = directoryChooser.showDialog(null).toPath();
        textFieldPath.setText(path.toString());
    }
}