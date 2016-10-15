package GreedyTSP;

public class Greedy {
   Matrik M=new Matrik();
   MatriksTest MT=new MatriksTest();
   int[][] hasil=new int[9][9];
   int[] solusi=new int[10];
//   char[] record=new char[100];
 
//   public char ruteKota() {
// 
//}
   public Greedy(){
     
   }
   public void showHasil(){
   String temp="";
   int row=3;
   int col=1;
   int cc=0;
   int rr=0;
   int com=0;
   int cek=2;
   int jarak=0;
   int i=0;
   int j=0;
   int ce=0;
   solusi[1]=row;
   for (i=1;i<=8;i++) {
       for (j=1;j<=8;j++) {
           hasil[i][j]=1;
        }
   }
 
   while (cek<=8) {
       if (cek>7) break;
    com=1000;
      
        col=1;
        while (col<8) {
            if (col>7) break;
            ce=0;
            if (M.graph[row][col]<com && row!=col && hasil[row][col]==1) {
                       com=M.graph[row][col];
                       cc=col;
                       ce=1;
                     
               }
          
          
            col++;
          
          
        }
        System.out.print("Solusi hasil colom: " + cc + " com : " + com +" cek: "+ col + " row: " + row +" \n");
           jarak+=com;
            for (i=1;i<8;i++) {
               for (j=1;j<8;j++) {
                   if (j==row) hasil[i][j]=0;
        }
   }
         
           solusi[cek]=cc;
           row=cc;
           cek++;
         
   }          
                                 
          jarak+=M.graph[cc][1];
          solusi[cek]=1;

 
   for (i=1; i<cek; i++) {
         
            switch (solusi[i]) {
                   case 1: temp = temp+ "A ";
                            break;
                   case 2: temp = temp+ "B ";
                            break;
                   case 3: temp = temp+ "C ";
                            break;
                   case 4: temp = temp+ "D ";
                            break;
                   case 5: temp = temp+ "E ";
                            break;
                   case 6: temp = temp+ "F ";
                            break;
                   case 7: temp = temp+ "G ";
                            break;
                   }
               if (i==cek-1){
            System.out.print("Solusi : " + temp + "total waktu yang dibutuhkan " + jarak + " \n");
            for(int k=1;k<cek;k++){
            	System.out.print("Solusi : " + solusi[k] + " \n");
            	//System.out.print(M.graph[4][3]);
            	//MT.graph2[1][1]=10;
            	//System.out.print(MT.graph2[1][1]);
            }
            
               }
             
   }
 
 
}
 
 
}