import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.collections.*; 
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class ForzaRR_Gui extends Application {
	
	
	public static void main(String[]args) {
		
		launch(args);
	}
	@FXML
	protected void cancelbttn(ActionEvent e) {
		System.out.println("cancel");
		
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		choice_box_controller();
		
		Parent xmlLayout=FXMLLoader.load(getClass().getResource("settings0_0_1.fxml"));
		Scene scene1= new Scene(xmlLayout);
		primaryStage.setScene(scene1);
		primaryStage.show();
		
		
	}
	public void choice_box_controller(){

	}
	
	
	
}
