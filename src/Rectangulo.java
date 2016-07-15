import java.util.Scanner;

public class Rectangulo extends FiguraGeometrica {

    private double base; //private hace que no se pueda acceder externamente
    private double altura;

    public Rectangulo(double base, double altura, long id,String color) {
        super(id,color); //llamamos al constructor de fig geom.
        this.base = base;
        this.altura = altura;
        this.color=color;
    }

    public double CalculaArea()
    {
        return (base*altura);
    }


    public double CalculaPerimetro()
    {
        return (2*base)+(2*altura);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "id=" + id +
                ", base=" + base +
                ", altura=" + altura +
                ", color=" +color+
                "}";
    }
}
