package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws DownloadException
    {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            try
            {
                FileInputStream inputStream = new FileInputStream(consoleReader.readLine());

                    if (inputStream.available() < 1000)
                    {
                        inputStream.close();
                        throw new DownloadException();
                    }
            }

            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static class DownloadException extends Exception
    {

    }
}
