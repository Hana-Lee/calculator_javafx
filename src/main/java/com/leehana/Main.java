package com.leehana;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by
 *
 * @author Hana Lee
 * @since 2018-10-26 15:33
 */
public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		var gridPanel = new GridPane();
		var scene = new Scene(gridPanel, 480, 640);
		stage.setTitle("계산기");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
