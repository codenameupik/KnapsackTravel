package GreedyTSP;
public class Matrik {
int graph[][]=new int[8][8];
    Matrik(){
            graph[1][1]=0;graph[1][2]=75;graph[1][3]=60;graph[1][4]=50;graph[1][5]=215;graph[1][6]=130;graph[1][7]=95;
            graph[2][1]=60;graph[2][2]=0;graph[2][3]=60;graph[2][4]=70;graph[2][5]=85;graph[2][6]=50;graph[2][7]=135;
            graph[3][1]=40;graph[3][2]=55;graph[3][3]=0;graph[3][4]=130;graph[3][5]=95;graph[3][6]=100;graph[3][7]=55;
            graph[4][1]=40;graph[4][2]=75;graph[4][3]=140;graph[4][4]=0;graph[4][5]=45;graph[4][6]=60;graph[4][7]=135;
            graph[5][1]=20;graph[5][2]=85;graph[5][3]=100;graph[5][4]=40;graph[5][5]=0;graph[5][6]=90;graph[5][7]=95;
            graph[6][1]=120;graph[6][2]=55;graph[6][3]=110;graph[6][4]=60;graph[6][5]=95;graph[6][6]=0;graph[6][7]=65;
            graph[7][1]=80;graph[7][2]=135;graph[7][3]=60;graph[7][4]=130;graph[7][5]=95;graph[7][6]=60;graph[7][7]=0;
    }
}
