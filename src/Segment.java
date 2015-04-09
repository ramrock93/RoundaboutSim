/**
 * Created by Ramin on 08.04.2015.
 */
public class Segment
{
    private int segmentWidth = 0;
    private int segmentHeight = 0;

    private int segmentID = 0;

    private int xPos = 0;
    private  int yPos = 0;

    private Car car = null;

    public Segment(int segmentWidth, int segmentHeight, int segmentID, int xPos, int yPos)
    {
        this.segmentWidth = segmentWidth;
        this.segmentHeight = segmentHeight;
        this.segmentID = segmentID;

        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Segment()
    {

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

    public  void setyPos(int yPos)
    {
        this.yPos = yPos;
    }

    public int getSegmentID()
    {
        return segmentID;
    }

    public void setSegmentID(int segmentID)
    {
         this.segmentID = segmentID;
    }

    public int getSegmentWidth()
    {
        return segmentWidth;
    }

    public void setSegmentWidth(int segmentWidth)
    {
        this.segmentWidth = segmentWidth;
    }

    public int getSegmentHeight()
    {
        return segmentHeight;
    }

    public void setSegmentHeight(int segmentHeight)
    {
        this.segmentHeight = segmentHeight;
    }

}
