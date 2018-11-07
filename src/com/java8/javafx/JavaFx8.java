package com.java8.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class JavaFx8 extends Application {

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label("Hello JavaFx");
		label.setFont(new Font(60));
		Scene scene = new Scene(label);
		primaryStage.setTitle("Hello Shiv ....");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
