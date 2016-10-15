package GreedyTSP;

public class Greedy {
	Matrik M = new Matrik();
	int[][] hasil = new int[12][12];
	int[] solusi = new int[13];

	public Greedy()
	{
	}
	public void showHasil() {
		String temp = "";
		int row = 5; 
		int col = 1; 
		int cc = 0; 
		int nilai = 0; 
		int cek = 2; 
		int totalwaktu = 0;
		int i = 0;
		int j = 0;
		
		solusi[1] = row;
		for (i = 1; i <= 11; i++) {
			for (j = 1; j <= 11; j++) {
				hasil[i][j] = 1;
			}
		}

		while (cek <= 11) {
			if (cek > 10)
				break;
			nilai = 1000;

			col = 1;
			
			while (col < 11) {
				if (col > 10)
					break;
				if (M.graph[row][col] < nilai && row != col && hasil[row][col] == 1) 
				{
					nilai = M.graph[row][col];
					cc = col;
				}

				col++;

			}
			System.out.print("Solusi hasil row:" + row +  " col:"  + cc + " nilai : " + nilai
					+ " cek: " + col +  " \n");
			totalwaktu += nilai;
			for (i = 1; i < 11; i++) {
				for (j = 1; j < 11; j++) {
					if (j == row)
						hasil[i][j] = 0;
				}
			}

			solusi[cek] = cc;
			row = cc;
			cek++;

		}

		totalwaktu += M.graph[cc][1];
		solusi[cek] = 1;

		for (i = 1; i < cek; i++) {

			switch (solusi[i]) {
			case 1:
				temp = temp + "A ";
				break;
			case 2:
				temp = temp + "B ";
				break;
			case 3:
				temp = temp + "C ";
				break;
			case 4:
				temp = temp + "D ";
				break;
			case 5:
				temp = temp + "E ";
				break;
			case 6:
				temp = temp + "F ";
				break;
			case 7:
				temp = temp + "G ";
				break;
			case 8:
				temp = temp + "H ";
				break;
			case 9:
				temp = temp + "I ";
				break;
			case 10:
				temp = temp + "J ";
				break;
			}
			
			if (i == cek - 1) {
				for (int k = 1; k < cek; k++) {
					System.out.print("Solusi : " + solusi[k] + " \n");
				}
				System.out.print("Solusi : " + temp
						+ "total waktu yang dibutuhkan " + totalwaktu + " \n");
			
			}

		}

	}

}