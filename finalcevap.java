package finalsoru1;

import java.util.Scanner;

public class finalcevap {

	public static void main(String[] args) {
		Scanner tara = new Scanner(System.in);
		System.out.println("Kaç kişi girilecek?");
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
			System.out.println("Yaş giriniz");
			yas[i]= tara.nextInt();
			System.out.println("Maaş giriniz");
			maas[i]= tara.nextInt();
		}
		for(;;) {
		System.out.println("Ne istiyorsun? 1- listeleme 2- isim ile arama 3 -yaşların ortu 4-öğretmenlerin bilgileri 5-erkeklerin maaş ortu ");
		int semizotu = tara.nextInt();
		switch(semizotu) {
		case 1:
			listeleme(isim,yas,meslek,maas,cinsiyet,gsayi);
			break;
		case 2:
			System.out.println("Kimi arıyorsunuz?");
			String arananad= tara.next();
			arama(isim,yas,meslek,maas,cinsiyet,gsayi,arananad);
			break;
		case 3:
			yasort(yas,gsayi);
			break;
		case 4:
			ogretmenbilgileri(isim,yas,meslek,maas,cinsiyet,gsayi);
			
			break;
		case 5:
			erkekmaasort(isim,yas,meslek,maas,cinsiyet,gsayi);
			
			break;
		}
		}
	}

	private static void erkekmaasort(String[] isim, int[] yas, String[] meslek, int[] maas, String[] cinsiyet,
			int gsayi) {
		int erkeksayisi=0, erkekmaastop=0;
		for(int i=0;i<gsayi;i++) {
			if(cinsiyet[i]=="erkek") {
				erkekmaastop=erkekmaastop+maas[i];
				erkeksayisi++;
				System.out.println("erkeklerin maaş ortu="+erkekmaastop/erkeksayisi);
			}
		}
	}

	private static void ogretmenbilgileri(String[] isim, int[] yas, String[] meslek, int[] maas, String[] cinsiyet,
			int gsayi) {
		for(int i=0;i<gsayi;i++) {
			if(meslek[i]=="öğretmen") {
				System.out.println("İsim="+isim[i]);
				System.out.println("Yaş="+yas[i]);
				System.out.println("Mesleğiniz="+meslek[i]);
				System.out.println("Cinsiyetiniz="+cinsiyet[i]);
				System.out.println("maaşınız="+maas[i]);
			}
		}
	}

	private static void yasort(int[] yas, int gsayi) {
		int toplamyas=0;
		for(int i=0; i<gsayi;i++) {
			toplamyas=toplamyas+yas[i];
			System.out.println("yaş ortalaması="+toplamyas/gsayi);
		}
	}

	private static void arama(String[] isim, int[] yas, String[] meslek, int[] maas, String[] cinsiyet, int gsayi,
			String arananad) {
			for(int i=0;i<gsayi;i++) {
				if(arananad.equalsIgnoreCase(isim[i])) {
					System.out.println("İsim="+isim[i]);
					System.out.println("Yaş="+yas[i]);
					System.out.println("Mesleğiniz="+meslek[i]);
					System.out.println("Cinsiyetiniz="+cinsiyet[i]);
					System.out.println("maaşınız="+maas[i]);
				}
			}
	}

	private static void listeleme(String[] isim, int[] yas, String[] meslek, int[] maas, String[] cinsiyet, int gsayi) {
		for(int i=0;i<gsayi;i++)
		{
		System.out.println("İsim="+isim[i]);
		System.out.println("Yaş="+yas[i]);
		System.out.println("Mesleğiniz="+meslek[i]);
		System.out.println("Cinsiyetiniz="+cinsiyet[i]);
		System.out.println("maaşınız="+maas[i]);
		}
	}

}
