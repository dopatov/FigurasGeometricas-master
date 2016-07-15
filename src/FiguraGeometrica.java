/**
 * Created by professor on 14/06/2016.
 */
public  abstract class FiguraGeometrica {
    protected long id;
    protected String color;

    public FiguraGeometrica(long id, String color) {
        this.id = id;
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public abstract double CalculaArea();

    public abstract double CalculaPerimetro();

    public String SolicitaColor(){return color;}

}
