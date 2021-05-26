package iColor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class ButtonPanel extends JPanel
{
    //things
    JTextPane myScore;
    JButton goTo;
    //los buttons
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;

    //just to make the real buttons format better
    static JProgressBar prog;

    int score = 0;

    int total = 0;

    JPanel scoNProg;


    public  ButtonPanel() {


        setBounds(10, 150, 200, 300);

        prog = new JProgressBar(0, 14);

        goTo = new JButton("What Does My Score Mean?");
        goTo.setBounds(600, 200, 50, 30);

        myScore = new JTextPane();
        setLayout(new GridLayout(4, 3));

        //setting background of panel
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        b1 = new JButton ("1");
        b2 = new JButton ("2");
        b3 = new JButton ("3");
        b4 = new JButton ("4");
        b5 = new JButton ("5");
        b6 = new JButton ("6");
        b7 = new JButton ("7");
        b8 = new JButton ("8");
        b9 = new JButton ("9");

        //font size
        b1.setFont(new Font("Arial", Font.BOLD, 40));
        b2.setFont(new Font("Arial", Font.BOLD, 40));
        b3.setFont(new Font("Arial", Font.BOLD, 40));
        b4.setFont(new Font("Arial", Font.BOLD, 40));
        b5.setFont(new Font("Arial", Font.BOLD, 40));
        b6.setFont(new Font("Arial", Font.BOLD, 40));
        b7.setFont(new Font("Arial", Font.BOLD, 40));
        b8.setFont(new Font("Arial", Font.BOLD, 40));
        b9.setFont(new Font("Arial", Font.BOLD, 40));

        goTo.setBackground(Color.BLACK);
        goTo.setContentAreaFilled(true);
        goTo.setForeground(Color.WHITE);
        goTo.setBorderPainted(false);
        goTo.setOpaque(true);

        goTo.setFont(new Font("Arial", Font.BOLD, 20));
        goTo.setBounds(600, 50, 130, 40);

        GridBagConstraints con = new GridBagConstraints();

        con.gridx = 0;
        con.gridy = 0;
        add (b1, con);

        con.gridx = 1;
        add (b2, con);

        con.gridx = 2;
        add (b3, con);

        con.gridx = 0;
        con.gridy = 1;
        add (b4, con);

        con.gridx = 1;
        add (b5, con);

        con.gridx = 2;
        add (b6, con);

        con.gridx = 0;
        con.gridy = 2;
        add (b7, con);

        con.gridx = 1;
        add (b8, con);

        con.gridx = 1;
        con.gridy = 2;
        add (b9, con);

        con.gridx = 1;
        con.gridy = 3;
        add(prog, con);

        con.gridx = 2;
        con.gridy = 3;
        add(myScore, con);

        //detecting actions for button 1
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                if (Driver.getGame1State() == 1)
                {

                    Driver.generateGame1State();
                    score++;
                    total++;
                    myScore.setText("  SCORE:  " + score);

                    prog.setValue(prog.getValue()+1);

                }
                else
                {


                    total++;

                }

                if(total == 14) {

                    remove(b1);
                    remove(b2);
                    remove(b3);
                    remove(b4);
                    remove(b5);
                    remove(b6);
                    remove(b7);
                    remove(b8);
                    remove(b9);

                    add(goTo);

                }

            }
        });

        // detecting actions for button 2
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                if (Driver.getGame1State() == 2)
                {

                    Driver.generateGame1State();
                    score++;
                    myScore.setText("  SCORE:  " + score);


                    prog.setValue(prog.getValue()+1);

                    total++;


                }
                else
                {

                    total++;

                }

                if(total == 14) {


                    remove(b1);
                    remove(b2);
                    remove(b3);
                    remove(b4);
                    remove(b5);
                    remove(b6);
                    remove(b7);
                    remove(b8);
                    remove(b9);

                    add(goTo);

                }

            }
        });

        // detecting actions for button 3
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                if (Driver.getGame1State() == 3)
                {


                    Driver.generateGame1State();
                    score++;
                    myScore.setText("  SCORE:  " + score);




                    prog.setValue(prog.getValue()+1);

                    total++;

                }
                else
                {

                    total++;

                }

                if(total == 14) {


                    remove(b1);
                    remove(b2);
                    remove(b3);
                    remove(b4);
                    remove(b5);
                    remove(b6);
                    remove(b7);
                    remove(b8);
                    remove(b9);

                    add(goTo);

                }

            }
        });

        // detecting actions for button 4
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                if (Driver.getGame1State() == 4)
                {


                    Driver.generateGame1State();
                    score++;
                    myScore.setText("  SCORE:  " + score);




                    prog.setValue(prog.getValue()+1);

                    total++;

                }
                else
                {


                    total++;

                }

                if(total == 14) {


                    remove(b1);
                    remove(b2);
                    remove(b3);
                    remove(b4);
                    remove(b5);
                    remove(b6);
                    remove(b7);
                    remove(b8);
                    remove(b9);

                    add(goTo);

                }

            }
        });

        // detecting actions for button 5
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                if (Driver.getGame1State() == 5)
                {

                    Driver.generateGame1State();
                    score++;
                    myScore.setText("  SCORE:  " + score);




                    prog.setValue(prog.getValue()+1);

                    total++;

                }
                else
                {


                    total++;

                }

                if(total == 14) {


                    remove(b1);
                    remove(b2);
                    remove(b3);
                    remove(b4);
                    remove(b5);
                    remove(b6);
                    remove(b7);
                    remove(b8);
                    remove(b9);

                    add(goTo);

                }

            }
        });

        // detecting actions for button 6
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                if (Driver.getGame1State() == 6)
                {


                    Driver.generateGame1State();
                    score++;
                    myScore.setText("  SCORE:  " + score);




                    prog.setValue(prog.getValue()+1);

                    total++;


                }
                else
                {

                    total++;

                }

                if(total == 14) {


                    remove(b1);
                    remove(b2);
                    remove(b3);
                    remove(b4);
                    remove(b5);
                    remove(b6);
                    remove(b7);
                    remove(b8);
                    remove(b9);

                    add(goTo);

                }

            }
        });

        // detecting actions for button 7
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if (Driver.getGame1State() == 7)
                {


                    Driver.generateGame1State();
                    score++;
                    myScore.setText("  SCORE:  " + score);




                    prog.setValue(prog.getValue()+1);

                    total++;


                }
                else
                {

                    total++;

                }

                if(total == 14) {


                    remove(b1);
                    remove(b2);
                    remove(b3);
                    remove(b4);
                    remove(b5);
                    remove(b6);
                    remove(b7);
                    remove(b8);
                    remove(b9);

                    add(goTo);

                }

            }
        });

        // detecting actions for button 8
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                if (Driver.getGame1State() == 8)
                {

                    Driver.generateGame1State();

                    score++;
                    myScore.setText("  SCORE:  " + score);


                    prog.setValue(prog.getValue()+1);

                    total++;


                }
                else
                {


                    total++;

                }

                if(total == 14) {


                    remove(b1);
                    remove(b2);
                    remove(b3);
                    remove(b4);
                    remove(b5);
                    remove(b6);
                    remove(b7);
                    remove(b8);
                    remove(b9);

                    add(goTo);

                }
            }
        });

        // detecting actions for button 9
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if (Driver.getGame1State() == 9)
                {

                    Driver.generateGame1State();
                    score++;
                    myScore.setText("  SCORE:  " + score);

                    prog.setValue(prog.getValue()+1);

                    total++;

                }
                else
                {

                    total++;
                }

                if(total == 14) {

                    remove(b1);
                    remove(b2);
                    remove(b3);
                    remove(b4);
                    remove(b5);
                    remove(b6);
                    remove(b7);
                    remove(b8);
                    remove(b9);

                    add(goTo);

                }

            }
        });



        goTo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent j)
            {
                 Driver.setPage(3);

            }
        });



    }


}