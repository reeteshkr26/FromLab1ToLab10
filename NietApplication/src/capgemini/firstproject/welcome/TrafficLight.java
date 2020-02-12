package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLight {
	InputStreamReader isr;
	BufferedReader buff;
	public static void main(String[] args) {
		TrafficLight tl=new TrafficLight();
		tl.isr=new InputStreamReader(System.in);
		tl.buff=new BufferedReader(tl.isr);
		tl.checkTrafficLight();

	}
	public void checkTrafficLight() {
		try {
			String s=buff.readLine();
			switch(s) {
			case "red":
				System.out.print("Stop");
				break;
			case "yellow":
				System.out.print("Ready");
				break;
			case "green":
				System.out.print("Go");
				break;	
			default:
				break;
			}
		} catch (NumberFormatException | IOException e) {
			
			e.printStackTrace();
		}
		
			
	
	}

}
