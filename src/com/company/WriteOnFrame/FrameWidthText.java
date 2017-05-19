package com.company.WriteOnFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Manu on 18/05/2017.
 */
public class FrameWidthText {

    public static void main(String[] args) {
        //4º Paso
        Marco miMarco = new Marco();
    }
}

class Marco extends JFrame{
    //1º Paso
    public Marco(){

        setBounds(200,200,500,500);
        setTitle("Escribir sobre un panel");
        setVisible( true );

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3º Paso
        Lienzo miLienzo = new Lienzo();
        add( miLienzo );
    }
}
//2º Paso
class Lienzo extends JPanel{

    @Override
    protected void paintComponent(Graphics g){

        super.paintComponents( g );

        g.drawString("Swing mola ...",150,150);
    }
}
