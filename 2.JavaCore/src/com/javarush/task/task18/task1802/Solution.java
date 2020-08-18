package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<Integer> list = new ArrayList<>();

        try(FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine()))
        {
            while (inputStream.available() > 0) list.add(inputStream.read());
        }

        System.out.println(Collections.min(list));
    }
}
