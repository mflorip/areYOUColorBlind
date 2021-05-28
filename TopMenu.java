package funMode;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * creates top menu that appears in both games
 *
 * @author michaelflorip
 * @version May 13, 2021
 */
public class TopMenu
    extends JPanel
{
    /**
     * home button
     */
    JButton home;
    /**
     * quit button
     */
    JButton quit;

    /**
     * Create a new TopMenu object.
     */
    public TopMenu()
    {

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
                DriverFun.setPage(0);
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
