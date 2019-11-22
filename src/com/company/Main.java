package com.company;
import java.io.*;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        // PrintWriter object for definitivas.csv
        PrintWriter pw = new PrintWriter("definitivas.csv");

        // BufferedReader object for alumnos.csv
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\josea\\IdeaProjects\\FileMerge\\src\\com\\company\\alumnos.csv"));

        String line = br.readLine();

        // loop to copy each line of
        // alumnos to  definitivas.csv
        while (line != null)
        {
            pw.println(line);
            line = br.readLine();
        }

        br = new BufferedReader(new FileReader("C:\\Users\\josea\\IdeaProjects\\FileMerge\\src\\com\\company\\notas.csv"));

        line = br.readLine();

        // loop to copy each line of
        // notas to  definitivas.csv
        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }

        pw.flush();

        // closing resources
        br.close();
        pw.close();

        System.out.println("Concatenado notas.csv y alumnos.csv a definitivas.csv");
    }
}
