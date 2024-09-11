package Graficas;

public class Lienzo {

    private int size;
    private char[][] lienzo;

    public Lienzo() {

        size = 100;
        lienzo = new char[size][size];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                lienzo[i][j] = ' ';
            }
        }
    }
    public void setPen(int x, int y, char c){

        if(x <0 || y >= size) return;
        int pos = size-1;
        lienzo[pos-y][x] = c;
    }

    public void dibujar(){

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){

                System.out.print(lienzo[i][j]);
            }
            System.out.println("");
        }
    }

    public void clean(){

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                lienzo[i][j] = ' ';
            }
        }
    }
}
