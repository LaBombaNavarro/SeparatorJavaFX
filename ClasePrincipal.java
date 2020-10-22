/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package separator;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ClasePrincipal extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  public void start(Stage stage) {
      
    Label label1 = new Label("Label 1");
    Separator hsep = new Separator();
    
    hsep.setOrientation(Orientation.HORIZONTAL); //HORIZONTAL, VERTICAL
    hsep.setHalignment(HPos.RIGHT); //LEFT, RIGHT, CENTER
    //sep1.setMaxWidth(75);
    //sep1.setMaxHeight(60); No serviría ya que es horizontal
    hsep.setMaxSize(75, 60); //width, height
    
    Label label2 = new Label("Label 2");
    
    Separator vsep= new Separator();
    vsep.setOrientation(hsep.getOrientation());
    vsep.setHalignment(hsep.getHalignment());
    vsep.setMaxWidth(hsep.getMaxWidth());
    
    Label label3 = new Label("Label 3");
    
    VBox vBox = new VBox(label1, hsep, label2,vsep,label3);
    Scene scene = new Scene(vBox);
    
    stage.setScene(scene);
    stage.show();
  }
}
