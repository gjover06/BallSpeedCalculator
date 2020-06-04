/**Author:George Samu
Date:5/30/2020
Purpose: Chapter 3 number 9

*/

import java.util.Scanner;

public class BallSpeedCalculator
{
	public static void main (String[]args)
	{
	final double gravity=9.78049;
					
	//creating a scanner to collect data from the keyboard
	Scanner keyboard=new Scanner(System.in);
	System.out.println("What is the initial Velocity(Vo): ");
	double Vo=keyboard.nextDouble();
	
	System.out.println("Initial angle in degrees: ");
	double degreeo=keyboard.nextDouble();
	
	System.out.println("What is the inital coordinates Xo: ");
	double Xo=keyboard.nextDouble();
	
	System.out.println("What is the initial coordinates Yo: ");
	double Yo=keyboard.nextDouble();
	
	System.out.println("What is the initalheight(h0) meters: ");
	double h0=keyboard.nextDouble();
	
	System.out.println("What is the time which the ball's status is desired Seconds: ");
	double time=keyboard.nextDouble();
	
	//Covert to radians
	double degreesToRadians=Math.toRadians(degreeo);
		
	//The X coordinate
	//Xt=time * Vo * cos(degreesToRadians)
	
     double Xt=Xo + time * Vo * Math.cos(degreesToRadians);
	
	//The Y coordinate
	//Yt=time * Vo * sin(degreeo)-gravity*time^2/2
	
	double Yt=Yo + time * Vo *Math.sin(degreesToRadians)-gravity * Math.pow(time,2)/2;
	
	//Velocity 
	// Vt^2=Vo^2 * cos^2(degreesToRadians) +(Vo*sinVo - gravity*t)^2
	//Vt^2Final= Math.pow(Vt^2,2);
	double lastEquation=Vo*Math.sin(Vo)-gravity*time;

	
	double VtSquared= Math.pow(Vo,2) * Math.pow(Math.cos(degreesToRadians),2)+ Math.pow(lastEquation,2);
	
	double VtSquaredFinal=Math.sqrt(VtSquared);
	
	double heightAboveGround= Yt + h0;
	
	//Printing results
	
	System.out.println("The inital velocity (Vo) is " + Vo + " m/s");
	System.out.println("The inital angle and height are " + degreeo +
						"degrees  and " + h0 + " meters respectfully");
	System.out.println("The conversion from degree to radians: " + degreesToRadians);
	System.out.println("The time(t) at which the ball's status is desired: "
						+ time);
	System.out.println("The height above ground is: " + heightAboveGround);
	System.out.println("The ball's inital coordinates(Xo,Yo) are  " + "(" + Xo + ","+ Yo + ")");
	
	System.out.println("If the ball is in motion its coordinates are ("+ Xt + "," + Yt + ")");
	System.out.println("The velocity is (Vt)^2 is: "+ VtSquared + "m/s^2");
	System.out.println("The final velocity is (Vt) is: "+ VtSquaredFinal + "m/s^2");
	
	
						
	}//end main
}//end BallVelocityCalculator, or start typing.