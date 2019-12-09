/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Ash
 */
public class WordFind {

    final Scanner SCANNER = new Scanner(System.in);
    File filename;
    FileReader fr;
    BufferedReader br;
    String[] words;
    String s, wordToFind;
    boolean found;

    public WordFind() {

        try {
            filename = new File("src/TxtFiles/Top1000Words.txt");
            fr = new FileReader(filename);
            br = new BufferedReader(fr);
            System.out.println("Check if your word is one of the top 1000 words");
            System.out.println("used in English! Your word: ");
            wordToFind = SCANNER.nextLine();
            while ((s = br.readLine()) != null) {
                words = s.split(" ");
                for (String word : words) {
                    if (word.equals(wordToFind)) {
                        System.out.println("Your word is in the top 1000 words used!");
                        found = true;
                    }
                }
            }
            if (!found) {
                System.out.println("Your word is not in the top 1000 words used!");
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("Could not find file!");
        }
    }
}
