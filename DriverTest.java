package testingMode;

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
public class DriverTest
{

    private static final Random rand1         = new Random();
    private static int          game1state    = num1to9();
    private static int          game2state    = num1tonine();

    private static Color[]      primaryColors =
        { new Color(92, 231, 0), new Color(254, 0, 0), new Color(43, 82, 255),
            new Color(201, 201, 201), new Color(255, 194, 10), new Color(153, 79, 0),
            new Color(255, 190, 106), new Color(230, 97, 0), new Color(26, 255, 26),
            new Color(254, 254, 98), new Color(0, 90, 181), new Color(26, 133, 255) };
    private static Color[]      pairColors    =
        { new Color(254, 204, 1), new Color(97, 108, 0), new Color(218, 40, 226),
            new Color(4, 224, 224), new Color(12, 123, 220), new Color(0, 108, 209),
            new Color(64, 176, 166), new Color(93, 58, 155), new Color(75, 0, 146),
            new Color(211, 95, 183), new Color(220, 50, 32), new Color(212, 17, 89) };

    private static int          colorInd      = genColorIndex();

    private static Color        randomColor   = primaryColors[colorInd];
    private static Color        diffColor     = pairColors[colorInd];
    /**
     * sets the current page
     */
    static volatile int         page          = 0;

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

    /**
     * gets randomColor for background
     * @return randomColor for background
     */
    public static Color getRandColor()
    {
        return randomColor;
    }

    /**
     * gets randomColor for number
     * @return randomColor for number
     */
    public static Color getDiffColor()
    {
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
    public DriverTest()
        throws InterruptedException
    {

        ButtonPanel bp = new ButtonPanel();
        NumGenTest ng = new NumGenTest();
        MainMenu menu = new MainMenu();
        TopMenu topMenu = new TopMenu();
        OtherGameTest game2 = new OtherGameTest();
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
        new DriverTest();

    }

}
