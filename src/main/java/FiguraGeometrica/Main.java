package FiguraGeometrica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Figura> figuras = new ArrayList<Figura>();

    public static void main(String[] args) {
        ingresarFigura();
        mostrarResultado();


    }

    public static void ingresarFigura(){
        int opcion = 0;
        do {
            System.out.println("Señor usuario favor una de" +
                    " las siguientes figuras " +
                    "\n 1) para ingresar un rectangulo"+
                    "\n 2) para ingresar un triangulo"+
                    "\n 3) para ingresar un circulo"+
                    "\n 4) para salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    //Ingresar al metodo de calcular rectangulo
                    calcularRectangulo();
                    break;

                case 2: //Ingresar el metodo de calcular Triangulo
                    calcularTriangulo();
                    break;

                case 3: //Ingresar el metodo de calcular Circulo
                    calcularCirculo();
                    break;
                case 4: //Salir
                    opcion = 4;
                default:
                    System.out.println("Opcion incorrecta");
                }

        }while(opcion !=4);
    }

    public static void  calcularRectangulo(){
        int lado1, lado2,numLados;
        System.out.println("Señor usuario por favor ingresar"+
                "los lados del rectangulo");
        System.out.println("Favor ingresar el numero de lados del rectangulo");
        numLados = sc.nextInt();
        System.out.println("Por favor ingresar el valor del lado 1");
        lado1 = sc.nextInt();
        System.out.println("Por favor ingresar el valor del lado 2");
        lado2 = sc.nextInt();
        Rectangulo rectangulo = new Rectangulo(numLados,lado1,lado2);
        figuras.add(rectangulo);
    }

    public static void calcularTriangulo(){
        int base,altura,numLados;
        System.out.println("Señor usuario por favor ingresar"+
                "los lados del Triangulo");

        System.out.println("Favor ingresar el numero de lados del Triangulo");
        numLados = sc.nextInt();
        System.out.println("Favor ingresar la base del triangulo");
        base = sc.nextInt();

        System.out.println("Por favor ingresar la altura del triangulo");
        altura = sc.nextInt();

        Triangulo triangulo = new Triangulo(numLados,base,altura);
        figuras.add(triangulo);
    }

    public static void calcularCirculo(){
        int numLados,radio;
        System.out.println("Favor ingresar el numero de lados del Circulo");
        numLados = sc.nextInt();
        System.out.println("Favor ingresar el radio");
        radio = sc.nextInt();
        Circulo circulo = new Circulo(numLados,radio);
        figuras.add(circulo);
    }

    public static  void mostrarResultado(){
        //figur es el objeto de la clase figura
        for (Figura figur:figuras){
            System.out.println(figuras.toString());
            System.out.println("El area es:"+figur.calcularArea());
            System.out.println("El perimetro es:" + figur.calcularPerimetros());
        }
    }
}
