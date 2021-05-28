
package testingMode;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

/**
 * main menu class
 *
 * @author michaelflorip
 * @version May 12, 2021
 */
public class MainMenu
    extends JPanel
{
    /**
     * num dumb game
     */
    JButton game1;
    /**
     * odd color out
     */
    JButton game2;
    /**
     * quit button
     */
    JButton quit;

    /**
     * random object
     */
    Random  rand = new Random();
    /**
     * random float
     */
    float   r1   = (float)(rand.nextFloat() / 2f + 0.5);
    /**
     * random float
     */
    float   g1   = (float)(rand.nextFloat() / 2f + 0.5);
    /**
     * random float
     */
    float   b1   = (float)(rand.nextFloat() / 2f + 0.5);

    /**
     * random Color object
     */
    Color   randomColor;

    /**
     * Create a new MainMenu object.
     */
    public MainMenu()
    {

        randomColor = new Color(r1, g1, b1);

        setBackground(randomColor);

        this.setLayout(null);

        game1 = new JButton("Num Dumb");
        game2 = new JButton("Odd Color Out");
        quit = new JButton("Quit");

        game1.setBackground(Color.BLACK);
        game1.setContentAreaFilled(true);
        game1.setForeground(Color.WHITE);
        game1.setBorderPainted(false);
        game1.setOpaque(true);

        game2.setBackground(Color.BLACK);
        game2.setContentAreaFilled(true);
        game2.setForeground(Color.WHITE);
        game2.setBorderPainted(false);
        game2.setOpaque(true);

        quit.setBackground(Color.BLACK);
        quit.setContentAreaFilled(true);
        quit.setForeground(Color.WHITE);
        quit.setBorderPainted(false);
        quit.setOpaque(true);

        game1.setFont(new Font("Arial", Font.BOLD, 20));
        game2.setFont(new Font("Arial", Font.BOLD, 20));
        quit.setFont(new Font("Arial", Font.BOLD, 20));

        game1.setBounds(375, 300, 230, 40);
        game2.setBounds(375, 375, 230, 40);
        quit.setBounds(375, 450, 230, 40);

        add(game1);
        add(game2);
        add(quit);

        // detecting actions for play game 1
        game1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                DriverTest.generateGame1State();
                DriverTest.setPage(1);
            }
        });

        game2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                DriverTest.setPage(2);
            }
        });

        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });

    }


    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 50));
        g.drawString("Are YOU Color Blind?", 220, 200);

        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Color Vision Tester", 400, 260);

    }
}
