package com.leehana;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by
 *
 * @author Hana Lee
 * @since 2018-10-26 15:33
 */
public class Main extends Application {

	@Override
	public void start(Stage stage) {
		var mainContainer = new GridPane();
		mainContainer.setStyle("-fx-background-color: black");

		var lblResult = new Label("0");
		lblResult.setStyle("-fx-background-color: white");

		var lblContainer = new VBox(lblResult);
		lblContainer.setStyle("-fx-background-color: pink");

		var btnContainer = new GridPane();
		btnContainer.setHgap(5L);
		btnContainer.setVgap(5L);
		btnContainer.setStyle("-fx-background-color: tomato;");
		btnContainer.setGridLinesVisible(true);

		var btn0 = new Button("0");
		var btn1 = new Button("1");
		var btn2 = new Button("2");
		var btn3 = new Button("3");
		var btn4 = new Button("4");
		var btn5 = new Button("5");
		var btn6 = new Button("6");
		var btn7 = new Button("7");
		var btn8 = new Button("8");
		var btn9 = new Button("9");
		var btnDot = new Button(".");

		var btnClear = new Button("AC");
		var btnNegativePositive = new Button("+/-");
		var btnPercentage = new Button("%");
		var btnDivision = new Button("/");
		var btnMultiply = new Button("X");
		var btnMinus = new Button("-");
		var btnPlus = new Button("+");
		var btnResult = new Button("=");

		btnContainer.add(btnClear, 0, 0);
		btnContainer.add(btnNegativePositive, 1, 0);
		btnContainer.add(btnPercentage, 2, 0);
		btnContainer.add(btnDivision, 3, 0);

		btnContainer.add(btn7, 0, 1);
		btnContainer.add(btn8, 1, 1);
		btnContainer.add(btn9, 2, 1);
		btnContainer.add(btnMultiply, 3, 1);

		btnContainer.add(btn4, 0, 2);
		btnContainer.add(btn5, 1, 2);
		btnContainer.add(btn6, 2, 2);
		btnContainer.add(btnMinus, 3, 2);

		btnContainer.add(btn1, 0, 3);
		btnContainer.add(btn2, 1, 3);
		btnContainer.add(btn3, 2, 3);
		btnContainer.add(btnPlus, 3, 3);

		btnContainer.add(btn0, 0, 4, 2, 1);
		btnContainer.add(btnDot, 2, 4);
		btnContainer.add(btnResult, 3, 4);

		var body = new VBox(lblContainer, btnContainer);
		mainContainer.add(body, 0, 0);

		stage.setTitle("계산기");
		stage.setScene(new Scene(mainContainer, 320, 480));
		stage.setResizable(false);
		stage.setFullScreen(false);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
