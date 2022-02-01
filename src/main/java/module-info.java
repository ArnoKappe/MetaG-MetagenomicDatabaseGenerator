module eu.kwrhannover.jufo.metag.metagenomicdatabasegenerator {
    requires javafx.controls;
    requires javafx.fxml;


    opens eu.kwrhannover.jufo.metag.metagenomicdatabasegenerator to javafx.fxml;
    exports eu.kwrhannover.jufo.metag.metagenomicdatabasegenerator;
}