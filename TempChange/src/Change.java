import java.io.*;
import java.util.*;

public class Change {

	public static void main(String[] args) throws FileNotFoundException{
		File weather = new File("./resources/weather.txt");
		System.out.println(weather.canRead()+ "");
		Scanner input = new Scanner(new File("./resources/weather.txt"));
		System.out.println("Please record the temperature");
		double first = input.nextDouble();
		for(int i = 0; i< 7; i++){
			System.out.println("Please record the temperature");
			double temp = input.nextDouble();
			double difference = (Math.round((temp-first)*100)) / (100.0);
			System.out.println(first + " to "+ temp + ", change = " + difference);
			first = temp;
		}

	}

	
}
