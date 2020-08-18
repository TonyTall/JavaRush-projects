package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)
    {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        try
        {
            FileInputStream inputStream = new FileInputStream(consoleReader.readLine());
            while (inputStream.available() > 0)
            {
                int asciiSymbol = inputStream.read();
                if (asciiSymbol == 44) count++;
            }

            inputStream.close();
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }

        System.out.println(count);
    }
}
