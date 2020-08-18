package com.javarush.task.task17.task1706;

import java.io.OutputStream;

public class OurPresident
{
    private static OurPresident president;


    private OurPresident()
    {

    }

    public static OurPresident getOurPresident()
    {
        return president;
    }

    static
    {
        synchronized(new OurPresident())
        {
            if (president == null)
            {
                president = new OurPresident();
            }
        }
    }
}
