package iColor;

import java.awt.*;
import javax.swing.JPanel;

/**
 * generates the number for num dumb game
 *
 * @author michaelflorip
 * @version May 26, 2021
 */
public class NumGen
    extends JPanel
{

    /**
     * randomColor object for number
     */
    Color  randomColor;

    /**
     * randomColor object for background
     */
    Color  bgColor;

    public void paintComponent(Graphics g)
    {
        bgColor = new Color(Driver.getG1Red(), Driver.getG1Green(), Driver.getG1Blue());
        randomColor = brighten(bgColor, 0.05);

        super.paintComponent(g);
        this.setBackground(Color.GREEN);

        Graphics2D g2d = (Graphics2D)g;

        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Choose the number in the keypad that ", 40, 450);
        g.drawString("corresponds to the number shown above. ", 40, 480);
        g.drawString("You get 14 CLICKS for this game.", 40, 510);

        // if random number is 1
        if (Driver.getGame1State() == 1)
        {
            this.setBackground(bgColor);

            // B
            g2d.setPaint(randomColor);
            g2d.fillRect(250, 120, 30, 100);

            // C
            g2d.setPaint(randomColor);
            g2d.fillRect(250, 220, 30, 100);
        }

        // if random number is 2
        if (Driver.getGame1State() == 2)
        {
            this.setBackground(bgColor);

            // A
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 120, 100, 30);

            // B
            g2d.setPaint(randomColor);
            g2d.fillRect(300, 120, 30, 100);

            // D
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 310, 100, 30);

            // E
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 220, 30, 100);

            // G
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 215, 100, 30);
        }

        // if random number is 3
        if (Driver.getGame1State() == 3)
        {
            this.setBackground(bgColor);

            // A
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 120, 100, 30);

            // B
            g2d.setPaint(randomColor);
            g2d.fillRect(300, 120, 30, 100);

            // C
            g2d.setPaint(randomColor);
            g2d.fillRect(300, 220, 30, 100);

            // D
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 310, 100, 30);

            // G
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 215, 100, 30);
        }

        // if random number is 4
        if (Driver.getGame1State() == 4)
        {
            this.setBackground(bgColor);

            // B
            g2d.setPaint(randomColor);
            g2d.fillRect(300, 120, 30, 100);

            // C
            g2d.setPaint(randomColor);
            g2d.fillRect(300, 220, 30, 100);

            // F
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 120, 30, 100);

            // G
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 215, 100, 30);
        }

        // if random number is 5
        if (Driver.getGame1State() == 5)
        {
            this.setBackground(bgColor);

            // A
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 120, 100, 30);

            // C
            g2d.setPaint(randomColor);
            g2d.fillRect(300, 220, 30, 100);

            // D
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 310, 100, 30);

            // F
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 120, 30, 100);

            // G
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 215, 100, 30);
        }

        // if random number is 6
        if (Driver.getGame1State() == 6)
        {
            this.setBackground(bgColor);

            // A
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 120, 100, 30);

            // C
            g2d.setPaint(randomColor);
            g2d.fillRect(300, 220, 30, 100);

            // D
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 310, 100, 30);

            // E
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 220, 30, 100);

            // F
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 120, 30, 100);

            // G
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 215, 100, 30);
        }

        // if random number is 7
        if (Driver.getGame1State() == 7)
        {
            this.setBackground(bgColor);

            // A
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 120, 100, 30);

            // B
            g2d.setPaint(randomColor);
            g2d.fillRect(300, 120, 30, 100);

            // C
            g2d.setPaint(randomColor);
            g2d.fillRect(300, 220, 30, 100);
        }

        // if random number is 8
        if (Driver.getGame1State() == 8)
        {
            this.setBackground(bgColor);

            // A
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 120, 100, 30);

            // B
            g2d.setPaint(randomColor);
            g2d.fillRect(300, 120, 30, 100);

            // C
            g2d.setPaint(randomColor);
            g2d.fillRect(300, 220, 30, 100);

            // D
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 310, 100, 30);

            // E
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 220, 30, 100);

            // F
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 120, 30, 100);

            // G
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 215, 100, 30);
        }

        // if random number is 9
        if (Driver.getGame1State() == 9)
        {
            this.setBackground(bgColor);

            // A
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 120, 100, 30);

            // B
            g2d.setPaint(randomColor);
            g2d.fillRect(300, 120, 30, 100);

            // C
            g2d.setPaint(randomColor);
            g2d.fillRect(300, 220, 30, 100);

            // D
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 310, 100, 30);

            // F
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 120, 30, 100);

            // G
            g2d.setPaint(randomColor);
            g2d.fillRect(230, 215, 100, 30);
        }

    }


    /**
     * brightens a color taken as a parameter
     *
     * @param color
     *            parameter
     * @param fraction
     *            how much
     * @return the new brightened color
     */
    public static Color brighten(Color color, double fraction)
    {

        int red = (int)Math.round(Math.min(255, color.getRed() + 255 * fraction));
        int green = (int)Math.round(Math.min(255, color.getGreen() + 255 * fraction));
        int blue = (int)Math.round(Math.min(255, color.getBlue() + 255 * fraction));

        int alpha = color.getAlpha();

        return new Color(red, green, blue, alpha);

    }

}
