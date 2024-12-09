package FiguraGeometrica;

public class Triangulo extends Figura{

    private int base,altura;

    public Triangulo(int numLados, int base, int altura) {
        super(numLados);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public double calcularPerimetros() {
        return base*getNumLados();
    }

    @Override
    public String toString() {
        return "El triangulo tiene" +super.getNumLados()+
                "base =" + base +
                ", altura =" + altura;
    }
}
