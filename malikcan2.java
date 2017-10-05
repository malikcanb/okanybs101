package malikcan;

import java.util.Scanner;

public class malikcan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int süreay ; 
		double ödenecekfaiz, sonoran, faizoran, ayfaiz, ödenecekborc, istenenborc, ayödeme, ayliködeme  ; 
		System.out.print("Almak istediðiniz borç");
		istenenborc = input.nextDouble();
		System.out.print("Senelik faiz oranýn kaç");
		faizoran = input.nextDouble();
		ayfaiz = faizoran / 12.0 ;
		System.out.print("Kaç sene ödeyeceksiniz");
		süreay = input.nextInt();
		ayliködeme = süreay / 12 ;
		sonoran = ayfaiz * süreay ;
		ödenecekfaiz = istenenborc * sonoran / 100 ;
		ödenecekborc = ödenecekfaiz + istenenborc ;
		ayödeme = ödenecekborc / 12 ;
		System.out.print("aylýk ödeyeceðiniz borç= "+ ayödeme);
		System.out.print("\nödeyeceðiniz toplam borç= "+ ödenecekborc);
	}

}
