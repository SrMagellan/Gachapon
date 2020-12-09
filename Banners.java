package Gachapon;

public class Banners {

	public static String[] setGachapon()

	{

		String[] gachapon = new String[1000];

		gachapon[0] = "KLEE";
		gachapon[1] = "DILUC";
		gachapon[2] = "MONA";
		gachapon[3] = "QIQI";
		gachapon[4] = "KECHING";
		gachapon[5] = "JEAN";

		gachapon[6] = "Sacarosa";
		gachapon[7] = "Sacarosa";
		gachapon[8] = "Xingchiu";
		gachapon[9] = "Xingchiu";
		gachapon[10] = "Bennett";
		gachapon[11] = "Bennett";
		gachapon[12] = "Ninguang";
		gachapon[13] = "Ninguang";
		gachapon[10] = "Xiangling";
		gachapon[11] = "Xiangling";
		gachapon[12] = "Bárbara";
		gachapon[13] = "Bárbara";
		gachapon[14] = "Noelle";
		gachapon[15] = "Noelle";
		gachapon[16] = "Chonguyn";
		gachapon[17] = "Chonguyn";
		gachapon[18] = "Fischl";
		gachapon[19] = "Fischl";
		gachapon[20] = "Beidou";
		gachapon[21] = "Beidou";
		gachapon[22] = "Razor";
		gachapon[23] = "Razor";

		gachapon[24] = "4 STARS WEAPON";

		gachapon[47] = "3 STARS WEAPON";

		for (int i = 47; i < 1000; i++) {
			gachapon[i] = "3 STARS WEAPON";
		}

		for (int i = 24; i < 47; i++) {
			gachapon[i] = "4 STARS WEAPON";

		}

		return gachapon;
	}
}
