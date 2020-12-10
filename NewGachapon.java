package Gachapon;

import javax.swing.JOptionPane;

public class NewGachapon {

	public static void main(String[] args) {

		int primoGems = 160;
		int contadorS1 = 0;
		int contadorS = 0;

		String tirar = "";

		int tiradas = Integer.parseInt(JOptionPane.showInputDialog("¿How many trys do you want to do, 1 or 10?"));

		if (tiradas == 1) {
			do {
				
				primoGems += 160;

				int roll = Gachapon.getFirtsRoll();

				if (roll >= 47) {
					System.out.println(Banners.setGachapon()[Gachapon.getShitRoll()]);
					++contadorS;
					++contadorS1;
				}

				else if (roll >= 7 && roll <= 46)

				{
					System.out.println(Banners.setGachapon()[Gachapon.getMediumRoll()]);
					contadorS1 = 0;
					++contadorS;
				}

				else if (roll >= 0 && roll <= 6)

				{

					System.out.println(Banners.setGachapon()[Gachapon.getOpRoll()]);
					contadorS = 0;
					++contadorS1;
				}

				if (contadorS > 8) {

					System.out.println(Banners.setGachapon()[Gachapon.getMediumRoll()]);
					contadorS = 0;
					++contadorS1;
				}

				if (contadorS1 == 89) {

					System.out.println(Banners.setGachapon()[Gachapon.getOpRoll()]);
					contadorS1 = 0;
					++contadorS;
				}

				tirar = JOptionPane.showInputDialog("¿Do you want to try again?");

			} while (tirar.equalsIgnoreCase("Yes"));
		}

		if (tiradas == 10) {
			do {
				for (int i = 0; i < 9; i++)

				{
					
					primoGems += 160;

					int roll = Gachapon.getFirtsRoll();

					if (roll >= 47) {
						System.out.println(Banners.setGachapon()[Gachapon.getShitRoll()]);
						++contadorS;
						++contadorS1;
					}

					else if (roll >= 6 && roll <= 46)

					{

						System.out.println(Banners.setGachapon()[Gachapon.getMediumRoll()]);
						contadorS1 = 0;
						++contadorS;
					}

					else if (roll >= 0 && roll <= 6)

					{

						System.out.println(Banners.setGachapon()[Gachapon.getOpRoll()]);
						contadorS = 0;
						++contadorS1;
					}

					if (contadorS > 8) {

						System.out.println(Banners.setGachapon()[Gachapon.getMediumRoll()]);
						contadorS = 0;
						++contadorS1;
					}

					if (contadorS1 > 88) {

						System.out.println(Banners.setGachapon()[Gachapon.getOpRoll()]);
						contadorS1 = 0;
						++contadorS;
					}
				}

				tirar = JOptionPane.showInputDialog("¿Do you want to try again?");

			} while (tirar.equalsIgnoreCase("Yes"));
		}
		
		System.out.println("You have spent " + primoGems + " primogems. Come back when you want, looser.");
	}
}
