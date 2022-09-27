package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

int score = 0;	
int round = 1;
String input = JOptionPane.showInputDialog(null, "What can travel around the world while staying in one corner?");		
		
if(input.equalsIgnoreCase("stamp") || input.equalsIgnoreCase("a stamp")) {
JOptionPane.showMessageDialog(null, "Correct!");
score +=1;


}
else {
	JOptionPane.showMessageDialog(null, "Wrong! The correct answer is a stamp.");
	score -= 1;
	
}
round += 1;
JOptionPane.showMessageDialog(null, "Your score is " + score + ". Onto round " + round + ".");

String input2 = JOptionPane.showInputDialog(null, "What has an face and hands, but no legs or feet?");

		
		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

