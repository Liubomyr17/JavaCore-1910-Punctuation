package com.company;

/*

1910 Punctuation

Read 2 file names from the console.
The first file contains text.
Read the contents of the first file, delete all punctuation marks, including newlines.
Output the result to the second file.
http://ru.wikipedia.org/wiki/%D0%9F%D1%83%D0%BD%D0%BA%D1%82%D1%83%D0%B0%D1%86%D0%B8%D1 % 8F
Close streams.

Requirements:
1. The program should read the file names from the console (use BufferedReader).
2. BufferedReader must be closed for reading data from the console.
3. The program should read the contents of the first file (use BufferedReader with the FileReader constructor).
4. The stream of reading from the file (BufferedReader) should be closed.
5. The program should write the contents of the first file to the second file, where all punctuation characters, including newline characters, are removed (Use BufferedWriter with the FileWriter constructor to write to the file).
6. The write stream to the file (BufferedWriter) must be closed.


*/

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = conReader.readLine();
        String fileName2 = conReader.readLine();
        conReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));

        while (fileReader.ready()) {
            String s = fileReader.readLine();
            fileWriter.write(s.replaceAll("[\\p{Punct}\\n]",""));
        }
        fileWriter.close();
        fileReader.close();
    }
}






