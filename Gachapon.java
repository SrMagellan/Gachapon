package Gachapon;

import java.util.Random;

public class Gachapon {

	public static int getOpRoll() {
		double start = 0;
		double end = 5;
		double random = new Random().nextDouble();
		double result = start + (random * (end - start));

		return (int) result;
	}

	public static int getMediumRoll() {
		double start = 6;
		double end = 46;
		double random = new Random().nextDouble();
		double result = start + (random * (end - start));

		return (int) result;
	}

	public static int getShitRoll() {
		double start = 47;
		double end = 1000;
		double random = new Random().nextDouble();
		double result = start + (random * (end - start));

		return (int) result;
	}

	public static int getFirtsRoll() {
		double start = 0;
		double end = 1000;
		double random = new Random().nextDouble();
		double result = start + (random * (end - start));

		return (int) result;
	}
}
