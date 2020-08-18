package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution
{
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();
    public static String fileName1, fileName2;


    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();

            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName1)));
            while (reader.ready()) allLines.add(reader.readLine());

            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName2)));
            while (reader.ready()) forRemoveLines.add(reader.readLine());

            reader.close();
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }

        Solution solution = new Solution();
        try
        {
            solution.joinData();
        }

        catch (CorruptedDataException e)
        {
            e.printStackTrace();
        }

    }

    public void joinData() throws CorruptedDataException
    {
        if (allLines.containsAll(forRemoveLines)) allLines.removeAll(forRemoveLines);
        else
        {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
