/**
 * Created by professor on 23/06/2016.
 */
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class Ventana extends JFrame{

    FlowLayout poligonoLayout=new FlowLayout();
    JButton Aceptar;

    public Ventana () {
        initComponents();
        getContentPane();

    }

    private void initComponents ()
    {
        FlowLayout poligonoLayout = new FlowLayout();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Super Calcula Poligonos 2000  ");

    }

    private void addComponentsToPane(final Container pane) {
        final JPanel compsToPoligono = new JPanel();
        compsToPoligono.setLayout(poligonoLayout);
        poligonoLayout.setAlignment(FlowLayout.TRAILING);
        JPanel display = new JPanel();
        display.setLayout(new FlowLayout());


        compsToPoligono.add(new JButton("Selecciona cuantas Figuras de cada tipo quieres calcular"));
        compsToPoligono.add (new JTextField("escribe el numero de figuras aqui"));
        compsToPoligono.add(new JButton("Introduce los datos del poligono"));
        compsToPoligono.add(new JButton("Introduce el tamaño del lado1"));
        compsToPoligono.add (new JTextField("escribe aqui el tamaño"));
        compsToPoligono.add(new JButton("Introduce el tamaño del lado2"));
        compsToPoligono.add (new JTextField("escribe aqui el tamaño"));
        compsToPoligono.add(new JButton("Introduce el tamaño del lado3"));
        compsToPoligono.add (new JTextField("escribe aqui el tamaño"));

        display.add (new JButton("aqui se mostraran las figuras"));

        compsToPoligono.setComponentOrientation(
                ComponentOrientation.LEFT_TO_RIGHT);

        pane.add(compsToPoligono, BorderLayout.CENTER);
        pane.add(display, BorderLayout.SOUTH);
    }


    public static void createAndShowGUI() {
        Ventana frame = new Ventana();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addComponentsToPane(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }}