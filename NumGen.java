package iColor;

import java.awt.*;
import java.util.Random;
import javax.swing.JPanel;

public class NumGen extends JPanel
{

    Random rand = new Random();
    float r1 = (float)(rand.nextFloat() / 2f + 0.5);
    float g1 = (float)(rand.nextFloat() / 2f + 0.5);
    float b1 = (float)(rand.nextFloat() / 2f + 0.5);

    float r2 = (float)(rand.nextFloat() / 2f + 0.5);
    float g2 = (float)(rand.nextFloat() / 2f + 0.5);
    float b2 = (float)(rand.nextFloat() / 2f + 0.5);
    Color randomColor;
    Color bgColor;



    public void paintComponent(Graphics g) {

        randomColor = new Color(r1, g1, b1);
        bgColor = new Color(r2, g2, b2);

        super.paintComponent(g);
        this.setBackground(Color.GREEN);

        Graphics2D g2d = (Graphics2D) g;

        int[] xPts = {100, 200, 300};
        int[] yPts = {100, 200, 300};



                //if random number is 1
                if(Driver.getGame1State() == 1) {
                    this.setBackground(bgColor);

                    //B
                    g2d.setPaint(randomColor);
                    g2d.fillRect(150, 120, 30, 100);

                   //C
                    g2d.setPaint(randomColor);
                    g2d.fillRect(150, 220, 30, 100);
                }

                //if random number is 2
                if(Driver.getGame1State() == 2) {
                    this.setBackground(bgColor);

                    //A
                    g2d.setPaint(randomColor);
                    g2d.fillRect(130, 120, 100, 30);

                    //B
                    g2d.setPaint(randomColor);
                    g2d.fillRect(200, 120, 30, 100);

                    //D
                    g2d.setPaint(randomColor);
                    g2d.fillRect(130, 310, 100, 30);

                    //E
                    g2d.setPaint(randomColor);
                    g2d.fillRect(130, 220, 30, 100);

                    //G
                    g2d.setPaint(randomColor);
                    g2d.fillRect(130, 215, 100, 30);
                }

                //if random number is 3
                if(Driver.getGame1State() == 3) {
                    this.setBackground(bgColor);

                    //A
                    g2d.setPaint(randomColor);
                    g2d.fillRect(130, 120, 100, 30);

                    //B
                    g2d.setPaint(randomColor);
                    g2d.fillRect(200, 120, 30, 100);

                    //C
                    g2d.setPaint(randomColor);
                    g2d.fillRect(200, 220, 30, 100);

                    //D
                    g2d.setPaint(randomColor);
                    g2d.fillRect(130, 310, 100, 30);

                    //G
                    g2d.setPaint(randomColor);
                    g2d.fillRect(130, 215, 100, 30);
                }

                //if random number is 4
                if(Driver.getGame1State() == 4) {
                    this.setBackground(bgColor);

                    //B
                    g2d.setPaint(randomColor);
                    g2d.fillRect(200, 120, 30, 100);

                   //C
                    g2d.setPaint(randomColor);
                    g2d.fillRect(200, 220, 30, 100);

                    //F
                    g2d.setPaint(randomColor);
                    g2d.fillRect(130, 120, 30, 100);

                    //G
                    g2d.setPaint(randomColor);
                    g2d.fillRect(130, 215, 100, 30);
                }

                //if random number is 5
                if(Driver.getGame1State() == 5) {
                    this.setBackground(bgColor);

                    //A
                    g2d.setPaint(randomColor);
                    g2d.fillRect(130, 120, 100, 30);

                    //C
                    g2d.setPaint(randomColor);
                    g2d.fillRect(200, 220, 30, 100);

                    //D
                    g2d.setPaint(randomColor);
                    g2d.fillRect(130, 310, 100, 30);

                    //F
                    g2d.setPaint(randomColor);
                    g2d.fillRect(130, 120, 30, 100);

                    //G
                    g2d.setPaint(randomColor);
                    g2d.fillRect(130, 215, 100, 30);
                }

                //if random number is 6
                if(Driver.getGame1State() == 6) {
                    this.setBackground(bgColor);

                    //A
                    g2d.setPaint(randomColor);
                    g2d.fillRect(130, 120, 100, 30);

                    //C
                     g2d.setPaint(randomColor);
                     g2d.fillRect(200, 220, 30, 100);

                     //D
                     g2d.setPaint(randomColor);
                     g2d.fillRect(130, 310, 100, 30);

                     //E
                     g2d.setPaint(randomColor);
                     g2d.fillRect(130, 220, 30, 100);

                     //F
                     g2d.setPaint(randomColor);
                     g2d.fillRect(130, 120, 30, 100);

                     //G
                     g2d.setPaint(randomColor);
                     g2d.fillRect(130, 215, 100, 30);
                }

                //if random number is 7
                if(Driver.getGame1State() == 7) {
                    this.setBackground(bgColor);

                    //A
                    g2d.setPaint(randomColor);
                    g2d.fillRect(130, 120, 100, 30);

                    //B
                    g2d.setPaint(randomColor);
                    g2d.fillRect(200, 120, 30, 100);

                   //C
                    g2d.setPaint(randomColor);
                    g2d.fillRect(200, 220, 30, 100);
                }

                //if random number is 8
                if(Driver.getGame1State() == 8) {
                    this.setBackground(bgColor);

                    //A
                    g2d.setPaint(randomColor);
                    g2d.fillRect(130, 120, 100, 30);

                    //B
                    g2d.setPaint(randomColor);
                    g2d.fillRect(200, 120, 30, 100);

                    //C
                     g2d.setPaint(randomColor);
                     g2d.fillRect(200, 220, 30, 100);

                     //D
                     g2d.setPaint(randomColor);
                     g2d.fillRect(130, 310, 100, 30);

                     //E
                     g2d.setPaint(randomColor);
                     g2d.fillRect(130, 220, 30, 100);

                     //F
                     g2d.setPaint(randomColor);
                     g2d.fillRect(130, 120, 30, 100);

                     //G
                     g2d.setPaint(randomColor);
                     g2d.fillRect(130, 215, 100, 30);
                }


                //if random number is 9
                if(Driver.getGame1State() == 9) {
                    this.setBackground(bgColor);

                    //A
                    g2d.setPaint(randomColor);
                    g2d.fillRect(130, 120, 100, 30);

                    //B
                    g2d.setPaint(randomColor);
                    g2d.fillRect(200, 120, 30, 100);

                    //C
                     g2d.setPaint(randomColor);
                     g2d.fillRect(200, 220, 30, 100);

                     //D
                     g2d.setPaint(randomColor);
                     g2d.fillRect(130, 310, 100, 30);

                     //F
                     g2d.setPaint(randomColor);
                     g2d.fillRect(130, 120, 30, 100);

                     //G
                     g2d.setPaint(randomColor);
                     g2d.fillRect(130, 215, 100, 30);
                }


            }



}
