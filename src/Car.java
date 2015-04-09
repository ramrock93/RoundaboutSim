import java.util.ArrayList;

/**
 * Created by Ramin on 25.03.2015.
 */
public class Car
{

    private Roundabout roundabout = null;

    private int carWidth = 0;
    private int carHeight = 0;

    private int xPos = 0;
    private int yPos = 0;

    public Car(int xPos, int yPos, int carWidth, int carHeight)
    {
        this.xPos = xPos;
        this.yPos = yPos;

        this.carWidth = carWidth;
        this.carHeight = carHeight;
    }

    public void moveCar(int xPos, int yPos )
    {
        this.xPos += xPos;
        this.yPos += yPos;
    }

    public int getxPos()
    {
        return xPos;
    }

    public void setxPos(int xPos)
    {
        this.xPos = xPos;
    }

    public int getyPos()
    {
        return yPos;
    }

    public void setyPos(int yPos)
    {
        this.yPos = yPos;
    }

    public int getCarWidth()
    {
        return carWidth;
    }

    public void setCarWidth(int carWidth)
    {
        this.carWidth = carWidth;
    }

    public int getCarHeight()
    {
        return carHeight;
    }

    public void setCarHeight(int carHeight)
    {
        this.carHeight = carHeight;
    }

}
