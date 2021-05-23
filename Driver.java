package iColor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
    private static int game1state = num1to9();
    private static int game2state = num1to4();

    static volatile int page = 0;

    private static int num1to9() { //rename to num1to9
        int num1 = rand1.nextInt(9) + 1;
        return num1;
    }

    private static int num1to4() { //rename to num1to9
        int num2 = rand1.nextInt(4) + 1;
        return num2;
    }

    public static void generateGame1State() {
        game1state = num1to9();
    }

    public static void generateGame2State() {
        game2state = num1to4();
    }

    public static int getGame1State() {
        return game1state;
    }

    public static int getGame2State() {
        return game2state;
    }

    public static void setPage(int p) {

        page = p;

    }

    public Driver() throws InterruptedException {

        ButtonPanel bp = new ButtonPanel();
        NumGen ng = new NumGen();
        MainMenu menu = new MainMenu();
        TopMenu topMenu = new TopMenu();
        OtherGame game2 = new OtherGame();

        //runs the frame, which has both the "buttonPanel" and "NumGen" panels
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.getContentPane();

        int prevPage = -1;

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
                        frame.getContentPane().add(topMenu, BorderLayout.NORTH);
                        frame.getContentPane().add(game2);
                        break;

                }
                frame.repaint();
                frame.validate();

            }

            Thread.sleep(500);
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        new Driver();

    }

}
