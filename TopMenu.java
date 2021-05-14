package iColor;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author michaelflorip
 *  @version May 13, 2021
 */
public class TopMenu extends JPanel
{
    JButton home;
    JButton quit;


    public TopMenu() {

        this.setBackground(Color.BLACK);

        home = new JButton("HOME");
        quit = new JButton("QUIT");

        home.setFont(new Font("Arial", Font.BOLD, 20));
        quit.setFont(new Font("Arial", Font.BOLD, 20));

        add(home);
        add(quit);

        home.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                Driver.setPage(0);

            }
        });


        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });


    }


}
