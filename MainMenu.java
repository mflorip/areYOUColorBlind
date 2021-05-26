
package iColor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import javax.swing.*;
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author michaelflorip
 *  @version May 12, 2021
 */
public class MainMenu extends JPanel
{
    JButton game1;
    JButton game2;
    JButton quit;

    Random rand = new Random();
    float r1 = (float)(rand.nextFloat() / 2f + 0.5);
    float g1 = (float)(rand.nextFloat() / 2f + 0.5);
    float b1 = (float)(rand.nextFloat() / 2f + 0.5);

    Color randomColor;

    public MainMenu() {

        randomColor = new Color(r1, g1, b1);

        setBackground(randomColor);

        this.setLayout(null);

        game1 = new JButton("GAME 1");
        game2 = new JButton("GAME 2");
        quit = new JButton("QUIT");

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

        game1.setBounds(535, 300, 130, 40);
        game2.setBounds(535, 375, 130, 40);
        quit.setBounds(535, 450, 130, 40);

        add(game1);
        add(game2);
        add(quit);

        //detecting actions for play game 1
        game1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                Driver.generateGame1State();
                Driver.setPage(1);
            }
        });

        game2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                Driver.setPage(2);
            }
        });


        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });


    }


    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 50));
        g.drawString("Are YOU Color Blind?", 330, 200);

        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Color Blindness Tester", 480, 260);

    }
}