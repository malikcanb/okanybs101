package finalsoru1;

import java.util.Scanner;

public class finalcevap {

	public static void main(String[] args) {
		Scanner tara = new Scanner(System.in);
		System.out.println("Ka� ki�i girilecek?");
		int gsayi= tara.nextInt();
		int yas [] = new int[gsayi];
		int maas[] = new int [gsayi];
		String [] isim = new String[gsayi];
		String [] meslek= new String[gsayi];
		String [] cinsiyet= new String[gsayi];
		for(int i=0;i<gsayi;i++) {
			System.out.println("isim giriniz");
			isim[i] = tara.next();
			System.out.println("meslek giriniz");
			meslek[i]= tara.next();
			System.out.println("Cinsiyet giriniz");
			cinsiyet[i]= tara.next();
			System.out.println("Ya� giriniz");
			yas[i]= tara.nextInt();
			System.out.println("Maa� giriniz");
			maas[i]= tara.nextInt();
		}
		System.out.println("Ne istiyorsun? 1- listeleme 2- isim ile arama 3 -ya�lar�n ortu 4-��retmenlerin bilgileri 5-erkeklerin maa� ortu ");
		int semizotu = tara.nextInt();
		switch(semizotu) {
		case 1:
			listeleme(isim,yas,meslek,maas,cinsiyet,gsayi);
			break;
		case 2:
			System.out.println("Kimi ar�yorsunuz?");
			String arananad= tara.next();
			arama(isim,yas,meslek,maas,cinsiyet,gsayi,arananad);
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		}
	}

	private static void arama(String[] isim, int[] yas, String[] meslek, int[] maas, String[] cinsiyet, int gsayi,
			String arananad) {
			for(int i=0;i<gsayi;i++) {
				if(arananad.equalsIgnoreCase(isim[i])) {
					System.out.println("�sim="+isim[i]);
					System.out.println("Ya�="+yas[i]);
					System.out.println("Mesle�iniz="+meslek[i]);
					System.out.println("Cinsiyetiniz="+cinsiyet[i]);
					System.out.println("maa��n�z="+maas[i]);
				}
			}
	}

	private static void listeleme(String[] isim, int[] yas, String[] meslek, int[] maas, String[] cinsiyet, int gsayi) {
		for(int i=0;i<gsayi;i++)
		{
		System.out.println("�sim="+isim[i]);
		System.out.println("Ya�="+yas[i]);
		System.out.println("Mesle�iniz="+meslek[i]);
		System.out.println("Cinsiyetiniz="+cinsiyet[i]);
		System.out.println("maa��n�z="+maas[i]);
		}
	}

}
