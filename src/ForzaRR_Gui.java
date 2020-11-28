import java.util.HashMap;
import java.util.Map;

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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 * Non Git
 * @author Maximilian Hartmann
 * @version 0.1
 */
public class ForzaRR_Gui extends Application {
	
	
	public static void main(String[]args) {
		
		launch(args);
	}
	
	@FXML
	private Label pcLabel = new Label() ; 
	@FXML
	private Label rtLabel = new Label();
	@FXML
	private Label ccLabel = new Label();
	@FXML
	private ImageView pcImage = new ImageView();
	
	@FXML
	protected void forzaGenerate(ActionEvent e) {
		Map<String, String> generatedRace = ForzaRR_Logic.logicTester();
		ccLabel.setText(generatedRace.get("CC"));
		rtLabel.setText(generatedRace.get("RT"));
		
		setPerformanceClass(generatedRace);
		
		System.out.println("generate");
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Parent xmlLayout=FXMLLoader.load(getClass().getResource("ForzaRR_Gui.fxml"));
		Scene scene1= new Scene(xmlLayout);
		primaryStage.setScene(scene1);
		primaryStage.show();
		
		
	}
	
	/*
	 * Sets the matching Image to the generated performance class
	 * @param m A map/dictionary of the generated stuff
	 */
	private void setPerformanceClass(Map m){
		//pcLabel.setText("Performance Class: " +m.get("PC"));
		Image image = new Image(getClass().getResource(m.get("PC")+".jpg").toExternalForm());
		pcImage.setImage(image);
	}

	
}
