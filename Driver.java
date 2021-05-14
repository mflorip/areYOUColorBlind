package iColor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;
import javax.swing.JFrame;

/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author michaelflorip
 *  @version May 10, 2021
 */
public class Driver
{

    private static final Random rand1 = new Random();
    private static int game1state = level();

    static int page = 0;

    private static int level() { //rename to num1to9
        int r = rand1.nextInt(9) + 1;
        return r;
    }

    public static void generateGame1State() {

        game1state = level();

    }

    public static int getGame1State() {
        return game1state;
    }

    public static void setPage(int p) {

        page = p;

    }

    public Driver() throws InterruptedException {

        ButtonPanelThing bp = new ButtonPanelThing();
        NumGen ng = new NumGen();
        TheMenu menu = new TheMenu();
        TopMenu topMenu = new TopMenu();

        //runs the frame, which has both the "buttonPanelThingy" and "NumGen" panels
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.getContentPane();


        int prevPage = -1;
        int prevGame1State= game1state;

        while(true) {

            if(page != prevPage) {

                prevPage = page;
                frame.getContentPane().removeAll();

                switch(page) {

                    case 0:
                        frame.getContentPane().add(menu, BorderLayout.CENTER);
                        break;

                    case 1:
                        frame.getContentPane().add(topMenu, BorderLayout.NORTH);
                        frame.getContentPane().add(bp, BorderLayout.EAST);
                        frame.getContentPane().add(ng);
                        break;

                    case 2:
                        frame.getContentPane().add(topMenu);
                        //andy's stuff
                        break;

                }
                frame.repaint();
                frame.validate();

            }

            if(game1state != prevGame1State) {

                prevGame1State = game1state;

                frame.getContentPane().removeAll();

                frame.getContentPane().add(topMenu, BorderLayout.NORTH);
                frame.getContentPane().add(bp, BorderLayout.EAST);
                frame.getContentPane().add(ng);

                frame.repaint();

                frame.validate();

            }

            Thread.sleep(100);


        }

    }

    public static void main(String[] args) throws InterruptedException
    {
        new Driver();

    }

}