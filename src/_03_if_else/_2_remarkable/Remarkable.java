package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

String remark1 = " had round glasses.";
String remark2 = " wrote some good songs.";
String remark3 = " made some music on his own later on.";
String remark4 = " joined the band late, I think.";
String name = JOptionPane.showInputDialog(null, "Who is your favorite Beatle? John, Paul, George, or Ringo?");

if(name.equalsIgnoreCase("John")){

	JOptionPane.showMessageDialog(null, name + remark1);
	
}	
	
if(name.equalsIgnoreCase("Paul")) {	
	JOptionPane.showMessageDialog(null, name + remark2);
}

if(name.equalsIgnoreCase("George")) {
	JOptionPane.showMessageDialog(null, name + remark3);
	
}

if(name.equalsIgnoreCase("Ringo")){
JOptionPane.showMessageDialog(null, name + remark4);

}

}



}

		// 1. Save something remarkable about each person in a variable.

		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. In a pop-up, tell the user what is remarkable about that person. 

	


