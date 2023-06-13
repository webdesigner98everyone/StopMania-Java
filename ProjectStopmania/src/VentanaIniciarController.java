/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class VentanaIniciarController extends Application {

    /**
     * Initializes the controller class.
     */
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(new File("C:/Desarrollos/Java/ProjectStopmania/src/Ventana Iniciar.fxml").toURI().toURL());
        VentanaIntroController controller = new VentanaIntroController();
        loader.setController(controller);
        Parent root = loader.load();

        // Configuración adicional de la ventana y escena
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
