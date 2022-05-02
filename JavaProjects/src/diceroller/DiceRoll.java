package diceroller;

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class DiceRoll extends Application {
	
	private Button d20,d12,d10,d8,d6,d4;
	private Text message;
	private Text greeting;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		Font font = Font.font("Helvetica", FontWeight.BOLD, FontPosture.REGULAR, 36);
		
		
		
		Text greeting = new Text("DnD Dice Roller");
		greeting.setFont(font);
		
		Text message = new Text();
		message.setText("");
		message.setX(250);
		message.setY(250);
		message.setFont(font);
		
	
		
		
		Button d20 = new Button("d20");
		d20.setOnAction(new EventHandler() {
			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				int num20 = rand.nextInt(20) + 1;
				message.setText("" + num20);
			}
		});
		
		Button d12 = new Button("d12");
		d12.setOnAction(new EventHandler() {
			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				int num12 = rand.nextInt(12) + 1;
				message.setText("" + num12);
			}
		});
		
		Button d10 = new Button("d10");
		d10.setOnAction(new EventHandler() {
			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				int num10 = rand.nextInt(10) + 1;
				message.setText("" + num10);
			}
		});
		
		Button d8 = new Button("d8");
		d8.setOnAction(new EventHandler() {
			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				int num8 = rand.nextInt(8) + 1;
				message.setText("" + num8);
			}
		});
		Button d6 = new Button("d6");
		d6.setOnAction(new EventHandler() {
			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				int num6 = rand.nextInt(6) + 1;
				message.setText("" + num6);
			}
		});
		
		Button d4 = new Button("d4");
		d4.setOnAction(new EventHandler() {
			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				int num4 = rand.nextInt(4) + 1;
				message.setText("" + num4);
			}
		});
		
		HBox buttons = new HBox();
		buttons.getChildren().addAll(d20, d12, d10, d8, d6, d4);
		buttons.setAlignment(Pos.CENTER);
		buttons.setSpacing(30);
		
		VBox text = new VBox(greeting, message);
		text.setAlignment(Pos.TOP_CENTER);
		
		VBox root = new VBox(text, buttons);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(10);
		
		
		Scene scene = new Scene(root, 500, 500);
		
		primaryStage.setTitle("Dice Roller");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);

	}

}
