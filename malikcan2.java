package malikcan;

import java.util.Scanner;

public class malikcan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int s�reay ; 
		double �denecekfaiz, sonoran, faizoran, ayfaiz, �denecekborc, istenenborc, ay�deme, aylik�deme  ; 
		System.out.print("Almak istedi�iniz bor�");
		istenenborc = input.nextDouble();
		System.out.print("Senelik faiz oran�n ka�");
		faizoran = input.nextDouble();
		ayfaiz = faizoran / 12.0 ;
		System.out.print("Ka� sene �deyeceksiniz");
		s�reay = input.nextInt();
		aylik�deme = s�reay / 12 ;
		sonoran = ayfaiz * s�reay ;
		�denecekfaiz = istenenborc * sonoran / 100 ;
		�denecekborc = �denecekfaiz + istenenborc ;
		ay�deme = �denecekborc / 12 ;
		System.out.print("ayl�k �deyece�iniz bor�= "+ ay�deme);
		System.out.print("\n�deyece�iniz toplam bor�= "+ �denecekborc);
	}

}
