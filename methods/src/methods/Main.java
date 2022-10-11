package methods;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int aranacak = 5;
		boolean varMi = false;

		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				varMi = true;
				break;
			}
		}

		if (varMi == true) {
			System.out.println(aranacak + ", sayılar dizisinde vardır.");
		} else {
			System.out.println(aranacak + ", sayılar dizisinde yoktur.");
		}

	}

	{


	}

}
