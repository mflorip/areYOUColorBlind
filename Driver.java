package iColor;

import java.awt.BorderLayout;
import java.util.Random;
import javax.swing.JFrame;
import java.awt.Color;

/**
 * driver class runs everything
 *
 * @author michaelflorip
 * @version May 10, 2021
 */
public class Driver
{

    private static final Random rand1       = new Random();
    private static int          game1state  = num1to9();
    private static int          game2state  = num1tonine();

    private static Color[] primaryColors = {new Color(92, 231, 0), new Color(254, 0, 0), new Color(43, 82, 255), new Color(201, 201, 201)};
    private static Color[] pairColors = {new Color(254, 204, 1), new Color(97, 108, 0), new Color(218, 40, 226), new Color(4, 224, 224)};

    private static int colorInd = genColorIndex();

    private static Color        randomColor = primaryColors[colorInd];
    private static Color        diffColor = pairColors[colorInd];
    /**
     * sets the current page
     */
    static volatile int         page        = 0;

    private static int num1to9()
    { // rename to num1to9
        int num1 = rand1.nextInt(9) + 1;
        return num1;
    }


    private static int num1tonine()
    { // rename to num1to9
        int num2 = rand1.nextInt(9) + 1;
        return num2;
    }

    private static int genColorIndex()
    {
        return rand1.nextInt(primaryColors.length);
    }


    /**
     * generates random number 1-9 for game 1
     */
    public static void generateGame1State()
    {
        colorInd = genColorIndex();
        randomColor = primaryColors[colorInd];
        diffColor = pairColors[colorInd];
        game1state = num1to9();
    }


    /**
     * generates random number 1-9 for game 2
     */
    public static void generateGame2State()
    {
        colorInd = genColorIndex();
        randomColor = primaryColors[colorInd];
        diffColor = pairColors[colorInd];
        game2state = num1tonine();
    }

    public static Color getRandColor() {
        return randomColor;
    }

    public static Color getDiffColor() {
        return diffColor;
    }

    /**
     * returns random number 1-9 for game 1
     *
     * @return game 1 state
     */
    public static int getGame1State()
    {
        return game1state;
    }


    /**
     * returns random number 1-9 for game 2
     *
     * @return game 2 state
     */
    public static int getGame2State()
    {
        return game2state;
    }


    /**
     * sets the page of the game
     *
     * @param p
     *            current page
     */
    public static void setPage(int p)
    {

        page = p;

    }


    /**
     * Create a new Driver object.
     *
     * @throws InterruptedException
     *             for thread
     */
    public Driver()
        throws InterruptedException
    {

        ButtonPanel bp = new ButtonPanel();
        NumGen ng = new NumGen();
        MainMenu menu = new MainMenu();
        TopMenu topMenu = new TopMenu();
        OtherGame game2 = new OtherGame();
        EndScreen end = new EndScreen();

        // runs the frame, which has both the "buttonPanel" and "NumGen" panels
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(1000, 600);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.getContentPane();

        int prevPage = -1;

        while (true)
        {

            if (page != prevPage)
            {

                prevPage = page;
                frame.getContentPane().removeAll();

                switch (page)
                {

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

                    case 3:
                        frame.getContentPane().add(end, BorderLayout.CENTER);
                        break;

                }
                frame.repaint();
                frame.validate();

            }

            Thread.sleep(500);
        }
    }


    /**
     * Main method, runs constructor
     *
     * @param args
     *            default
     * @throws InterruptedException
     */
    @SuppressWarnings("unused")
    public static void main(String[] args)
        throws InterruptedException
    {
        new Driver();

    }

}
