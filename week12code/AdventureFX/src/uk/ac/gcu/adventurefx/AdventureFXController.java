/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.ac.gcu.adventurefx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import uk.ac.gcu.adventure.Game;
//import uk.ac.gcu.adventure.Player;

/**
 *
 * @author Administrator
 */
public class AdventureFXController implements Initializable {
    
    private Game game;
    
//    @FXML
//    private Label label;
    @FXML private TextField commandfield;
    @FXML private TextArea displayarea;
    @FXML private Button button;
    
    @FXML
     private void handleButtonAction(ActionEvent event) {
        System.out.println("Entered: " + commandfield.getText());
        String text = commandfield.getText();
        if (text.equals("quit"))
        {
            quit();
        }
        displayarea.setText(game.getPlayer().takeTurn(text));
    }
     
     @FXML
     private void handleWestButtonAction(ActionEvent event) {
        System.out.println("You clicked GO WEST!");
        String text = "go west";
        displayarea.setText(game.getPlayer().takeTurn(text));
    }
     
     @FXML
     private void handleNorthButtonAction(ActionEvent event) {
        System.out.println("You clicked GO NORTH!");
        String text = "go north";
        displayarea.setText(game.getPlayer().takeTurn(text));
    }
     
     @FXML
     private void handleSouthButtonAction(ActionEvent event) {
        System.out.println("You clicked GO SOUTH!");
        String text = "go south";
        displayarea.setText(game.getPlayer().takeTurn(text));
    }
     
     @FXML
     private void handleEastButtonAction(ActionEvent event) {
        System.out.println("You clicked GO EAST!");
        String text = "go east";
        displayarea.setText(game.getPlayer().takeTurn(text));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        game = new Game();
    }    
    
    private void quit()
    {
        Stage stage = (Stage) button.getScene().getWindow();
        stage.close(); 
    }  
}
