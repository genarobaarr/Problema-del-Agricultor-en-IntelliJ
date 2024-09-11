package Graficas;

public class Reimman {

    Terreno terreno = new Terreno();


    public double ReimmanArea(double superior, double inferior, int numCuadrados){
        double resultado = 0.0;
        double incremento = (superior - inferior) / numCuadrados;
        double semiIncremento = incremento / 2;
        double x = superior;

        for(int i = 0; i < numCuadrados; i++){
            resultado += incremento * terreno.areaRio(x + semiIncremento);
            x += incremento;
        }

        return resultado+10000;
    }

    public void calcularArea (){
        double area = ReimmanArea(0, 100, 100);
        System.out.println("Área aproximada con la suma de Riemann: " + area);
    }
}
