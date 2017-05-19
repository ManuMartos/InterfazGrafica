package com.company.PrimeraVentana;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Manu on 15/05/2017.
 */
public class EjemploSencilloVentana {

    public static void main(String[] args) {
        VentanaSencilla miVentana = new VentanaSencilla();
    }

}
class VentanaSencilla extends JFrame{

    public VentanaSencilla(){

        /**
         * Dar tamaño
         */
        setSize(450,450);
        /**
         * Dar visibilidad
         */
        setVisible(true);
        /**
         * Para que se cierre la ventana
         */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /**
         * Controlamos la posicion para colocarse la ventana
         */
        //setLocation(450,100);
        /**
         * Centramos la pantalla. Cuidado, depende del sistema operativo la coloca en sitios
         * diferentes.
         */
        //setLocationRelativeTo( null );
        /**
         * Primero pone las cordenadas y despues el tamaño
         */
        //setBounds(450,100,500,500);
        /**
         * Poner titulo a una ventana
         */
        setTitle("Mi primera ventana");
        /**
         * Dejarla la pantalla fija (que no la puedan cambiar de tamaño)
         */
        setResizable( false );
        /**
         * Mostrar la pantalla maximizada
         */
        //setExtendedState(Frame.MAXIMIZED_BOTH);

        Toolkit myScreen = Toolkit.getDefaultToolkit();

        Dimension dimensionScreen = myScreen.getScreenSize();
        setLocation( (dimensionScreen.width - getWidth() ) / 2, (dimensionScreen.height - getHeight()) / 2);

        /**
         * Establecer el icono de la ventana
         */

        Image icon = myScreen.getImage("vader.png");

        setIconImage( icon );
    }

}
