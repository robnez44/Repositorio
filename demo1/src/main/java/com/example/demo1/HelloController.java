package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.media.*;
import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.Double.parseDouble;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnComprar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Label lblSubPapas;

    @FXML
    private Label lblSubAlas;

    @FXML
    private Label lblSubCarne;

    @FXML
    private Label lblSubVeg;

    @FXML
    private Label lblTotal;

    @FXML
    private RadioButton rdBotonEmpleado;

    @FXML
    private RadioButton rdBotonEstudiante;

    @FXML
    private RadioButton rdBotonEfectivo;

    @FXML
    private RadioButton rdBotonTarjeta;

    @FXML
    private Spinner<Integer> spnPapas;

    @FXML
    private Spinner<Integer> spnAlas;

    @FXML
    private Spinner<Integer> spnVegetales;

    @FXML
    private Spinner<Integer> spnCarne;

    @FXML
    private TextField txtCliente;

    private MediaPlayer mediaPlayer;

    private Media mediaError;

    private Media mediaInfo;

    private Media mediaWarning;


    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ToggleGroup opciones = new ToggleGroup();
        ToggleGroup opciones2 = new ToggleGroup();
        rdBotonEmpleado.setToggleGroup(opciones2);
        rdBotonEstudiante.setToggleGroup(opciones2);
        rdBotonEfectivo.setToggleGroup(opciones);
        rdBotonTarjeta.setToggleGroup(opciones);

        // Adjust the path to the sounds
        mediaError = new Media(getClass().getResource("/com/example/demo1/sounds/error.wav").toExternalForm());
        mediaWarning = new Media(getClass().getResource("/com/example/demo1/sounds/warning.wav").toExternalForm());
        mediaInfo = new Media(getClass().getResource("/com/example/demo1/sounds/information.wav").toExternalForm());

        SpinnerValueFactory<Integer> valueFactory1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0);
        spnAlas.setValueFactory(valueFactory1);

        SpinnerValueFactory<Integer> valueFactory2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0);
        spnCarne.setValueFactory(valueFactory2);

        SpinnerValueFactory<Integer> valueFactory3 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0);
        spnPapas.setValueFactory(valueFactory3);

        SpinnerValueFactory<Integer> valueFactory4 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0);
        spnVegetales.setValueFactory(valueFactory4);

        spnPapas.valueProperty().addListener((observable, oldValue, newValue) -> {
            double subTotalPapas = newValue * 1.25;
            lblSubPapas.setText(String.valueOf("$" + subTotalPapas));
            actualizarTotal();
        });

        spnCarne.valueProperty().addListener((observable, oldValue, newValue) -> {
            double subTotalCarne = newValue * 2.25;
            lblSubCarne.setText(String.valueOf("$" + subTotalCarne));
            actualizarTotal();
        });

        spnAlas.valueProperty().addListener((observable, oldValue, newValue) -> {
            double subTotalAlas = newValue * 1.75;
            lblSubAlas.setText(String.valueOf("$" + subTotalAlas));
            actualizarTotal();
        });

        spnVegetales.valueProperty().addListener((observable, oldValue, newValue) -> {
            double subTotalVeg = newValue * 0.75;
            lblSubVeg.setText(String.valueOf("$" + subTotalVeg));
            actualizarTotal();
        });
    }

    @FXML
    void btnComprar(ActionEvent event) {
        if (txtCliente.getText().isEmpty()) {
            mediaPlayer = new MediaPlayer(mediaError);
            mediaPlayer.play();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Cafeteria UCA");
            alert.setHeaderText(null);
            alert.setContentText("Debe digitar su nombre!");
            alert.showAndWait();
        } else if (subTotal() <= 0) {
            mediaPlayer = new MediaPlayer(mediaError);
            mediaPlayer.play();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Cafeteria UCA");
            alert.setHeaderText(null);
            alert.setContentText("Debe haber seleccionado algo!");
            alert.showAndWait();
        }else if (!rdBotonEstudiante.isSelected() && !rdBotonEmpleado.isSelected()) {
            mediaPlayer = new MediaPlayer(mediaError);
            mediaPlayer.play();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Cafeteria UCA");
            alert.setHeaderText(null);
            alert.setContentText("Debe seleccionar un tipo de cliente!");
            alert.showAndWait();
        }
        else if (!rdBotonTarjeta.isSelected() && !rdBotonEfectivo.isSelected()) {
            mediaPlayer = new MediaPlayer(mediaError);
            mediaPlayer.play();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Cafeteria UCA");
            alert.setHeaderText(null);
            alert.setContentText("Debe seleccionar un metodo de pago!");
            alert.showAndWait();
        }
        else {
            double descuento = rdBotonEmpleado.isSelected() ? Math.round((0.1 * subTotal()) * 100.0) / 100.0 : 0;
            double total = Math.round((subTotal() - descuento) * 100.0) / 100.0;
            mediaPlayer = new MediaPlayer(mediaInfo);
            mediaPlayer.play();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Cafeteria UCA");
            alert.setHeaderText(null);
            alert.setContentText("Bienvenido " + txtCliente.getText() +
                    "\nSubtotal: $" + subTotal() +
                    "\nDescuento: $" + descuento +
                    "\nTotal: $" + total +
                    "\nForma de pago: " + (rdBotonEfectivo.isSelected() ? "Efectivo" : "Tarjeta") +
                    "\nGracias por su compra!");
            alert.showAndWait();
            limpiar();
        }
    }

    @FXML
    void btnLimpiar(ActionEvent event) { limpiar(); }

    @FXML
    void rdEmpleado_selected(ActionEvent event) { actualizarTotal(); }

    @FXML
    void rdEstudiante_selected(ActionEvent event) { actualizarTotal(); }

    private void limpiar(){
        spnPapas.getValueFactory().setValue(0);
        spnAlas.getValueFactory().setValue(0);
        spnVegetales.getValueFactory().setValue(0);
        spnCarne.getValueFactory().setValue(0);
        txtCliente.clear();
        lblTotal.setText("$0.00");
        lblSubPapas.setText("$0.00");
        lblSubAlas.setText("$0.00");
        lblSubCarne.setText("$0.00");
        lblSubVeg.setText("$0.00");
        rdBotonEmpleado.setSelected(false);
        rdBotonEstudiante.setSelected(false);
        rdBotonEfectivo.setSelected(false);
        rdBotonTarjeta.setSelected(false);
    }

    private double subTotal(){
        double subTotalPapas = parseDouble(lblSubPapas.getText().substring(1));
        double subTotalAlas = parseDouble(lblSubAlas.getText().substring(1));
        double subTotalVeg = parseDouble(lblSubVeg.getText().substring(1));
        double subTotalCarne = parseDouble(lblSubCarne.getText().substring(1));

        return subTotalAlas + subTotalPapas + subTotalVeg + subTotalCarne;
    }

    private void actualizarTotal(){
        double total = Math.round(subTotal() * 100.0) / 100.0;

        if(rdBotonEmpleado.isSelected()){
            total = Math.round((total * 0.9) * 100.0) /100.0;
        }

        lblTotal.setText(String.valueOf("$" + total));
    }
}
