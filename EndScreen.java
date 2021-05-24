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

    public EndScreen() {
        title = new JLabel("What Do Your Scores Mean?", JLabel.CENTER);
        title.setFont(new Font("Arial",1,40));
        title.setForeground(Color.BLACK);

        result = new JLabel("If you received a score of:");
        result.setFont(new Font("Arial",1,30));
        result.setForeground(Color.BLACK);
        result.setBounds(150, 150, 100, 40);

        score1 = new JLabel("Less than 12");

        add(title);
        add(result);

    }





}
