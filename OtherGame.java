package iColor;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author michaelflorip
 *  @version May 14, 2021
 */
public class OtherGame extends JPanel
{

    JButton        sq1, sq2, sq3, sq4;
    Random rand = new Random();
    float r1 = (float)(rand.nextFloat() / 2f + 0.5);
    float g1 = (float)(rand.nextFloat() / 2f + 0.5);
    float b1 = (float)(rand.nextFloat() / 2f + 0.5);
    JTextField     result;
    Color diffColor;
    Color randomColor;
    Color bgColor;

    float r2 = (float)(rand.nextFloat() / 2f + 0.5);
    float g2 = (float)(rand.nextFloat() / 2f + 0.5);
    float b2 = (float)(rand.nextFloat() / 2f + 0.5);


    public OtherGame() {
        sq1 = new JButton();
        sq2 = new JButton();
        sq3 = new JButton();
        sq4 = new JButton();

        sq1.setOpaque(true);
        sq1.setBorderPainted(false);
        sq2.setOpaque(true);
        sq2.setBorderPainted(false);
        sq3.setOpaque(true);
        sq3.setBorderPainted(false);
        sq4.setOpaque(true);
        sq4.setBorderPainted(false);
        nextLevel();

        setLayout(null);

        setBounds(0, 20, 800, 600);
        result = new JTextField(16);
        result.setBounds(350, 350, 100, 30);
        bgColor = new Color(r2, g2, b2);
        setBackground(bgColor);


        //if random number is 1
        if(Driver.getGame2State() == 1) {
            sq1.setBackground(diffColor);
        }
        else
        {
            sq1.setBackground(randomColor);
        }
        sq1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                if (Driver.getGame2State() == 1)
                {
                    result.setText("Correct!");
                    Driver.generateGame2State();
                    nextLevel();
                }
                else
                {
                    result.setText("Incorrect.");
                }
            }
        });

        //if random number is 2
        if(Driver.getGame2State() == 2) {
            sq2.setBackground(diffColor);
            //g2d.setPaint(diffColor);
            //g2d.fillRect(275, 150, 97, 97);
        }
        else
        {
            sq2.setBackground(randomColor);
        }
        sq2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                if (Driver.getGame2State() == 2)
                {
                    result.setText("Correct!");
                    Driver.generateGame2State();
                    nextLevel();

                }
                else
                {
                    result.setText("Incorrect.");
                }
            }
        });

        //if random number is 3
        if(Driver.getGame2State() == 3) {
            sq3.setBackground(diffColor);
        }
        else
        {
            sq3.setBackground(randomColor);
        }
        sq3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                if (Driver.getGame2State() == 3)
                {
                    result.setText("Correct!");
                    Driver.generateGame2State();
                    nextLevel();

                }
                else
                {
                    result.setText("Incorrect.");
                }
            }
        });

        //if random number is 4
        if(Driver.getGame2State() == 4) {
            sq4.setBackground(diffColor);
        }
        else
        {
            sq4.setBackground(randomColor);
        }
        sq4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                if (Driver.getGame2State() == 4)
                {
                    result.setText("Correct!");
                    Driver.generateGame2State();
                    nextLevel();
                }
                else
                {
                    result.setText("Incorrect.");
                }
            }
        });

        sq1.setBounds(275, 150, 97, 97);
        sq2.setBounds(375, 150, 97, 97);
        sq3.setBounds(275, 250, 97, 97);
        sq4.setBounds(375, 250, 97, 97);

        add(sq1);
        add(sq2);
        add(sq3);
        add(sq4);
        add(result);



    }

    public void nextLevel(){

        randomColor = new Color(r1, g1, b1);
        diffColor = brighten(randomColor, 0.1);

        if(Driver.getGame2State()==1) sq1.setBackground(diffColor);
        else sq1.setBackground(randomColor);

        if(Driver.getGame2State()==2) sq2.setBackground(diffColor);
        else sq2.setBackground(randomColor);

        if(Driver.getGame2State()==3) sq3.setBackground(diffColor);
        else sq3.setBackground(randomColor);

        if(Driver.getGame2State()==4) sq4.setBackground(diffColor);
        else sq4.setBackground(randomColor);

        this.repaint();

      }

    public static Color brighten(Color color, double fraction) {

        int red = (int) Math.round(Math.min(255, color.getRed() + 255 * fraction));
        int green = (int) Math.round(Math.min(255, color.getGreen() + 255 * fraction));
        int blue = (int) Math.round(Math.min(255, color.getBlue() + 255 * fraction));

        int alpha = color.getAlpha();

        return new Color(red, green, blue, alpha);

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

    }


}