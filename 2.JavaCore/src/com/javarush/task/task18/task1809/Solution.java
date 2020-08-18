package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> bytes = new ArrayList<>();

        try
        {
            FileInputStream inputStreamFile = new FileInputStream(consoleReader.readLine());
            String outputStreamFile = consoleReader.readLine();
            FileOutputStream outputStreamToFile = new FileOutputStream(outputStreamFile);

            while (inputStreamFile.available() > 0)
            {
                bytes.add(inputStreamFile.read());
            }

            Collections.reverse(bytes);

            for (Integer i : bytes)
            {
                outputStreamToFile.write(i);
            }

            inputStreamFile.close();
            outputStreamToFile.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
