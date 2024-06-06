package org.example.labo11;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HelloController{
    @FXML
    private Button sortByNameButton;

    @FXML
    private Button sortBySalaryButton;

    @FXML
    private ListView<String> listView;

    private List<Empleado> empleados = Arrays.asList(
            new Empleado("Marta", 40, 1500.89),
            new Empleado("Enrique", 35, 500.5),
            new Empleado("María", 32, 450.0),
            new Empleado("Melissa", 56, 2000.0),
            new Empleado("Víctor", 28, 1200.0),
            new Empleado("Daniel", 46, 1000.0),
            new Empleado("Rebeca", 41, 800.0),
            new Empleado("Eduardo", 25, 1500.89)
    );

    @FXML
    public void initialize() {
        updateListView();

        sortByNameButton.setOnAction(event -> {
            Collections.sort(empleados);
            updateListView();
        });

        sortBySalaryButton.setOnAction(event -> {
            empleados.sort(Comparator.comparingDouble(Empleado::getSalario));
            updateListView();
        });
    }

    private void updateListView() {
        listView.getItems().clear();
        for (Empleado empleado : empleados) {
            listView.getItems().add(empleado.toString());
        }
    }
    @FXML
    private void onHelloButtonClick() {
    }
}