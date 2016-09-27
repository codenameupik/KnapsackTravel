package main;

public class Knapsack {
	char titik_awal = 'A';
	int jumlah_tujuan = 3;
	static int alokasiwaktu = 60;
	
	
	
	public static void main(String[] args) {
		//Knapsack1();
		Knapsack2();
	}
	public static void Knapsack2(){
		int[] smallest = {' ', ' ', ' ',' '};
		
		Dataset[] dataset1 = new Dataset[12];      // line 30 changed per suggestions
		 for(int i = 0; i < 12; i++)
		    {
		        dataset1[i] = new Dataset();
		    }
		//dataset1[0] = new Dataset[]{'A','B',3};
		dataset1[0].titik1 = 'A';
		dataset1[0].titik2 = 'B';
		dataset1[0].jarak = 3;
		dataset1[1].titik1 = 'A';
		dataset1[1].titik2 = 'C';
		dataset1[1].jarak = 4;
		dataset1[2].titik1 = 'A';
		dataset1[2].titik2 = 'D';
		dataset1[2].jarak = 6;
		
		dataset1[3].titik1 = 'B';
		dataset1[3].titik2 = 'A';
		dataset1[3].jarak = 3;
		dataset1[4].titik1 = 'B';
		dataset1[4].titik2 = 'C';
		dataset1[4].jarak = 1;
		dataset1[5].titik1 = 'B';
		dataset1[5].titik2 = 'D';
		dataset1[5].jarak = 7;
		
		dataset1[6].titik1 = 'C';
		dataset1[6].titik2 = 'A';
		dataset1[6].jarak = 4;
		dataset1[7].titik1 = 'C';
		dataset1[7].titik2 = 'B';
		dataset1[7].jarak = 1;
		dataset1[8].titik1 = 'C';
		dataset1[8].titik2 = 'D';
		dataset1[8].jarak = 8;
		
		dataset1[9].titik1 = 'D';
		dataset1[9].titik2 = 'A';
		dataset1[9].jarak = 6;
		dataset1[10].titik1 = 'D';
		dataset1[10].titik2 = 'B';
		dataset1[10].jarak = 6;
		dataset1[11].titik1 = 'D';
		dataset1[11].titik2 = 'C';
		dataset1[11].jarak = 7;	
		//----------------------
		int[] waktutotal= {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
		int[] waktukunjung = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
		waktukunjung[0] = 60; //B
		waktukunjung[1] = 30; //C
		waktukunjung[2] = 15; //D
		
		 
		
		for (int i=0;i<=2;i++){
			waktutotal[i] = (dataset1[i].jarak)+waktukunjung[i];
		}
		smallest[0] = waktutotal[0];
		for(int i=1;i<=2;i++){
			if(smallest[0]>waktutotal[i]){
				smallest[0] = waktutotal[i];
			}
		}
		System.out.println("Titik Awal A : Tujuan B,C,D");
		System.out.println("(A-D)= "+smallest[0]);
		
		smallest[1] = waktutotal[5];
		for(int i=5;i<=6;i++){
			if(smallest[1]>waktutotal[i]){
				smallest[1] = waktutotal[i];
			}
		}
		
		System.out.println("(C-D)= "+smallest[1]);
		System.out.println("Titik Awal D : Tujuan B");
		smallest[2]=waktutotal[7];
		System.out.println("(D-B)= "+smallest[2]);	
		System.out.println("Alokasi Waktu= "+alokasiwaktu);
		int[] hasil = {' ', ' ', ' ',' '};
		hasil[0] = smallest[0];
		hasil[1] = smallest[1];
		hasil[2] = smallest[2];
		int knaps = hasil[0];
		for(int i=0;i<=2;i++){
			if((hasil[i]+hasil[i+1])<=alokasiwaktu){
				knaps+=hasil[i+1];
			}
		}
		System.out.println("knapsack: "+knaps);
		
	}

	/*public static void Knapsack1(){
		
		int[] waktukunjung = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
		int[] waktutempuhA = {' ', ' ', ' '};
		int[] waktutempuhB = {' ', ' ', ' '};
		int[] waktutempuhC = {' ', ' ', ' '};
		int[] waktutempuhD = {' ', ' ', ' '};
		//Titik awal = A, pilihan wisata = B, C, D
		waktutempuhA[0] = 3; //A-B
		waktutempuhA[1] = 4; //A-C
		waktutempuhA[2] = 6; //A-D
		
		waktutempuhB[0] = 3; //B-A
		waktutempuhB[1] = 1; //B-C
		waktutempuhB[2] = 7; //B-D
		
		waktutempuhC[0] = 4; //C-A
		waktutempuhC[1] = 1; //C-B
		waktutempuhC[2] = 8; //C-D
		
		waktutempuhD[0] = 6; //D-A
		waktutempuhD[1] = 6; //D-B
		waktutempuhD[2] = 7; //D-C
		
		
		waktukunjung[0] = 60; //B
		waktukunjung[1] = 30; //C
		waktukunjung[2] = 15; //D
		
		int[] waktutotal= {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
		//titik awal 
		for (int i=0;i<=2;i++){
			waktutotal[i] = waktutempuhA[i]+waktukunjung[i];
		}
		int smallest = waktutotal[0];
		for(int i=1;i<=2;i++){
			if(smallest>waktutotal[i]){
				smallest = waktutotal[i];
			}
		}
		System.out.println("Titik Awal A : Tujuan B,C,D");
		System.out.println("(A-D)= "+smallest);
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
		
	}*/
}

class Dataset{
	public char titik1;
	public char titik2;
	public int jarak;
}
