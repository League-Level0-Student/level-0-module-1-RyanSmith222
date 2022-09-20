package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	
	
String bday = JOptionPane.showInputDialog(null, "What is your birthday? Please enter in the form of (mm/dd).");	
	
if(bday.equals("9/19")) {
	JOptionPane.showMessageDialog(null, "Happy birthday!");
	}
else {	JOptionPane.showMessageDialog(null, "Happy Unbirthday!");
}
}
}







