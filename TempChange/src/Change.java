import java.io.*;
import java.util.*;

public class Change {

	public static void main(String[] args) throws FileNotFoundException{
		File weather = new File("./resources/weather.txt");
		System.out.println(weather.canRead()+ "");
		//new File("./resources/weather.txt")
		Scanner input = new Scanner(System.in);
		System.out.println("Please record the temperature");
		double first = input.nextDouble();
		for(int i = 0; i< 7; i++){
			System.out.println("Please record the temperature");
			double temp = input.nextDouble();
			System.out.println(first + " to "+ temp + ", change = " + (double)(temp-first));
			first = temp;
		}

	}

}