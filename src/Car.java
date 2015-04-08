/**
 * Created by Ramin on 25.03.2015.
 */
public class Car
{
    private double speed = 0;
    private double acceleration = 0;

    private float xPosition = 0;
    private float yPosition = 0;

    private int carWidth = 0;
    private int carHeight = 0;

    public Car(float xPosition, float yPosition)
    {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void accelerate()
    {
        acceleration++;
    }

    public void decelerate()
    {
        acceleration--;
    }

    public float getxPosition()
    {
        return xPosition;
    }

    public void setxPosition(float xPosition)
    {
        this.xPosition = xPosition;
    }

    public float getyPosition()
    {
        return yPosition;
    }

    public void setyPosition(float yPosition)
    {
        this.yPosition = yPosition;
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
