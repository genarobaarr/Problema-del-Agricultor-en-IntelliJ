package Graficas;

public class Agricultor {
    public static void main(String args[]) {

        Lienzo lienzo = new Lienzo();
        Terreno terreno = new Terreno();
        Reimman reimman = new Reimman();

        int numPuntos = 100;
        double escalaX = 1;
        double escalaY = 1;

        for(int i = 0; i < numPuntos; i++){
            double x = i * escalaX;
            double ySup = terreno.superior(x) * escalaY;
            double yInf = terreno.inferior(x) * escalaY;

            lienzo.setPen(i, (int) ySup, '*');

            lienzo.setPen(i, (int) yInf, '+');
        }

        lienzo.dibujar();

        lienzo.clean();

        reimman.calcularArea();

        terreno.calcularDesperdicio();

    }
}
