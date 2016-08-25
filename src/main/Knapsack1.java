package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//init
public class Knapsack1 {
	public static void main(String[] args) {
		char titikAwal = 'A';
		int alokasiWaktu = 600;
		char[] tujuanWisata = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
				' ', ' ', ' ', ' ', ' ' };
		tujuanWisata[1] = 'B';
		tujuanWisata[2] = 'C';
		tujuanWisata[3] = 'D';
		tujuanWisata[4] = 'E';
		rumus(titikAwal, alokasiWaktu, tujuanWisata);
	}

	static void rumus(char titikAwal, int alokasiWaktu, char[] tujuanWisata) {
		System.out.println(titikAwal + " + " + alokasiWaktu + " + "
				+ tujuanWisata[4]);
		// input user (nanti diganti dari db)
		char titikAkhir;
		// int jumlahDestinasi;
		// Menghitung jumlah wisata yang dikunjungi//
		String arrayTujuanWisata = new String(tujuanWisata);

		List<Character> cList = new ArrayList<>();

		for (char c : tujuanWisata) {
			cList.add(c);
		}

		int cCount = Collections.frequency(cList, ' ');

		System.out.println("Char: " + cCount + " items out of "
				+ tujuanWisata.length + " are ' '");

		int jumlahDestinasi = arrayTujuanWisata.length() - cCount;
		System.out.println("Jumlah Tujuan Wisata : " + jumlahDestinasi);
		// ----------------------------------------//

		int[] rute = new int[jumlahDestinasi];
		// Query data titik awal(A) ke titik wisata ( B C D E)
		rute[0] = 60;// "AB";
		rute[1] = 45;// "AC";
		rute[2] = 30;// "AD";
		rute[3] = 75;// "AE";

		System.out.println(rute.length);
		// rute[4] = 20;//"BC";
		// rute[5] = 25;//"BD";
		// rute[6] = 15;//"BE";
		// rute[7] = 35;//"CD";
		// rute[8] = 40;//"CE";
		// rute[9] = 10;//"DE";

		// int AB, AC, AD, AE, BC, BD, BE, CD, CE, DE;//rute (dari db) titik
		// awal = A tujuan = B C D E
		int[] waktuBerkunjung = new int[jumlahDestinasi - 1];
		// data diambil dari db (waktu tempuh)
		/*
		 * AB = 60; AC = 45; AD = 30; AE = 75; BC = 20; BD = 25; BE = 15; CD =
		 * 35; CE = 40; DE = 10;
		 */
		int jmlRute = 10;

		// input user dari aplikasi
		int[] inputUserWaktuBerkunjung = new int[jumlahDestinasi];
		inputUserWaktuBerkunjung[0] = 60;
		inputUserWaktuBerkunjung[1] = 90;
		inputUserWaktuBerkunjung[2] = 60;
		inputUserWaktuBerkunjung[3] = 90;

		// data dari input user dimasukkan ke code
		for (int i = 0; i < jumlahDestinasi; i++) {
			// waktuBerkunjung[i] = inputUserWaktuBerkunjung[i];
		}

		// waktu total = waktu tempuh+waktu berkunjung
		int[] waktuTotal = new int[jmlRute - 1];
		// for(int i=0;i<)
		/*
		 * waktuTotal[0] = rute[0]+inputUserWaktuBerkunjung[0]; waktuTotal[1] =
		 * rute[1]+inputUserWaktuBerkunjung[1]; waktuTotal[2] =
		 * AD+inputUserWaktuBerkunjung[2]; waktuTotal[3] =
		 * AE+inputUserWaktuBerkunjung[3]; waktuTotal[4] =
		 * BC+inputUserWaktuBerkunjung[1]; waktuTotal[5] =
		 * BD+inputUserWaktuBerkunjung[2]; waktuTotal[6] =
		 * BE+inputUserWaktuBerkunjung[3]; waktuTotal[7] =
		 * CD+inputUserWaktuBerkunjung[2]; waktuTotal[8] =
		 * CE+inputUserWaktuBerkunjung[3]; waktuTotal[9] =
		 * DE+inputUserWaktuBerkunjung[3];
		 */
		titikAkhir = 'E';

		// if(titikAwal == titikAkhir){
		// titikAkhir = 0;
		// }else {
		// for(int i=0;i<=jmlRute;i++){

		// }
		// }
		int ruteAwal = rute[0];
		System.out.println(rute[3]);
		for (int i = 0; i < jumlahDestinasi; i++) {
			if (ruteAwal > rute[i]) {
				ruteAwal = rute[i];
			}
		}
		System.out.println("Rute Awal = " + ruteAwal + "Menit");
	}
}