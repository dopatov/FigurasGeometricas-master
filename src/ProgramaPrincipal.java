import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;

public class ProgramaPrincipal extends Ventana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        createAndShowGUI ();



    System.out.println("Hello World!");
        List<FiguraGeometrica> FiguraGeometricaList = new ArrayList<>();
        System.out.println("Introduce el numero de figuras geometricas de cada tipo que quieras analizar");

        int numero = sc.nextInt();

        ObtenTriangulos(sc, FiguraGeometricaList, numero);

        ObtenRectangulos(sc, FiguraGeometricaList, numero);

        ObtenCircunferencias(sc, FiguraGeometricaList, numero);

        FiguraGeometrica max = null;

        String newLine = System.getProperty("line.separator");

        ProcesaFigura(FiguraGeometricaList, newLine);{

        int verde =0;
        int azul=0;
        int rojo=0;
        int amarillo=0;
        int naranja=0;

        ProcesaCantidades procesaCantidades = new ProcesaCantidades(FiguraGeometricaList,verde, azul, rojo, amarillo, naranja).invoke();

        verde = procesaCantidades.getVerde();
        azul = procesaCantidades.getAzul();
        rojo = procesaCantidades.getRojo();
        amarillo = procesaCantidades.getAmarillo();
        naranja = procesaCantidades.getNaranja();

        System.out.println(newLine);
        System.out.println("el numero de poligonos verdes es: " +verde );
        System.out.println("el numero de poligonos azules es: " +azul);
        System.out.println("el numero de poligonos rojos es "+rojo);
        System.out.println("el numero de poligonos amarillos es: " +amarillo);
        System.out.println("el numero de poligonos naranjas es: " +naranja);
        System.out.println(newLine);


    }
    }



    private static void ProcesaFigura(List<FiguraGeometrica> FiguraGeometricaList, String newLine) {

        double areaTotal=0;

        for (FiguraGeometrica figuraGeometrica : FiguraGeometricaList) {
            double AreaActual = figuraGeometrica.CalculaArea();
            System.out.println(newLine);
            System.out.println("" +
                    "el area de la figura geometrica " + (figuraGeometrica) + " es " + AreaActual);
            areaTotal=areaTotal+AreaActual;
        }
        System.out.println(newLine);
        System.out.println("el area media de todos los poligonos es: " + (areaTotal/FiguraGeometricaList.size()));

    }

    private static void ObtenTriangulos(Scanner sc, List<FiguraGeometrica> FiguraGeometricaList, int numero) {
        for (int id = 1; id <= numero; id++) {
            System.out.println("Introduce los datos del Triangulo");
            System.out.println("Introduce el tamaño de la base:");
            double base = sc.nextDouble();
            System.out.println("Introduce el tamaño de la altura");
            double altura=sc.nextDouble();
            System.out.println("Introduce el tamaño del lado1:");
            double lado1=sc.nextDouble();
            System.out.println("Introduce el tamaño del lado2");
            double lado2=sc.nextDouble();
            System.out.println("introduce el color del triangulo");
            String colorSeleccionado = SolicitaColor("Triangulo");
            FiguraGeometricaList.add(new Triangulo(base,altura,lado1,lado2,id, colorSeleccionado));
        }
    }

    private static void ObtenRectangulos(Scanner sc, List<FiguraGeometrica> FiguraGeometricaList, int numero) {
        for (int id = 1; id <= numero; id++) {
            System.out.println("Introduce los datos del Rectangulo:");
            System.out.println("Introduce el tamaño de la base:");
            double base = sc.nextDouble();
            System.out.println("Introduce el tamaño de la altura:");
            double altura = sc.nextDouble();
            String colorSeleccionado = SolicitaColor("Rectangulo");
            FiguraGeometricaList.add(new Rectangulo(base,altura,2*id, colorSeleccionado));
        }
    }

    private static void ObtenCircunferencias(Scanner sc, List<FiguraGeometrica> FiguraGeometricaList, int numero) {
        for (int id = 1; id <= numero; id++) {
            System.out.println("Introduce los datos de la Circunferencia:");
            System.out.println("Introduce el tamaño del radio:");
            double radio = sc.nextDouble();
            System.out.println("introduce el color de la Circunferencia");
            String colorSeleccionado = SolicitaColor("Circunferencia");
            FiguraGeometricaList.add(new Circunferencia( radio,id, colorSeleccionado));

        }
    }

    private static String SolicitaColor(String tipoFiguraGeometrica) {


        String newLine = System.getProperty("line.separator");
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce el color del " + tipoFiguraGeometrica);
        System.out.println(newLine + "1-verde" + newLine +
                "2-azul" + newLine +
                "3-rojo" + newLine +
                "4-amarillo" + newLine +
                "5-naranja");

        int selectorColor = sc.nextInt();

        String colorSeleccionado = null;
        switch (selectorColor) {
            case 1:
                colorSeleccionado = "verde";
                break;
            case 2:
                colorSeleccionado = "azul";
                break;
            case 3:
                colorSeleccionado = "rojo";
                break;
            case 4:
                colorSeleccionado = "amarillo";
                break;
            case 5:
                colorSeleccionado = "naranja";
                break;
            default:
                System.out.println("Numero incorrecto");
                System.exit (1);
        }
        return colorSeleccionado;
    }
}



class ProcesaCantidades {
    private List<FiguraGeometrica> FiguraGeometricaList;
    private int verde;
    private int azul;
    private int rojo;
    private int amarillo;
    private int naranja;

    public ProcesaCantidades(List<FiguraGeometrica> FiguraGeometricaList, int verde, int azul, int rojo, int amarillo, int naranja) {
        this.FiguraGeometricaList = FiguraGeometricaList;
        this.verde = verde;
        this.azul = azul;
        this.rojo = rojo;
        this.amarillo = amarillo;
        this.naranja = naranja;
    }

    public int getVerde() {
        return verde;
    }

    public int getAzul() {
        return azul;
    }

    public int getRojo() {
        return rojo;
    }

    public int getAmarillo() {
        return amarillo;
    }

    public int getNaranja() {
        return naranja;
    }

    public ProcesaCantidades invoke() {
        for (FiguraGeometrica figuraGeometrica : FiguraGeometricaList) {

            double AreaActual = figuraGeometrica.CalculaArea();

            switch (figuraGeometrica.SolicitaColor()) {
                case "verde":
                    verde++;
                    break;
                case "azul":
                    azul++;
                    break;
                case "rojo":
                    rojo++;
                    break;
                case "amarillo":
                    amarillo++;
                    break;
                case "naranja":
                    naranja++;
                    break;
            }

        }
        return this;
    }

}





