package com.java8.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LayoutExample extends Application {

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label1 = new Label("Hello Shiv");
		label1.setFont(new Font(55));
		
		Label label2 = new Label("Hello Alka");
		label2.setFont(new Font(55));
		
		VBox vbox = new VBox(label1, label2);
		
		primaryStage.setScene(new Scene(vbox));
		primaryStage.setTitle("Family");
		primaryStage.setResizable(false);
		primaryStage.setFullScreen(true);
		primaryStage.show();
		
	}

}
