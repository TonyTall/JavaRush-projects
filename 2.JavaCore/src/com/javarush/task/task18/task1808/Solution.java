package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream outputStream;
        FileOutputStream outputStream2;
        FileInputStream inputStream;

        try
        {
            //File names reading.
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            String file3 = reader.readLine();

            reader.close();

            //Creating inputStream from file1.
            inputStream = new FileInputStream(file1);

            //Creating array of input data.
            byte [] buffer = new byte[inputStream.available()];

            //Creating arrays for output data.
            byte [] bytes1;
            byte [] bytes2;

            //Choosing odd or even. Copying arrays.
            if (buffer.length %2 == 0)
            {
                bytes1 = new byte[buffer.length / 2];
                bytes2 = new byte[buffer.length / 2];

                System.arraycopy(buffer, 0, bytes1, 0, bytes1.length);
                System.arraycopy(buffer, bytes1.length, bytes2, 0, bytes2.length);

                int count = inputStream.read(bytes1);
                outputStream = new FileOutputStream(file2);
                outputStream.write(bytes1,0, count);

                outputStream2 = new FileOutputStream(file3);
                count = inputStream.read(bytes2);
                outputStream2.write(bytes2,0, count);
            }

            else
            {
                bytes1 = new byte[((buffer.length - 1) / 2) + 1];
                bytes2 = new byte[bytes1.length - 1];

                System.arraycopy(buffer, 0, bytes1, 0, bytes1.length);
                System.arraycopy(buffer, bytes1.length, bytes2, 0, bytes2.length);

                int count = inputStream.read(bytes1);
                outputStream = new FileOutputStream(file2);
                outputStream.write(bytes1,0, count);

                outputStream2 = new FileOutputStream(file3);
                count = inputStream.read(bytes2);
                outputStream2.write(bytes2,0, count);
            }
            inputStream.close();
            outputStream.close();
            outputStream2.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
