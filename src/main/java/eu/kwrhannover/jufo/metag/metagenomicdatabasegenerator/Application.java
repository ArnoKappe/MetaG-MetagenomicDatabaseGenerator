package eu.kwrhannover.jufo.metag.metagenomicdatabasegenerator;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("GeneratorUI.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 365);
        stage.setMinHeight(395);
        stage.setMinWidth(450);
        stage.setTitle("MetaG - Metagenomic Database Generator");
        stage.setScene(scene);
        stage.getIcons().add(new Image(Objects.requireNonNull(Application.class.getResourceAsStream("MetagenomicDatabaseGeneratorIcon.png"))));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}