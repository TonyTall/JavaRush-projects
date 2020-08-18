package com.javarush.task.task18.task1803;

/* 
Самые частые байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        byte [] array = new byte[255];
        int max = 0;

        try (FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine()))
        {
            while (inputStream.available() > 0)
            {
                array[inputStream.read()]++;
            }
        }

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max) max = array[i];
        }

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == max) System.out.print(i + " ");
        }
    }
}
