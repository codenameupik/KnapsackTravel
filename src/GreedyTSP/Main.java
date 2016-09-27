package GreedyTSP;

public class Main {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // TODO code application logic here
//        Matrik baru =new Matrik();
//
//        for (char x='A';x<'H';x++){
//            for (char y='A';y<'H';y++){
//                System.out.print(BF.graph[x][y]+" ");
//            }
//            System.out.println('\n');
//        }

        Greedy g = new Greedy();
//        bb keluaran = new bb();
//        keluaran = b.Solusi();
        System.out.print("Solusi studi kasus dengan algoritma Greedy : \n");
        System.out.print("****************************************************** \n");
        g.showHasil();
      
    }

}