package FiguraGeometrica;

public class Figura {
    //Atributos

    private int numLados;


    public Figura(int numLados) {
        this.numLados = numLados;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    //Metodos
    public double calcularArea(){
        return 0;
    }
    public double calcularPerimetros(){
        return 0;
    }


    //Este es el sout para mostrar informacion de la clase toString
    @Override
    public String toString() {
        return "La Figura tiene" +
                 + numLados +"lados";
    }
}
