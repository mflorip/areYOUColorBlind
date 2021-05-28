package funMode;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/**
 * odd color out game (all in this class)
 *
 * @author michaelflorip
 * @version May 14, 2021
 */
public class OtherGameFun
    extends JPanel
{
    /**
     * score display
     */
    JTextPane          theScore;
    /**
     * new button
     */
    JButton            sq1;
    /**
     * new button
     */
    JButton            sq2;
    /**
     * new button
     */
    JButton            sq3;
    /**
     * new button
     */
    JButton            sq4;
    /**
     * new button
     */
    JButton            sq5;
    /**
     * new button
     */
    JButton            sq6;
    /**
     * new button
     */
    JButton            sq7;
    /**
     * new button
     */
    JButton            sq8;
    /**
     * new button
     */
    JButton            sq9;
    /**
     * new random object
     */
    Random             rand   = new Random();

    /**
     * initialize random color
     */
    Color              randomColor;
    /**
     * initialize different random color
     */
    Color              diffColor;

    /**
     * initialize gridbagconstraints object
     */
    GridBagConstraints con;
    /**
     * initialize jbutton to go to end screen
     */
    JButton            goTo;

    /**
     * score counter
     */
    int                score  = 0;
    /**
     * clicks counter
     */
    int                clicks = 0;

    /**
     * Create a new OtherGame object.
     */
    public OtherGameFun()
    {

        this.setLayout(null);
        theScore = new JTextPane();

        randomColor = DriverFun.getRandColor();

        diffColor = DriverFun.getDiffColor();

        sq1 = new JButton();
        sq2 = new JButton();
        sq3 = new JButton();
        sq4 = new JButton();
        sq5 = new JButton();
        sq6 = new JButton();
        sq7 = new JButton();
        sq8 = new JButton();
        sq9 = new JButton();

        goTo = new JButton("What Does My Score Mean?");
        goTo.setBounds(285, 470, 400, 30);
        goTo.setFont(new Font("Arial", Font.BOLD, 20));

        goTo.setBackground(Color.BLACK);
        goTo.setContentAreaFilled(true);
        goTo.setForeground(Color.WHITE);
        goTo.setBorderPainted(false);
        goTo.setOpaque(true);

        sq1.setOpaque(true);
        sq1.setBorderPainted(false);
        sq2.setOpaque(true);
        sq2.setBorderPainted(false);
        sq3.setOpaque(true);
        sq3.setBorderPainted(false);
        sq4.setOpaque(true);
        sq4.setBorderPainted(false);
        sq5.setOpaque(true);
        sq5.setBorderPainted(false);
        sq6.setOpaque(true);
        sq6.setBorderPainted(false);
        sq7.setOpaque(true);
        sq7.setBorderPainted(false);
        sq8.setOpaque(true);
        sq8.setBorderPainted(false);
        sq9.setOpaque(true);
        sq9.setBorderPainted(false);

        setLayout(null);

        theScore.setBounds(650, 290, 85, 20);
        add(theScore);

        if (DriverFun.getGame2State() == 1)
            sq1.setBackground(diffColor);
        else
            sq1.setBackground(randomColor);

        if (DriverFun.getGame2State() == 2)
            sq2.setBackground(diffColor);
        else
            sq2.setBackground(randomColor);

        if (DriverFun.getGame2State() == 3)
            sq3.setBackground(diffColor);
        else
            sq3.setBackground(randomColor);

        if (DriverFun.getGame2State() == 4)
            sq4.setBackground(diffColor);
        else
            sq4.setBackground(randomColor);

        if (DriverFun.getGame2State() == 5)
            sq5.setBackground(diffColor);
        else
            sq5.setBackground(randomColor);

        if (DriverFun.getGame2State() == 6)
            sq6.setBackground(diffColor);
        else
            sq6.setBackground(randomColor);

        if (DriverFun.getGame2State() == 7)
            sq7.setBackground(diffColor);
        else
            sq7.setBackground(randomColor);

        if (DriverFun.getGame2State() == 8)
            sq8.setBackground(diffColor);
        else
            sq8.setBackground(randomColor);

        if (DriverFun.getGame2State() == 9)
            sq9.setBackground(diffColor);
        else
            sq9.setBackground(randomColor);

        con = new GridBagConstraints();

        setBounds(0, 20, 800, 600);

        goTo.setEnabled(false);
        add(goTo);
        // if random number is 1
        sq1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                clicks++;

                if (DriverFun.getGame2State() == 1)
                {
                    nextLevel();
                    score++;
                    theScore.setText("  SCORE:  " + score);

                }

            }
        });

        // if random number is 2

        sq2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                clicks++;

                if (DriverFun.getGame2State() == 2)
                {
                    nextLevel();
                    score++;
                    theScore.setText("  SCORE:  " + score);

                }

            }
        });

        // if random number is 3

        sq3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                clicks++;

                if (DriverFun.getGame2State() == 3)
                {
                    nextLevel();
                    score++;
                    theScore.setText("  SCORE:  " + score);

                }

            }
        });

        // if random number is 4

        sq4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                clicks++;

                if (DriverFun.getGame2State() == 4)
                {
                    nextLevel();
                    score++;
                    theScore.setText("  SCORE:  " + score);

                }

            }
        });

        // if random number is 5

        sq5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                clicks++;

                if (DriverFun.getGame2State() == 5)
                {
                    nextLevel();
                    score++;
                    theScore.setText("  SCORE:  " + score);

                }

            }
        });

        // if random number is 6
        sq6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                clicks++;

                if (DriverFun.getGame2State() == 6)
                {
                    nextLevel();
                    score++;
                    theScore.setText("  SCORE:  " + score);

                }

            }
        });

        // if random number is 7
        sq7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                clicks++;

                if (DriverFun.getGame2State() == 7)
                {
                    nextLevel();
                    score++;
                    theScore.setText("  SCORE:  " + score);

                }

            }
        });

        // if random number is 8
        sq8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                clicks++;
                if (DriverFun.getGame2State() == 8)
                {
                    nextLevel();
                    score++;
                    theScore.setText("  SCORE:  " + score);

                }
            }
        });

        // if random number is 9
        sq9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                clicks++;

                if (DriverFun.getGame2State() == 9)
                {
                    nextLevel();
                    score++;
                    theScore.setText("  SCORE:  " + score);

                }
            }
        });

        goTo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent j)
            {
                DriverFun.setPage(3);

            }
        });

        sq1.setBounds(345, 150, 97, 97);
        sq2.setBounds(445, 150, 97, 97);
        sq3.setBounds(545, 150, 97, 97);
        sq4.setBounds(345, 250, 97, 97);
        sq5.setBounds(445, 250, 97, 97);
        sq6.setBounds(545, 250, 97, 97);
        sq7.setBounds(345, 350, 97, 97);
        sq8.setBounds(445, 350, 97, 97);
        sq9.setBounds(545, 350, 97, 97);

        add(sq1);
        add(sq2);
        add(sq3);
        add(sq4);
        add(sq5);
        add(sq6);
        add(sq7);
        add(sq8);
        add(sq9);

    }


    /**
     * sends game to next level
     */
    public void nextLevel()
    {
        DriverFun.generateGame2State();
        randomColor = DriverFun.getRandColor();
        diffColor = DriverFun.getDiffColor();
        if (clicks >= 14)
        {

            sq1.setEnabled(false);
            sq2.setEnabled(false);
            sq3.setEnabled(false);
            sq4.setEnabled(false);
            sq5.setEnabled(false);
            sq6.setEnabled(false);
            sq7.setEnabled(false);
            sq8.setEnabled(false);
            sq9.setEnabled(false);

            goTo.setEnabled(true);
            /*
             * if(!SwingUtilities.isEventDispatchThread()){
             * SwingUtilities.invokeLater(() -> { add(goTo); invalidate(); });
             * }else{ add(goTo); invalidate(); }
             */
            return;
        }

        if (DriverFun.getGame2State() == 1)
            sq1.setBackground(diffColor);
        else
            sq1.setBackground(randomColor);

        if (DriverFun.getGame2State() == 2)
            sq2.setBackground(diffColor);
        else
            sq2.setBackground(randomColor);

        if (DriverFun.getGame2State() == 3)
            sq3.setBackground(diffColor);
        else
            sq3.setBackground(randomColor);

        if (DriverFun.getGame2State() == 4)
            sq4.setBackground(diffColor);
        else
            sq4.setBackground(randomColor);

        if (DriverFun.getGame2State() == 5)
            sq5.setBackground(diffColor);
        else
            sq5.setBackground(randomColor);

        if (DriverFun.getGame2State() == 6)
            sq6.setBackground(diffColor);
        else
            sq6.setBackground(randomColor);

        if (DriverFun.getGame2State() == 7)
            sq7.setBackground(diffColor);
        else
            sq7.setBackground(randomColor);

        if (DriverFun.getGame2State() == 8)
            sq8.setBackground(diffColor);
        else
            sq8.setBackground(randomColor);

        if (DriverFun.getGame2State() == 9)
            sq9.setBackground(diffColor);
        else
            sq9.setBackground(randomColor);

        this.repaint();

    }



    /**
     * restarts game
     */
    public void restart()
    {

        clicks = 0;
        score = 0;

        randomColor = DriverFun.getRandColor();
        diffColor = DriverFun.getDiffColor();

        remove(goTo);
        nextLevel();

    }


    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 50));
        g.drawString("Odd Color Out", 305, 70);

        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Click on the box of the different shade!", 300, 120);

    }

}
