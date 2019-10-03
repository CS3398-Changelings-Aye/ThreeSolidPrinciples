package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

//import threesolid.IWorker;
<<<<<<< HEAD

// Comment to make this visible to Git Desktop
=======
/*
This is an example of single function principle
*/

>>>>>>> 5af38aa5846be4ea405325be2f9e99b4ddba4fc6
public class ThreeSolidMain
{

    public static Manager tsManager = new Manager();

    // The entry main() method
    public static void main(String[] args)
    {

        try
        {
            System.out.format("Starting ... \n");
        }
        catch (Exception main_except)
        {
            main_except.printStackTrace();
        }

        try
        {
            System.out.format("Stopping ... \n");
        }
        catch (Exception main_except)
        {
            main_except.printStackTrace();
        }

        System.exit(0);

    }
}
