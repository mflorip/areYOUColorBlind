package iColor;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author michaelflorip
 *  @version May 23, 2021
 */
public class EndScreen extends JPanel
{

    JLabel title, result, score1;
    JButton home;
    JButton quit;


    public EndScreen() {

        quit = new JButton("QUIT");
        this.setLayout(null);

        home = new JButton("HOME");


        quit.setBackground(Color.BLACK);
        quit.setContentAreaFilled(true);
        quit.setForeground(Color.WHITE);
        quit.setBorderPainted(false);
        quit.setOpaque(true);

        home.setBackground(Color.BLACK);
        home.setContentAreaFilled(true);
        home.setForeground(Color.WHITE);
        home.setBorderPainted(false);
        home.setOpaque(true);

        quit.setFont(new Font("Arial", Font.BOLD, 20));
        home.setFont(new Font("Arial", Font.BOLD, 20));

        home.setBounds(430, 500, 130, 40);
        quit.setBounds(430, 450, 130, 40);

        add(quit);
        add(home);

        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });

        home.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                Driver.setPage(0);
            }
        });

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 50));
        g.drawString("What Does My Score Mean?", 170, 100);

        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.drawString("If you received a score...", 330, 220);

        g.setFont(new Font("Arial", Font.BOLD, 20));

        g.drawString("Less than 8    -    Your score indicates you have serious color vision deficiency. ", 170, 330);

        g.drawString("8 to 12    -    Your score may indicate you have some color vision deficiency. ", 215, 370);

        g.drawString("12 to 14    -    Your score indicates normal color vision. ", 204, 410);

    }





}
