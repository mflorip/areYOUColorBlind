package iColor;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

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
    JTextPane theScore;

    JButton sq1, sq2, sq3, sq4, sq5, sq6, sq7, sq8, sq9;
    Random rand = new Random();
    float r1 = (float)(rand.nextFloat() / 2f + 0.5);
    float g1 = (float)(rand.nextFloat() / 2f + 0.5);
    float b1 = (float)(rand.nextFloat() / 2f + 0.5);

    Color randomColor;
    Color diffColor;
    Color bgColor;
    GridBagConstraints con;
    JButton goTo;

    float r2 = (float)(rand.nextFloat() / 2f + 0.5);
    float g2 = (float)(rand.nextFloat() / 2f + 0.5);
    float b2 = (float)(rand.nextFloat() / 2f + 0.5);

    int score = 0;
    int clicks = 0;

    public OtherGame() {

        this.setLayout(null);
        theScore = new JTextPane();

        randomColor  = new Color(r1, g1, b1);
        diffColor = brighten(randomColor, 0.05);

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

        if(Driver.getGame2State()==1) sq1.setBackground(diffColor);
        else sq1.setBackground(randomColor);

        if(Driver.getGame2State()==2) sq2.setBackground(diffColor);
        else sq2.setBackground(randomColor);

        if(Driver.getGame2State()==3) sq3.setBackground(diffColor);
        else sq3.setBackground(randomColor);

        if(Driver.getGame2State()==4) sq4.setBackground(diffColor);
        else sq4.setBackground(randomColor);

        if(Driver.getGame2State()==5) sq5.setBackground(diffColor);
        else sq5.setBackground(randomColor);

        if(Driver.getGame2State()==6) sq6.setBackground(diffColor);
        else sq6.setBackground(randomColor);

        if(Driver.getGame2State()==7) sq7.setBackground(diffColor);
        else sq7.setBackground(randomColor);

        if(Driver.getGame2State()==8) sq8.setBackground(diffColor);
        else sq8.setBackground(randomColor);

        if(Driver.getGame2State()==9) sq9.setBackground(diffColor);
        else sq9.setBackground(randomColor);

        con = new GridBagConstraints();


        setBounds(0, 20, 800, 600);

        goTo.setEnabled(false);
        add(goTo);
        //if random number is 1
        sq1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                clicks++;

                if (Driver.getGame2State() == 1)
                {
                    Driver.generateGame2State();
                    nextLevel();
                    score++;
                    theScore.setText("  SCORE:  " + score);

                }

            }
        });

        //if random number is 2

        sq2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                clicks++;

                if (Driver.getGame2State() == 2)
                {
                    Driver.generateGame2State();
                    nextLevel();
                    score++;
                    theScore.setText("  SCORE:  " + score);

                }

            }
        });

        //if random number is 3

        sq3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                clicks++;

                if (Driver.getGame2State() == 3)
                {
                    Driver.generateGame2State();
                    nextLevel();
                    score++;
                    theScore.setText("  SCORE:  " + score);

                }

            }
        });

        //if random number is 4

        sq4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                clicks++;

                if (Driver.getGame2State() == 4)
                {
                    Driver.generateGame2State();
                    nextLevel();
                    score++;
                    theScore.setText("  SCORE:  " + score);

                }

            }
        });

        //if random number is 5

        sq5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                clicks++;

                if (Driver.getGame2State() == 5)
                {
                    Driver.generateGame2State();
                    nextLevel();
                    score++;
                    theScore.setText("  SCORE:  " + score);

                }

            }
        });

        //if random number is 6
        sq6.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            clicks++;

            if (Driver.getGame2State() == 6)
            {
                Driver.generateGame2State();
                nextLevel();
                score++;
                theScore.setText("  SCORE:  " + score);

            }

        }
    });

        //if random number is 7
        sq7.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            clicks++;

            if (Driver.getGame2State() == 7)
            {
                Driver.generateGame2State();
                nextLevel();
                score++;
                theScore.setText("  SCORE:  " + score);

            }

        }
    });

        //if random number is 8
        sq8.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            clicks++;
            if (Driver.getGame2State() == 8)
            {
                Driver.generateGame2State();
                nextLevel();
                score++;
                theScore.setText("  SCORE:  " + score);

            }
        }
    });

        //if random number is 9
        sq9.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            clicks++;

            if (Driver.getGame2State() == 9)
            {
                Driver.generateGame2State();
                nextLevel();
                score++;
                theScore.setText("  SCORE:  " + score);

            }
        }
    });

        goTo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent j)
            {
                 Driver.setPage(3);

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

    public void nextLevel(){

        if(clicks >= 14) {

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
            if(!SwingUtilities.isEventDispatchThread()){
                SwingUtilities.invokeLater(() -> {
              add(goTo);
              invalidate();
              });
              }else{
                add(goTo);
              invalidate();
              }
              */
            return;
        }

        if(Driver.getGame2State()==1) sq1.setBackground(diffColor);
        else sq1.setBackground(randomColor);

        if(Driver.getGame2State()==2) sq2.setBackground(diffColor);
        else sq2.setBackground(randomColor);

        if(Driver.getGame2State()==3) sq3.setBackground(diffColor);
        else sq3.setBackground(randomColor);

        if(Driver.getGame2State()==4) sq4.setBackground(diffColor);
        else sq4.setBackground(randomColor);

        if(Driver.getGame2State()==5) sq5.setBackground(diffColor);
        else sq5.setBackground(randomColor);

        if(Driver.getGame2State()==6) sq6.setBackground(diffColor);
        else sq6.setBackground(randomColor);

        if(Driver.getGame2State()==7) sq7.setBackground(diffColor);
        else sq7.setBackground(randomColor);

        if(Driver.getGame2State()==8) sq8.setBackground(diffColor);
        else sq8.setBackground(randomColor);

        if(Driver.getGame2State()==9) sq9.setBackground(diffColor);
        else sq9.setBackground(randomColor);

        this.repaint();

      }

    public static Color brighten(Color color, double fraction) {

        int red = (int) Math.round(Math.min(255, color.getRed() + 255 * fraction));
        int green = (int) Math.round(Math.min(255, color.getGreen() + 255 * fraction));
        int blue = (int) Math.round(Math.min(255, color.getBlue() + 255 * fraction));

        int alpha = color.getAlpha();

        return new Color(red, green, blue, alpha);

    }

    public void restart() {

        clicks = 0;
        score = 0;

        randomColor  = new Color(r1, g1, b1);
        diffColor = brighten(randomColor, 0.05);

        remove(goTo);
        nextLevel();

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 50));
        g.drawString("Odd Color Out", 305, 70);

        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Click on the box of the different shade!", 300, 120);

    }



}