package jrpg;

import javax.swing.*;

public class GUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame("RPG");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		JButton startbutton = new JButton("Start");
		frame.getContentPane().add(startbutton);
		frame.setVisible(true);
		if(startbutton.getModel().isPressed()) {
			System.out.println("Pressed");
		}
	}

}

/**
 * public void start(Stage primaryStage) { Button startButton = new
 * Button("Start Game"); Button exitButton = new Button("Exit Game");
 * 
 * VBox root = new VBox(10); root.getChildren().addAll(startButton, exitButton);
 * 
 * Scene scene = new Scene(root, 400, 300);
 * 
 * primaryStage.setScene(scene); primaryStage.setTitle("RPG");
 * primaryStage.show(); }
 * 
 * public static void main(String[] args) { launch(args); }
 */