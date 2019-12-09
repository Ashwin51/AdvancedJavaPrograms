/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program1;

import java.io.*;

/**
 *
 * @author Ash
 */
public class SampleStockMaker {
    enum Quality{
        Good("Good"), Average("Average"), Bad("Bad");
        
        private final String qualityString;
        
        Quality(String quality){
            this.qualityString = quality;
        }
    }
    
    private PrintWriter writer;
    private Quality item;
    
    public SampleStockMaker(){
    try{
        writer = new PrintWriter("src/TxtFiles/TestStock.txt", "UTF-8");
        }catch(Exception e){
            System.out.print("Failed to create file");
        }
            item = Quality.valueOf("Good");
            writer.print("Item ID: 1");
            writer.println(" Item Quality: "+item.qualityString);
            item = Quality.valueOf("Average");
            writer.print("Item ID: 2");
            writer.println(" Item Quality: "+item.qualityString);
            item = Quality.valueOf("Bad");
            writer.print("Item ID: 3");
            writer.println(" Item Quality: "+item.qualityString);
        writer.close();
    }
}
