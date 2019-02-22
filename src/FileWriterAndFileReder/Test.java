package FileWriterAndFileReder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String fileName = "plik.txt";

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write("Tekst 1\n");
            fileWriter.write("Tekst 2\n");
            fileWriter.write("Tekst 3\n");
            fileWriter.write("Tekst 4\n");
        } catch (IOException e) {
            System.out.println("Problem z dostępem do pliku");
            e.printStackTrace();
        } finally {
            if (fileWriter == null) {
                System.out.println("Problem");
            } else {
                fileWriter.close();
            }
        }

        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new FileReader(fileName));
            String linia = null;
            do {
                linia = bf.readLine();
                if (linia != null) {
                    System.out.println(linia);
                }
            } while (linia != null);
        } catch (IOException e) {
            System.out.println("Problem z dostępem dopliku");
        } finally {
            if (bf == null) {
                System.out.println("Problem");
            } else {
                bf.close();
            }
        }
    }
}