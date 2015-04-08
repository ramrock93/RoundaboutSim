/**
 * Created by Ramin on 25.03.2015.
 */
import processing.core.*;

public class Roundabout extends PApplet
{
    private Car bmw;

    public void setup()
    {
        size(600, 600);
        background( 0, 255, 0 );

       // bmw = new Car(  )
    }

    public void draw()
    {
        stroke( 150, 150, 150 );
        strokeWeight( 50 );
        // Road 1
        line( width/2, 0, width/2, height/2 );
        line( 0, height/2, width, height/2 );

        fill(150, 150, 150);
        arc(width/2, height/2, 200, 200, 0, 2*PI, OPEN);

        fill(200, 200, 200);
        arc(width/2, height/2, 200, 200, 0, 2*PI, OPEN);
    }
}
