package iColor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class ButtonPanel extends JPanel
{
    //things
    JTextField result;
    JTextField myScore;

    //los buttons
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;

    //just to make the real buttons format better
    static JProgressBar prog;

    int score = 0;

    int total = 0;


    JPanel scoNProg;


    public  ButtonPanel() {
        setBounds(10, 150, 200, 300);

        prog = new JProgressBar(0, 200);

        result= new JTextField();
        myScore = new JTextField();
        result.setBounds(450, 350, 30, 20);
        setLayout(new GridLayout(4, 3));

        //setting background of panel
        setBackground(Color.BLACK);
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

        con.gridx = 2;
        con.gridy = 3;
        add(prog, con);

        //detecting actions for button 1
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if (Driver.getGame1State() == 1)
                {
                    result.setText("  Correct!");
                    Driver.generateGame1State();
                    score++;
                    total++;
                    myScore.setText("  Score:  " + score);
                    prog.setValue(prog.getValue()+10);

                }
                else
                {
                    result.setText("  Incorrect.");
                    try
                    {
                        Thread.sleep(50);
                    }
                    catch (InterruptedException e1)
                    {
                        e1.printStackTrace();
                    }
                    total++;

                }

                if(total == 20) {

                    result.setText("Your score: " + score + "/" + 20);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);

                }

            }
        });

        // detecting actions for button 2
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                if (Driver.getGame1State() == 2)
                {
                    result.setText("  Correct!");
                    Driver.generateGame1State();
                    score++;
                    myScore.setText("  Score:  " + score);
                    prog.setValue(prog.getValue()+10);
                    total++;


                }
                else
                {
                    result.setText("  Incorrect.");
                    try
                    {
                        Thread.sleep(50);
                    }
                    catch (InterruptedException e1)
                    {
                        e1.printStackTrace();
                    }
                    total++;

                }

                if(total == 20) {

                    result.setText("Your score: " + score + "/" + 20);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                }
            }
        });

        // detecting actions for button 3
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                if (Driver.getGame1State() == 3)
                {
                    result.setText("  Correct!");
                    Driver.generateGame1State();
                    score++;
                    myScore.setText("  Score:  " + score);
                    prog.setValue(prog.getValue()+10);
                    total++;

                }
                else
                {
                    result.setText("  Incorrect.");
                    try
                    {
                        Thread.sleep(50);
                    }
                    catch (InterruptedException e1)
                    {
                        e1.printStackTrace();
                    }
                    total++;

                }

                if(total == 20) {

                    result.setText("Your score: " + score + "/" + 20);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                }
            }
        });

        // detecting actions for button 4
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                if (Driver.getGame1State() == 4)
                {
                    result.setText("  Correct!");
                    Driver.generateGame1State();
                    score++;
                    myScore.setText("  Score:  " + score);

                    prog.setValue(prog.getValue()+10);
                    total++;

                }
                else
                {
                    result.setText("  Incorrect.");
                    try
                    {
                        Thread.sleep(50);
                    }
                    catch (InterruptedException e1)
                    {
                        e1.printStackTrace();
                    }
                    total++;

                }

                if(total == 20) {

                    result.setText("Your score: " + score + "/" + 20);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                }
            }
        });

        // detecting actions for button 5
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                if (Driver.getGame1State() == 5)
                {
                    result.setText("  Correct!");
                    Driver.generateGame1State();
                    score++;
                    myScore.setText("  Score:  " + score);
                    prog.setValue(prog.getValue()+10);
                    total++;

                }
                else
                {
                    result.setText("  Incorrect.");
                    try
                    {
                        Thread.sleep(50);
                    }
                    catch (InterruptedException e1)
                    {
                        e1.printStackTrace();
                    }
                    total++;

                }

                if(total == 20) {

                    result.setText("Your score: " + score + "/" + 20);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                }
            }
        });

        // detecting actions for button 6
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                if (Driver.getGame1State() == 6)
                {
                    result.setText("  Correct!");
                    Driver.generateGame1State();
                    score++;
                    myScore.setText("  Score:  " + score);
                    prog.setValue(prog.getValue()+10);
                    total++;


                }
                else
                {
                    result.setText("  Incorrect.");
                    try
                    {
                        Thread.sleep(50);
                    }
                    catch (InterruptedException e1)
                    {
                        e1.printStackTrace();
                    }
                    total++;

                }

                if(total == 20) {

                    result.setText("Your score: " + score + "/" + 20);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                }
            }
        });

        // detecting actions for button 7
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if (Driver.getGame1State() == 7)
                {
                    result.setText("  Correct!");
                    Driver.generateGame1State();
                    score++;
                    myScore.setText("  Score:  " + score);
                    prog.setValue(prog.getValue()+10);
                    total++;


                }
                else
                {
                    result.setText("  Incorrect.");
                    try
                    {
                        Thread.sleep(50);
                    }
                    catch (InterruptedException e1)
                    {
                        e1.printStackTrace();
                    }
                    total++;

                }

                if(total == 20) {

                    result.setText("Your score: " + score + "/" + 20);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                }
            }
        });

        // detecting actions for button 8
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if (Driver.getGame1State() == 8)
                {
                    result.setText("  Correct!");
                    Driver.generateGame1State();

                    score++;
                    myScore.setText("  Score:  " + score);
                    prog.setValue(prog.getValue()+10);
                    total++;


                }
                else
                {
                    result.setText("  Incorrect.");
                    try
                    {
                        Thread.sleep(50);
                    }
                    catch (InterruptedException e1)
                    {
                        e1.printStackTrace();
                    }
                    total++;

                }

                if(total == 20) {

                    result.setText("Your score: " + score + "/" + 20);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                }
            }
        });

        // detecting actions for button 9
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if (Driver.getGame1State() == 9)
                {
                    result.setText("  Correct!");
                    Driver.generateGame1State();
                    score++;
                    myScore.setText("  Score:  " + score);
                    prog.setValue(prog.getValue()+10);
                    total++;


                }
                else
                {
                    result.setText("  Incorrect.");
                    try
                    {
                        Thread.sleep(50);
                    }
                    catch (InterruptedException e1)
                    {
                        e1.printStackTrace();
                    }
                    total++;
                }

                if(total == 20) {

                    result.setText("Your score: " + score + "/" + 20);
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                }
            }
        });


    }


}