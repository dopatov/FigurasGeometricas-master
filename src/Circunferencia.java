import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by professor on 13/06/2016.
 */
public class Circunferencia extends FiguraGeometrica {

    private double radio;

    public Circunferencia(double radio,long id,String color) {
        super(id,color); //llamamos al constructor de fig geom.
        this.radio = radio;
        this.color =color;
    }

    public double CalculaArea() {
        return (Math.PI * (Math.pow(radio, 2)));
    }

    public double CalculaPerimetro() {
        return (2 * Math.PI * radio);
    }

    public double CalculaDiametro () {return 2*radio;}

    @Override
    public String toString() {
        return "Circunferencia{ " +
                "id=" + id +
                ", radio=" + radio +
                ", color=" + color +
                '}';
    }
}