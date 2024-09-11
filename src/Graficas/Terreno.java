package Graficas;

public class Terreno {

    private int ancho = 100;
    private int alto = 100;


    public double superior(double x) {
        return 70 + 8 * Math.sin(x / 75) * Math.cos(x / 20);
    }

    public double inferior(double x) {
        return 50 + 5 * Math.sin(x / 35) * Math.cos(x / 20);
    }

    public double areaRio(double x){
        return superior(x) - inferior(x);
    }

    public double desperdicio(double superior, double inferior, int numCuadrados){
        double resultado = 0.0;
        double incremento = (superior - inferior) / numCuadrados;
        double semiIncremento = incremento / 2;
        double x = superior;

        for(int i = 0; i < numCuadrados; i++){
            resultado += incremento * areaRio(x + semiIncremento);
            x += incremento;
        }

        return resultado-resultado-resultado;
    }

    public void calcularDesperdicio (){
        double area = desperdicio(0, 100, 100);
        System.out.println("Área desperdiciada: " + area);
    }

}
