/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bonus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/**
 *
 * @author Ash
 */
public class QualityCheckStock {
    File filename;
    FileReader fr;
    BufferedReader br;
    String[] words;
    int[] count;
    final String[] wordsToFind = {"Excellent", "Good", "Normal", "Bad", "Horrible"};
    String s;
    QualityCheckStock(){
        try {
            filename = new File("src/TxtFiles/CurrentStock.txt");
            fr = new FileReader(filename);
            br = new BufferedReader(fr);
            count = new int[wordsToFind.length];
            while ((s = br.readLine()) != null) {
                words = s.split(" ");
                for(int i = 0; i < wordsToFind.length; i++){
                    for (String word : words) {
                        if (word.equals(wordsToFind[i])) {
                            count[i]++;
                        }
                    }
                }
            }
            System.out.println("The current stock is:");
            for(int i = 0; i < count.length; i++){
                System.out.println(wordsToFind[i]+": "+count[i]);
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("Could not find file!");
        }
    }
}
