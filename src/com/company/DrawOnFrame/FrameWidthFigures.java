package com.company.DrawOnFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Manu on 18/05/2017.
 */
public class FrameWidthFigures {

    public static void main(String[] args) {
        Marco miMarco = new Marco();
    }
}

class Marco extends JFrame{
    public Marco(){

        setBounds(200,200,500,500);
        setTitle("Dibujitos");


        Lienzo miLienzo = new Lienzo();

        add(miLienzo);

        setVisible( true );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo( null );
    }
}

class Lienzo extends JPanel{
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent( g );

        g.drawRect(50,50,100,150);
        g.drawLine(50,50,150,200);
        g.drawArc(145,150,100,200,120,150);
    }

}
