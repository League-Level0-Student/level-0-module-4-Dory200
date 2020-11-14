package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
        String day = JOptionPane.showInputDialog("what day is it");
		// Set the boolean isWeekend based on the value they enter
		if(day.equals("saturday")||day.equals("sunday")) {
			JOptionPane.showMessageDialog(null, "sleep in");
		}
		else {
			JOptionPane.showMessageDialog(null, "get out of bed it really do be time for school tho");
		}
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
		String percent = JOptionPane.showInputDialog("what percentage did you get on your last exam?");
		int p = Integer.parseInt(percent);
		if(p>70) {
			passedExam = true;
			JOptionPane.showMessageDialog(null, "congrats");
		}
		else {
			JOptionPane.showMessageDialog(null, "better luck next time");
		}
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
				JOptionPane.showMessageDialog(null, "game is over");
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed = false;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String c = JOptionPane.showInputDialog("what color do you want to draw with");
		if(c.equals("red")) {
			isRed = true;
		}
		boolean isSquare = false;
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String sq = JOptionPane.showInputDialog("what shape do you want to draw");
		if(sq.equals("square")) {
			isSquare = true;
		}
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		if(isRed==true&&isSquare==true) {
			drawRedSquare();
		}
		else {
			JOptionPane.showMessageDialog(null, "idk how to draw that");
		}
		// otherwise, tell the user you don't know how to draw that shape
		

	
	}
	
	static void drawRedSquare() {
		Robot rob = new Robot();
		rob.hide();
		rob.setPenColor(255, 0, 0);
		rob.penDown();
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		// Complete the rest of this method
	
	}	
}
