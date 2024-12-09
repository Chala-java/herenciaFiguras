package FiguraGeometrica;

public class Circulo extends Figura {

    private int radio;

    public Circulo(int numLados, int radio) {
        super(numLados);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetros() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "El circulo tiene" +
                "radio=" + radio;
    }
}
