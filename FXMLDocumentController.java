/*

 */
package olamundojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Paula e Weden
 */
public class FXMLDocumentController implements Initializable {
    /*Nomeando AnchorPane controls Id*/
    @FXML
    private Label lblMensagem;
    private Button btmClik;
    
    /*inserindo ação para exibir mensagem */
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblMensagem.setText("Ola Mundo!");
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
