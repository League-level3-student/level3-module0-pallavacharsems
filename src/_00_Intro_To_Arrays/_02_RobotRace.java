package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
public static void main(String[] args) {
	int num = 0;
	Random s = new Random();
	num = s.nextInt(50);
	Robot[] ice = new Robot[5]; 
for (int i = 0; i < ice.length; i++) {
	ice[i] = new Robot();
	ice[i].setX(50);
	ice[i].setY(300);
	ice[i].setSpeed(100);
}

boolean winner = false;
while(winner == false) {
for (int i = 0; i < ice.length; i++) {
	num = s.nextInt(50);
	for (int j = 0; j <num; j++) {
		
	ice[i].move(1);
	ice[i].turn(1);
	
	if(ice[i].getX() == 50 && ice[i].getY() == 300) {
		JOptionPane.showMessageDialog(null, "Robot " + i + " won the race!!!");
		JOptionPane.showMessageDialog(null, "Robot " + i + " is throwing a party at his house. Everyone come!!!");
		winner = true;
		break;
	}
	}
	
	
}
}

}
	
}
        // 2. create an array of 5 robots.

        // 3. use a for loop to initialize the robots.

        // 4. make each robot start at the bottom of the screen, side by side, facing up
    
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
    
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.


