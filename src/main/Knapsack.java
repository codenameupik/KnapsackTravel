package main;

public class Knapsack {
	public static void main(String[] args) {
		Knapsack1();	
	}
	public static void Knapsack1(){
		int alokasiwaktu = 60;
		int[] waktukunjung = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
		int[] waktutempuh = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
		//Titik awal = A, pilihan wisata = B, C, D
		waktutempuh[0] = 3; //A-B
		waktutempuh[1] = 4; //A-C
		waktutempuh[2] = 6; //A-D
		
		waktutempuh[3] = 1; //B-C
		waktutempuh[4] = 7; //B-D
		
		waktutempuh[5] = 1; //C-B
		waktutempuh[6] = 8; //C-D
		
		waktutempuh[7] = 6; //D-B
		waktutempuh[8] = 7; //D-C
		
		
		waktukunjung[0] = 60; //B
		waktukunjung[1] = 30; //C
		waktukunjung[2] = 15; //D
		waktukunjung[3] = 30; //C
		waktukunjung[4] = 45; //D
		waktukunjung[5] = 60; //B
		waktukunjung[6] = 30; //D
		waktukunjung[7] = 60; //B
		waktukunjung[8] = 30; //C
		
		
		int[] waktutotal= {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
		
		for (int i=0;i<=8;i++){
			waktutotal[i] = waktutempuh[i]+waktukunjung[i];
		}
		int smallest = waktutotal[0];
		for(int i=1;i<=2;i++){
			if(smallest>waktutotal[i]){
				smallest = waktutotal[i];
			}
		}
		System.out.println("Titik Awal A : Tujuan B,C,D");
		System.out.println("(A-C)= "+smallest);
		System.out.println("Titik Awal C : Tujuan B,D");
		
		int smallest2 = waktutotal[5];
		for(int i=5;i<=6;i++){
			if(smallest2>waktutotal[i]){
				smallest2 = waktutotal[i];
			}
		}
		
		System.out.println("(C-D)= "+smallest2);
		System.out.println("Titik Awal D : Tujuan B");
		int smallest3=waktutotal[7];
		System.out.println("(D-B)= "+smallest3);	
		System.out.println("Alokasi Waktu= "+alokasiwaktu);
		int[] hasil = {' ', ' ', ' ',' '};
		hasil[0] = smallest;
		hasil[1] = smallest2;
		hasil[2] = smallest3;
		int knaps = hasil[0];
		
		for(int i=0;i<=2;i++){
			if((hasil[i]+hasil[i+1])<=alokasiwaktu){
				knaps+=hasil[i+1];
			}
		}
		System.out.println("knapsack: "+knaps);
		
	}
}
