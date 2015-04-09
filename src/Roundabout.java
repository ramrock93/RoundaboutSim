/**
 * Created by Ramin on 25.03.2015.
 */

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Random;

public class Roundabout extends PApplet
{
    Car car = new Car( 0, 0, 15, 15 );

    // Road 1
    private ArrayList<Segment> roadIn1 = null;
    private ArrayList<Segment> roadOut1 = null;

    // Road 2
    private ArrayList<Segment> roadIn2 = null;
    private ArrayList<Segment> roadOut2 = null;

    // Road 3
    private ArrayList<Segment> roadIn3 = null;
    private ArrayList<Segment> roadOut3 = null;

    // Roundabout
    private ArrayList<Segment> roundabout = null;

    public void setup()
    {
        size( 610, 610 );
        if(frame != null)
        {
            frame.setResizable( false );
        }



        // ------------------------------------------>
        // Road 1
        roadIn1 = new ArrayList<Segment>();
        roadOut1 = new ArrayList<Segment>();

        // Road 2
        roadIn2 = new ArrayList<Segment>();
        roadOut2 = new ArrayList<Segment>();

        // Road 3
        roadIn3 = new ArrayList<Segment>();
        roadOut3 = new ArrayList<Segment>();

        // Roundabout
        roundabout = new ArrayList<Segment>();
        // ------------------------------------------->

        // ------------------------------------------->
        // Road 1 (length 10 segments)
        initiateSegmentsOnRoadIn1( 10 );
        initiateSegmentsOnRoadOut1( 10 );

        // Road 2 (length 10 segments)
        initiateSegmentsOnRoadIn2( 10 );
        initiateSegmentsOnRoadOut2( 10 );

        // Road 3 (length 10 segments)
        initiateSegmentsOnRoadIn3( 10 );
        initiateSegmentsOnRoadOut3( 10 );

        // Roundabout (length 29 segments)
        initiateSegmentsOnRoundabout( 29 );

        // ------------------------------------------->
    }


    public void draw()
    {
        background( 0, 255, 0 );

        // Drawing the roads
        drawRoadIn1();
        drawRoadOut1();

        drawRoadIn2();
        drawRoadOut2();

        drawRoadIn3();
        drawRoadOut3();

        drawRoundabout();

        fill(150, 150, 150);
        arc(0, 0, 162, 162, 0, 2*PI, OPEN);

        fill(200, 200, 200);
        arc(0, 0, 90, 90, 0, 2*PI, OPEN);
    }

    public ArrayList<Segment> getRoadIn1()
    {
        return roadIn1;
    }

    public ArrayList<Segment> getRoadOut1()
    {
        return roadOut1;
    }

    public ArrayList<Segment> getRoadIn2()
    {
        return roadIn2;
    }

    public ArrayList<Segment> getRoadOut2()
    {
        return roadOut2;
    }

    public ArrayList<Segment> getRoadIn3()
    {
        return roadIn3;
    }

    public ArrayList<Segment> getRoadOut3()
    {
        return roadOut3;
    }

    public ArrayList<Segment> getRoundabout()
    {
        return roundabout;
    }

    //-------------------------------- Road 1 ---------------------------------->
    public void initiateSegmentsOnRoadIn1(int amountsOfSegments)
    {
        int xPos = 3;
        int yPos = ( height / 2 ) + 10;

        for(int i = 0; i < amountsOfSegments; i++)
        {
            roadIn1.add( new Segment( 20, 20, i, xPos, yPos));
            //println( xPos + " : " + yPos );
            xPos += roadIn1.get( i ).getSegmentWidth() + 1;
        }
    }

    public void initiateSegmentsOnRoadOut1(int amountsOfSegments)
    {
        int xPos = 3;
        int yPos = ( height / 2 ) - 10;

        for(int i = 0; i < amountsOfSegments; i++)
        {
            roadOut1.add( new Segment( 20, 20, i, xPos, yPos) );
            println( xPos + " : " + yPos );
            xPos += roadOut1.get( i ).getSegmentWidth() + 1;
        }
    }
    //-------------------------------- Road 1 ---------------------------------->

    //-------------------------------- Road 2 ---------------------------------->
    public void initiateSegmentsOnRoadIn2(int amountsOfSegments)
    {
        int xPos = width-10;
        int yPos = ( height / 2 ) - 10;

        for(int i = 0; i < amountsOfSegments; i++)
        {
            roadIn2.add( new Segment( 20, 20, i, xPos,  yPos) );
            xPos -= roadIn2.get( i ).getSegmentWidth() + 1;
        }

    }

    public void initiateSegmentsOnRoadOut2(int amountsOfSegments)
    {
        int xPos = width-10;
        int yPos = ( height / 2 ) + 10;

        for(int i = 0; i < amountsOfSegments; i++)
        {
            roadOut2.add( new Segment( 20, 20, i, xPos, yPos ) );
            xPos -= roadOut2.get( i ).getSegmentWidth() + 1;
        }
    }
    //-------------------------------- Road 2 ---------------------------------->

    //-------------------------------- Road 3 ---------------------------------->
    public void initiateSegmentsOnRoadIn3(int amountsOfSegments)
    {
        int xPos = (width / 2 ) + 10;
        int yPos = 5;

        for(int i = 0; i < amountsOfSegments; i++)
        {
            roadIn3.add( new Segment( 20, 20, i, xPos, yPos ) );
            yPos += roadIn3.get( i ).getSegmentHeight() + 1;
        }
    }

    public void initiateSegmentsOnRoadOut3(int amountsOfSegments)
    {
        int xPos = (width / 2 ) - 10;
        int yPos = 5;

        for(int i = 0; i < amountsOfSegments; i++)
        {
            roadOut3.add( new Segment( 20, 20, i, xPos, yPos ) );
            yPos += roadOut3.get( i ).getSegmentWidth() + 1;
        }
    }
    //-------------------------------- Road 1 ---------------------------------->

    //-------------------------------- Roundabout ------------------------------>
    public void initiateSegmentsOnRoundabout(int amountsOfSegments)
    {
        for(int i = 0; i < amountsOfSegments; i++)
        {
            roundabout.add( new Segment( 20, 20, i, getX(), getY() ) );
        }
    }
    //-------------------------------- Roundabout ------------------------------>

    //------------------------------------------- Road 1 -------------------------------------------------->
    public void drawRoadIn1()
    {
        int segmentIndex = 0;
        int xPos = 3;
        int yPos = ( height / 2 ) + 10;


        for(int i = 0; i < roadIn1.size(); i++)
        {
            fill(150, 150, 150);
            rect( xPos, yPos, roadIn1.get( i ).getSegmentWidth(), roadIn1.get( i ).getSegmentHeight() );

            fill( 255 );
            text( segmentIndex, xPos, yPos );

            car.setxPos( roadIn1.get( 0 ).getxPos() );
            car.setyPos( roadIn1.get( 0 ).getyPos() );

             car.moveCar( roadIn1.get( i ).getxPos(), roadIn1.get( i ).getyPos());

            fill( 255, 0, 0 );
            drawCar(car, car.getxPos(), car.getyPos(), car.getCarWidth(), car.getCarWidth() );

            car.moveCar( roadIn1.get( i ).getxPos(), roadIn1.get( i ).getyPos() );

            xPos += roadIn1.get( i ).getSegmentWidth() + 1;
            segmentIndex++;
        }

    }

    public void drawRoadOut1()
    {
        int segmentIndex = roadOut1.size()-1;
        int xPos = 3;
        int yPos = ( height / 2 ) - 10;

        for(int i = 0; i < roadOut1.size(); i++)
        {
            fill(150, 150, 150);
            rect( xPos, yPos, roadOut1.get( i ).getSegmentWidth(), roadOut1.get( i ).getSegmentHeight() );
            fill( 255 );
            text(segmentIndex, xPos, yPos);
            xPos += roadOut1.get( i ).getSegmentWidth() + 1;
            segmentIndex--;
        }
    }
    //------------------------------------------- Road 1 -------------------------------------------------->

    //------------------------------------------- Road 2 -------------------------------------------------->
    public void drawRoadIn2()
    {
        int segmentIndex = 0;
        int xPos = width-10;
        int yPos = ( height / 2 ) - 10;

        for(int i = 0; i < roadIn2.size(); i++)
        {
            fill(150, 150, 150);
            rect( xPos, ( height / 2 ) - 10, roadIn2.get( i ).getSegmentWidth(), roadIn2.get( i ).getSegmentHeight() );
            fill( 255 );
            text(segmentIndex, xPos, yPos);
            xPos -= roadIn2.get( i ).getSegmentWidth() + 1;
            segmentIndex++;
        }
    }

    public void drawRoadOut2()
    {
        int segmentIndex = roadOut2.size()-1;
        int xPos = width-10;
        int yPos = ( height / 2 ) + 10 ;

        for(int i = 0; i < roadOut2.size(); i++)
        {
            fill(150, 150, 150);
            rect( xPos, yPos, roadOut2.get( i ).getSegmentWidth(), roadOut2.get( i ).getSegmentHeight() );
            fill( 255 );
            text(segmentIndex, xPos, yPos);
            xPos -= roadOut2.get( i ).getSegmentWidth() + 1;
            segmentIndex--;
        }
    }
    //------------------------------------------- Road 2 -------------------------------------------------->

    //------------------------------------------- Road 3 -------------------------------------------------->
    public void drawRoadIn3()
    {
        int segmentIndex = roadIn3.size()-1;
        int xPos = ( width / 2 ) + 10;
        int yPos = 5;

        for(int i = 0; i < roadIn3.size(); i++)
        {
            fill(150, 150, 150);
            rect( xPos, yPos, roadIn3.get( i ).getSegmentWidth(), roadIn3.get( i ).getSegmentHeight() );
            fill( 255 );
            text(segmentIndex, xPos, yPos);
            yPos += roadIn3.get( i ).getSegmentHeight() + 1;
            segmentIndex--;
        }
    }

    public void drawRoadOut3()
    {
        int segmentIndex = 0;
        int xPos = ( width / 2 ) - 10;
        int yPos = 5;

        for(int i = 0; i < roadOut3.size(); i++)
        {
            fill(150, 150, 150);
            rect( xPos, yPos, roadOut3.get( i ).getSegmentWidth(), roadOut3.get( i ).getSegmentHeight());
            fill( 255 );
            text(segmentIndex, xPos, yPos);
            yPos += roadOut3.get( i ).getSegmentWidth() + 1;
            segmentIndex++;
        }
    }
    //------------------------------------------- Road 3 -------------------------------------------------->

    //------------------------------------------- Roundabout ---------------------------------------------->
    public void drawRoundabout()
    {
        // The radius of a circle
        float radius = 92;

        // The width and height of the boxes
        float width = 20;
        float height = 20;

        int segmentIndex = 0;

            translate( this.width / 2, this.height / 2 );

            // We must keep track of our position along the curve
            float arcLength = 0;

            // For every box
            for(int i = 0; i < roundabout.size(); i++)
            {
                // Each box is centered so we move half the width
                arcLength += width / 2;

                // Angle in radians is the arcLength divided by the radius
                float theta = arcLength / radius;

                pushMatrix();
                // Polar to cartesian coordinate conversion
                translate( radius * cos( theta ), radius * sin( theta ) );
                // Rotate the box
                rotate( theta );

                // Display the box
                fill( 150, 150, 150 );
                rectMode( CENTER );
                rect( 0, 0, width, height );
                fill( 255 );
                text(segmentIndex, 1 * cos( theta )-3, 1 * sin( theta )-3);
                segmentIndex++;
                popMatrix();

                // Move halfway again
                arcLength += width / 2;
            }
        }
        //------------------------------------------- Roundabout ---------------------------------------------->

    public void drawCar( Car car, int xPos, int yPos, int carWidth, int carHeight)
    {
        car = new Car( xPos, yPos, carWidth, carHeight );
        fill( 255, 0, 0 );
        rect( car.getxPos(), car.getyPos(), car.getCarWidth(), car.getCarHeight() );
    }
}
