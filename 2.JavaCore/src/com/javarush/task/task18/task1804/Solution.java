package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        byte [] array = new byte[255];
        int min = 1;

        try (FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine()))
        {
            while (inputStream.available() > 0)
            {
                array[inputStream.read()]++;
            }
        }

//        for (int i = 0; i < array.length; i++)
//        {
//            if (array[i] < min) min = array[i];
//        }

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == min) System.out.print(i + " ");
        }
    }
}
